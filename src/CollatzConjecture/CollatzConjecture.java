package CollatzConjecture;

public class CollatzConjecture {
    /*
    Collatz Conjecture (or Ulam conjecture/the Syracuse problem)
    Unsolved mathematical problem, which is very easy to formulate -> ???
    1. Take any natural number
    2. It it's even, half ig, otherwise triple it and add one
    3. Repeat step 2, until you reach 4, 2, 1 sequence
    4. You will ALWAYS reach 1, eventually

    Eg:
    x = 17

    17*3 + 1 = 52
    52/2 = 26
    26/2 = 13
    13*3 + 1 = 40
    40/2 = 20
    20/2 = 10
    10/2 = 5
    5*3 + 1 = 16
    16/2 = 8
    8/2 = 4
    4/2 = 2
    2/2 = 1
    1*3 + 1 = 4
    ...
    4, 2, 1 is an infinitely repeating loop

    Bonus Point for printing out how many step for it to get to 1.
     */

    public static int stepCount(int n) {
        return stepCount(n, 0);
    }

    private static int stepCount(int n, int step) {
        if (n == 1) {
            printOnConsole(n, step);
            return step;
        }

        step += 1;
        if (isEven(n)) {
            n /= 2;
            printOnConsole(n, step);
            return stepCount(n, step);
        }

        n = n*3 + 1;
        printOnConsole(n, step);
        return stepCount(n, step);
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    private static void printOnConsole(int n, int step) {
        System.out.println("Num: " + n + " Step: " + step);
    }
}
