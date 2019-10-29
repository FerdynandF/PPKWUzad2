package pl.ferdynand.ui.model.response;

public class TextDetails {
    private boolean hasCapitalLetter;
    private boolean hasSmallLetter;
    private boolean hasNumber;
    private boolean hasSpecialCharacter;

    public boolean isHasCapitalLetter() {
        return hasCapitalLetter;
    }

    public TextDetails setHasCapitalLetter(boolean hasCapitalLetter) {
        this.hasCapitalLetter = hasCapitalLetter;
        return this;
    }

    public boolean isHasSmallLetter() {
        return hasSmallLetter;
    }

    public TextDetails setHasSmallLetter(boolean hasSmallLetter) {
        this.hasSmallLetter = hasSmallLetter;
        return this;
    }

    public boolean isHasNumber() {
        return hasNumber;
    }

    public TextDetails setHasNumber(boolean hasNumber) {
        this.hasNumber = hasNumber;
        return this;
    }

    public boolean isHasSpecialCharacter() {
        return hasSpecialCharacter;
    }

    public TextDetails setHasSpecialCharacter(boolean hasSpecialCharacter) {
        this.hasSpecialCharacter = hasSpecialCharacter;
        return this;
    }
}
