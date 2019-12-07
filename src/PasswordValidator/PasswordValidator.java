package PasswordValidator;

public class PasswordValidator {
    /*
    This is the 1st challenge I am going to do today

    Validates passwords to mach specific rules.
    Eg: the min length of password must be 8 chars long and it should have at least one uppercase letter in it.

    RULE:
    Min Length: 5
    Max Length: 10;
    Contains AT LEAST 1 number
    Contains AT LEAST one special character
    NOT contain space

    ==> FAILED!! I check this for 37'
    ==> Will complete this later ==> LOL!! I forgot NOT
     */

    public static boolean validate(String password) {
        return checkLength(password.length()) &&
                noSpace(password) &&
                containsNum(password) &&
                containsSpecialChar(password);
    }

    private static boolean checkLength(int length) {
        return length >= 5 && length <=10;
    }

    private static boolean noSpace(String str) {
        return !str.contains(" ");
    }

    private static boolean containsNum(String str) {
        return str.matches(".*[0-9].*");
    }

    private static boolean containsSpecialChar(String str) {
        return str.matches(".*[`~!@#$%^&*()\\\\-_=+\\\\\\\\|\\\\[{\\\\]};:'\\\",<.>/?].*");
    }
}
