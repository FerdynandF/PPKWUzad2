package pl.ferdynand.ui.model;

import pl.ferdynand.ui.model.response.TextDetails;

public class ValidateString {

    public static TextDetails buildTextDetails(String text){
        if(text == null)
            return new TextDetails();
        TextDetails textDetails = new TextDetails();
        textDetails.setHasCapitalLetter(ValidateString.hasCapitalLetter(text));
        textDetails.setHasSmallLetter(ValidateString.hasSmallLetter(text));
        textDetails.setHasNumber(ValidateString.hasNumber(text));
        textDetails.setHasSpecialCharacter(ValidateString.hasSpecialCharacter(text));
        return textDetails;
    }

    private static boolean hasCapitalLetter(String text) {
        boolean hasUpper = text.chars().anyMatch(Character::isUpperCase);
        return hasUpper;
    }

    private static boolean hasSmallLetter(String text) {
        boolean hasSmall = text.chars().anyMatch(Character::isLowerCase);
        return hasSmall;
    }

    private static boolean hasNumber(String text) {
        boolean hasNumber = text.chars().anyMatch(Character::isDigit);
        return hasNumber;
    }

    private static boolean hasSpecialCharacter(String text) {
        long hasSpecial =  text.chars().filter(value -> !Character.isDigit(value) && !Character.isLetter(value)).count();
        return hasSpecial > 0;
    }
}

