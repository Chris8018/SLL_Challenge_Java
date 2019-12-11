import CalculateTheDistance.CalculateTheDistance;
import CubeRoot.CubeRoot;
import GapfulNumbers.GapfulNumbers;
import Paranoia.Paranoia;
import Paranoia.TransactionInfo;
import PasswordValidator.PasswordValidator;
import PrimeStrings.PrimeStrings;
import RemoveSpaceFromString.RemoveSpaceFromString;
import CollatzConjecture.CollatzConjecture;
import StrangeRoot.StrangeRoot;
import SummationsCalculator.SummationsCalculator;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String args[]) {
//        System.out.println("Hello world");
//        challenge1();
//        challenge2();
//        challenge3();
//        challenge4();
//        challenge5();
//        challenge6();
//        challenge7();
//        challenge8();
//        challenge9();
        cha1lenge10();
    }

    private static void cha1lenge10() {
        var testCases = new ArrayList<Point>();
        testCases.add(new Point(2,2));
        testCases.add(new Point(2,-4));
        testCases.add(new Point(5,1));
        testCases.add(new Point(9,4));
        testCases.add(new Point(3,3));
        testCases.add(new Point(0,0));

        var testResult = new double[] {6d, 5d, 4.24};

        for (int i = 0; i < testCases.size(); i+=2) {
            Point a = testCases.get(i);
            Point b = testCases.get(i+1);
            double result = Double.valueOf(String.format("%.2f", CalculateTheDistance.calculate(a, b)));
            boolean isCorrect = result == testResult[i/2];
            System.out.printf("Distance between %s and %s: %.4f -> Is correct: %b%n", a.toString(), b.toString(), result, isCorrect);
        }
    }

    private static void challenge9() {
        var testCases = new HashMap<Integer, Boolean>();
        testCases.put(11, true);
        testCases.put(24, false);
        testCases.put(2, true);

        for (int input : testCases.keySet()) {
            var output = StrangeRoot.check(input);
            var check = testCases.get(input).equals(output);
            System.out.println("Input: " + input + " Output: " + output + " -> Is Correct: " + check);
        }
    }

    private static void challenge8() {
        var testCases = new HashMap<String, String>();
        testCases.put("xyxy", "not prime");
        testCases.put("aaaa", "not prime");
        testCases.put("hello", "prime");
        testCases.put("ababa", "prime");
        testCases.put("aabaab", "not prime");

        for (String input : testCases.keySet()) {
            var output = PrimeStrings.check(input);
            var check = testCases.get(input).equals(output);
            System.out.println("Input: " + input + " Output: " + output + " -> Is Correct: " + check);
        }
    }

    private static void challenge7() {
        var testCases = new HashMap<Double, Double>();
        testCases.put(729d, 9d);
        testCases.put(41d, 3.4482);
        testCases.put(2d, 1.2599);

        for (Double input : testCases.keySet()) {
            var output = CubeRoot.cubeRoot(input);
            var check = testCases.get(input) == output;
            System.out.println("Input: " + input + " Output: " + output + " -> Is Correct: " + check);
        }
    }

    private static void challenge6() {
        var testCases = new HashMap<String, Integer>();
        testCases.put("2 4 *2", 18);
        testCases.put("1 5 %2", 3);

        for (String input : testCases.keySet()) {
            var output = SummationsCalculator.calculate(input);
            var check = testCases.get(input) == output;
            System.out.println("Input: " + input + " Output: " + output + " -> Is Correct: " + check);
        }
    }

    private static void challenge5() {
        var log1 = new ArrayList<TransactionInfo>();
        log1.add(new TransactionInfo("Feb SLR 4 M"));
        log1.add(new TransactionInfo("Feb ENT 800 K"));
        log1.add(new TransactionInfo("Mar SLR 4000 K"));
        log1.add(new TransactionInfo("Mar ENT 800 K"));
        log1.add(new TransactionInfo("Apr SLR 4010 K"));
        log1.add(new TransactionInfo("Apr ENT 810 K"));

        var log2 = new ArrayList<TransactionInfo>();
        log2.add(new TransactionInfo("Jul SLR 4 M"));
        log2.add(new TransactionInfo("Jul ENT 800 K"));
        log2.add(new TransactionInfo("Jul OTR 1200 K"));
        log2.add(new TransactionInfo("Aug SLR 4000 K"));
        log2.add(new TransactionInfo("Aug ENT 800 K"));
        log2.add(new TransactionInfo("Aug OTR 1190 K"));
        log2.add(new TransactionInfo("Sep SLR 4000 K"));
        log2.add(new TransactionInfo("Sep ENT 800 K"));
        log2.add(new TransactionInfo("Sep OTR 1190 K"));

        System.out.println("Log 1 result: " + Paranoia.check(log1) + "\n");
        System.out.println("Log 2 result: " + Paranoia.check(log2) + "\n");
    }

    private static void challenge4() {
        var testCases = new HashMap<Integer, Boolean>();
        testCases.put(192, true);
        testCases.put(583, true);
        testCases.put(210, false);

        testCases.entrySet().stream().forEach(item -> {
            var value = item.getKey();
            var result = GapfulNumbers.check(value);
            var checkResult = result == item.getValue();
            System.out.println(value + " is a Gapful number: " + result + " -> Is correct: " + checkResult);
        });
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
