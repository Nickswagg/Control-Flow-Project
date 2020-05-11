public class AsciiChars {

    public static void printNumbers() {
        // TODO: print valid numeric input
        int i;
        for (i = 48; i < 58; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }
    }

    public static void printLowerCaseLetters() {
        // TODO: print valid lowercase alphabetic input
        int i;
        for (i = 97; i <= 122; i++) {
            char asciiChar = (char) i;
            System.out.println(" The ASCII value of " + asciiChar + " is = " + i);
        }
    }

    public static void printUpperCaseLetters() {
        // TODO: print valid uppercase alphabetic input
        int i;
        for (i = 65; i <= 90; i++) {
            char asciiChar = (char) i;
            System.out.println(" The ASCII value of " + asciiChar + " is = " + i);
        }
    }

}