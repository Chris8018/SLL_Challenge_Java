package Paranoia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Paranoia {
    /*
    Find inconsistency of money transfer in a log

    in the log for test case, April and July is unusual.

    ==> FAILED BADLY
    ==> I have done this for over 1hr
     */

    public static String check(List<TransactionInfo> log) {
        Map<String, Integer> monthlyExpense = parseToMonthlyExpense(log);
        showMonthlyExpense(monthlyExpense);

        var result = "Nothing unusual";

        int average = monthlyExpense.values().stream().reduce(0, Integer::sum) / monthlyExpense.size();

        for (String month : monthlyExpense.keySet())
            if (monthlyExpense.get(month) >= average)
                result = month + " is unusual";

        return result;
    }

    private static void showMonthlyExpense(Map monthlyExpense) {
        monthlyExpense.forEach((k, v) -> System.out.println("Month: " + k + " Total: " + v));
    }

    private static Map parseToMonthlyExpense(List<TransactionInfo> log) {
        var currentMonth = "";
        var monthlyExpense = new HashMap<String, Integer>();

        for (var logInfo : log) {
            if (currentMonth.equals("") || !currentMonth.equals(logInfo.getMonth()))
                currentMonth = logInfo.getMonth();

            if (monthlyExpense.containsKey(currentMonth)) {
                monthlyExpense.put(currentMonth, monthlyExpense.get(currentMonth) + logInfo.getAmount());
            } else {
                monthlyExpense.put(currentMonth, logInfo.getAmount());
            }
        }

        return monthlyExpense;
    }
}
