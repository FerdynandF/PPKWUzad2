package pl.ferdynand.ui.model.response;

public class ValidateString {

    public static TextDetails buildTextDetails(String text) {
        TextDetails textDetails = new TextDetails();
        textDetails.setHasNumber(true);
        textDetails.setHasSmallLetter(true);
        return textDetails;
    }

    public static String tellVariableType(String value) {
        StringBuilder response = new StringBuilder();
        if (value.length() == 0)
            return "Null";
        ValidateString validate = new ValidateString();
        if (validate.stoi(value))
            return "Integer";
        if (validate.stod(value))
            return "Double";
        if (validate.isBoolean(value))
            return "Boolean";
        if (value.matches("[A-Za-z0-9]+"))
            response.append("Alphanumeric ");
        else
            response.append("Not Alphanumeric ");
        if (validate.allUpperCase(value))
            response.append("String Upper Case ");
        if (validate.allLowerCase(value))
            response.append("String Lower Case ");
        return response.toString();
    }

    private boolean allUpperCase(String value) {
        String tmp = String.copyValueOf(value.toCharArray());
        return value.equals(tmp.toUpperCase());
    }

    private boolean allLowerCase(String value) {
        String tmp = String.copyValueOf(value.toCharArray());
        return value.equals(tmp.toLowerCase());
    }

    private boolean stoi(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean stod(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isBoolean(String str) {
        return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false");
    }
}
