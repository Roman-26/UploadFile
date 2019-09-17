package com.alexcompany.springvalidation59;

import com.alexcompany.springvalidation59.service.StorageService;
import com.alexcompany.springvalidation59.serviceImplemet.storage.StorageProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Springvalidation59Application {

    @PostConstruct
    void started(){
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String[] args) {
        SpringApplication.run(Springvalidation59Application.class, args);
    }

    CommandLineRunner init(StorageService storageService){
      return (args -> {
        storageService.deleteAll();
        storageService.init();
      });
    }
}
