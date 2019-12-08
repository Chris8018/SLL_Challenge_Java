package CubeRoot;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.OptionalDouble;
import java.util.Random;

public class CubeRoot {
    /*
    a cube root of a num x is a number such that
    y*y*y == x

    Write a code to find the cube root of a number N to a precision of 0.0001 w/o standard function

    SHITTT!!!
    This sound simple but since it needs some precision so
    doing it the conventional way will result in really bad performance

    FORMULA (https://www.expertsadvice.org/2018/05/cube-root-perfect-cubes-instantly-non-perfect-cubes-easily.html):
                                             |
                                             |
                                             |
                                             V
                                             WRONG FORMULA
    ((n-1)/x + N/x)/n ==> Wrong MOTHERFUCKING Formula

    CORRECT FORMULA: ((2*x) + N/(x^2))/n

    Here N = given number
    x = guess of approximate square root
    n = index of root, For square root it will be 2 and for cube root it will be 3

    ==> FAILED!! Took too long for research
    ==> I give up!! Will try some answer from SoloLearn
    ==. Try answer from Wang
     */
    private static DecimalFormat df = new DecimalFormat("#.####");

    public static double cubeRoot(double num) {
        // Mainly for num >= 1
        df.setRoundingMode(RoundingMode.DOWN);
        double cu = 0;
        for (int i=1; cubed(i) <= num; i++) {
            int temp = (int)cubed(i);

            cu = (double) i;
            if (temp == num)
                return cu;
        }

        double p=0;
        while (!validate(num, cu, p)) {
            p+=0.00001;
        }

        return Double.valueOf(df.format(cu + p));
    }

    private static double cubed(double n) {
        return n*n*n;
    }

    private static int cubed(int n) {
        return n*n*n;
    }

    private static boolean validate(double cubed, double cubeRoot, double precision) {
        return cubed - cubed(cubeRoot + precision) <= 0;
    }
}
