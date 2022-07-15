package com.bbrick.auth.comn.validation.validator;

import com.bbrick.auth.comn.validation.annotation.UserNameForamt;
import com.bbrick.auth.comn.validation.checker.UserNameFormatChecker;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserNameValidator implements ConstraintValidator<UserNameForamt, String> {
    private boolean nullable = false;


    @Override
    public void initialize(UserNameForamt constraintAnnotation) {
        this.nullable = constraintAnnotation.nullable();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (nullable) {
            return true;
        }

        return UserNameFormatChecker.check(value);
    }
}
