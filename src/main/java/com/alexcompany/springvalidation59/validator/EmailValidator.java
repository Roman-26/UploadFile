package com.alexcompany.springvalidation59.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<EmailConstraint, String> {

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email.length() > 5 && email.length() < 100 && email.contains("@") && email.contains(".");
    }

    @Override
    public void initialize(EmailConstraint constraintAnnotation) {

    }
}
