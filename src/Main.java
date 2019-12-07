import PasswordValidator.PasswordValidator;
import RemoveSpaceFromString.RemoveSpaceFromString;
import CollatzConjecture.CollatzConjecture;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
//        System.out.println("Hello world");
//        challenge1();
//        challenge2();
        challenge3();
    }

    private static void challenge1() {
        /*
        Sololearn -> F
        John Doe -> F
        $ololearn7 -> T
         */

        var testCase = new ArrayList<String>();
        testCase.add("Sololearn");
        testCase.add("John Doe");
        testCase.add("$ololearn7");

        for (String str : testCase) {
            System.out.println("Case \"" + str + "\": " + PasswordValidator.validate(str));
        }
    }

    private static void challenge2() {
        String input = "ab c d e fgh i j kl mn opqr stuvwxyz";
        System.out.println("Input: " + input);
        System.out.println("Output: " + RemoveSpaceFromString.removeSpace(input));
    }

    private static void challenge3() {
        CollatzConjecture.stepCount(30);
    }
}
