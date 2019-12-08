package GapfulNumbers;

public class GapfulNumbers {
    /*
    Gapful number is a number of at least 3 digits that is divisable
    by number formed by 1st and last of the original number.

    192 -> T
    582 -> T
    210 -> F

    Finish in 33'
     */

    public static boolean check(int n) {
        var strNum = Integer.toString(n);

        if (strNum.length() < 3) {
            return false;
        }

        // Forgive my poor Eng :v
        var dividingNum = Integer
                .parseInt(new StringBuilder()
                        .append(strNum.charAt(0))
                        .append(strNum.charAt(strNum.length() - 1))
                        .toString());

        return n % dividingNum == 0;
    }
}
