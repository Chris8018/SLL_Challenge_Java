package StrangeRoot;

public class StrangeRoot {
    /*
    A number has a strange root if its square and square root share any digit
    Eg: 2 is strange root because sqrt of 2 is 1.414 and it contains 4 (which is sq of 2)
    Float precision: 3
     */

    public static boolean check(int n) {
        String sqrtNum = String.format("%.3f", Math.sqrt(n));
        String sqNum = String.format("%.0f", Math.pow(n, 2));

        return check(sqrtNum, sqNum);
    }

    private static boolean check(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '.' && b.indexOf(a.charAt(i)) != -1)
                return true;
        }

        return false;
    }
}
