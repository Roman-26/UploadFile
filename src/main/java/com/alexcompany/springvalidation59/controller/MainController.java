package com.alexcompany.springvalidation59.controller;

import com.alexcompany.springvalidation59.model.User;
import com.alexcompany.springvalidation59.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserService userService;
    private static final int TOTAL = 3;

    @RequestMapping(value = {"/", "/index"})
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/userList/{page}/{sorting}")
    public String home(@PathVariable("page") int page, Model model,
                       @PathVariable("sorting") String sorting){
        model.addAttribute("userList",
                userService.findAll(PageRequest.of(page-1, TOTAL, Sort.by(sorting))).getContent());
        return "home";
    }

    @RequestMapping(value = "/userTest1", method = RequestMethod.GET)
    public @ResponseBody List<User> userTest1(@RequestParam("phone") String phone,
                                              @RequestParam("email") String email){
        return userService.findAllByPhoneOrEmail(phone, email);
    }

}
