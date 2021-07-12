package com.sportstop.customAnnotations.Password;

import org.passay.*;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PasswordConstraintValidator implements ConstraintValidator<ValidatePassword,String> {

    @Override
    public void initialize(ValidatePassword validPassword){

    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        PasswordValidator passwordValidator = new PasswordValidator(
                Arrays.asList(
                        new LengthRule(8,30),
                        new CharacterRule(EnglishCharacterData.Special, 1),
                        new CharacterRule(EnglishCharacterData.UpperCase, 1),
                        new CharacterRule(EnglishCharacterData.LowerCase, 1),
                        new WhitespaceRule()
                ));
       RuleResult ruleResult  =  passwordValidator.validate(new PasswordData(password));
       if ( ruleResult.isValid()){
         return true;
       }

       //Collect all the validation messages in a string
        String validationMessages  = passwordValidator.getMessages(ruleResult).stream().collect(Collectors.joining(","));

        constraintValidatorContext.buildConstraintViolationWithTemplate
                (validationMessages).addConstraintViolation().disableDefaultConstraintViolation();

        return false;
    }


}
