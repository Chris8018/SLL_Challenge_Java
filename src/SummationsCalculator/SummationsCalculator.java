package SummationsCalculator;

public class SummationsCalculator {
    /*
    Takes 3 inputs:
    1. A lower bound
    2. An upper bound
    3. An expression

    Calculate the sum of the range based on the given expression and output result

    Input: 2 4 *2
    Output: 18 (2*2 + 3*2 + 4*2)

    Input: 1 5 %2
    Output: 3 (1%2 + 2%2 + 3%2 + 4%2 + 5%2)

    ==> Although unnecessary, it would be cool if I can use reflection here
    ==> I will only aim for simple expression - 1 level
     */

    public static int calculate(final String input) {
        var splitInput = input.split(" ");

        if (splitInput.length < 3)
            throw new ArrayIndexOutOfBoundsException("Invalid input");

        var lowerBound = Integer.parseInt(splitInput[0]);
        var upperBound = Integer.parseInt(splitInput[1]);
        var arithmeticSymbol = splitInput[2].split("")[0];
        var number = Integer.parseInt(splitInput[2].replace(arithmeticSymbol, ""));

        double result = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            result += arithmeticOperation(i, number, arithmeticSymbol);
        }
        return (int)result;
    }

    private static double arithmeticOperation(double a, double b, String symbol) {
        switch (symbol) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "%":
                return a % b;
        }

        return 0;
    }
}
