package PrimeStrings;

public class PrimeStrings {
    /*
    A string is prime if it can't be constructed by concatenating multiple
    (more than 1) equal strings

    Eg:
    xyxy == xy + xy -> not prime
    abac is prime

    ==> so... does this mean strings with odd length is prime?
    ==> FAILED -> Over 30'
    ==> Also, how the fuck to do this one :v.
     */

    public static String check(String str) {
        if (str == null || str.length() == 0)
            return "Invalid";

        if (str.length() == 1 || (str.length() > 2 && str.length() % 2 != 0))
            return "prime";

        int d = str.length();
        while (true) {
            d /= 2;
            break;
        }

        return "not prime";
    }
}
