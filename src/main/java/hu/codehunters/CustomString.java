package hu.codehunters;

public class CustomString {

    private char[] szoveg;

    public CustomString(char[] input) {
        this.szoveg = input;
    }

    public CustomString replace(char mit, char mire) {
        //char[] resultCharArray = this.szoveg.clone();
        char[] resultCharArray = new char[szoveg.length];
        for (int i = 0; i < this.szoveg.length; i++) {
            if (this.szoveg[i] == mit) {
                resultCharArray[i] = mire;
            } else {
                resultCharArray[i] = this.szoveg[i];
            }
        }
        return new CustomString(resultCharArray);
    }

    public CustomString concat(CustomString text) {
        char[] resultCharArray = new char[this.szoveg.length + text.length()];
        for (int i = 0; i < this.szoveg.length; i++) {
            resultCharArray[i] = this.szoveg[i];
        }
        for (int i = 0; i < text.length(); i++) {
            resultCharArray[i + this.szoveg.length] = text.getSzoveg()[i];
        }
        return new CustomString(resultCharArray);
    }

    public CustomString toUppercase() {
        char[] resultCharArray = new char[szoveg.length];
        for (int i = 0; i < this.szoveg.length; i++) {
            resultCharArray[i] = Character.toUpperCase(this.szoveg[i]);
        }
        return new CustomString(resultCharArray);

    }

    public int length() {
        return szoveg.length;
    }

    public char[] getSzoveg() {
        return this.szoveg;
    }
}
