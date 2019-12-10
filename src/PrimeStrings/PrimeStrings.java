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

    ***I can basically done by create new repetitive string from sub string than compare :v
     */

    public static String check(String str) {
        if (str == null || str.length() == 0)
            return "Invalid";

        if (str.length() == 1 || (str.length() > 2 && str.length() % 2 != 0))
            return "prime";

        for (int i = 1; i <= str.length()/2; i++) {
            var subStr = str.substring(0, i);
            var repetiveStr = subStr.repeat(str.length()/subStr.length());
            if (str.equals(repetiveStr))
                return "not prime";
        }

        return "prime";
    }
}
