package RemoveSpaceFromString;

public class RemoveSpaceFromString {
    /*
    Given String as input, output it w/o space

    ab c d e fgh i j kl mn opqr stuvwxyz
    => abcdefghijklmnopqrstuvwxyz
     */

    public static String removeSpace(String str) {
        return str.replaceAll(" ", "");
    }
}
