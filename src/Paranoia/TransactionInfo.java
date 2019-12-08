package Paranoia;

public class TransactionInfo {

    private final String month;
    /**
     * SLR - Salary
     * ENT - Entertainment
     * OTR - Other
     */
    private final String reason;
    private final int amount; // Will be INT for now

    public String getMonth() {
        return month;
    }

    public String getReason() {
        return reason;
    }

    public int getAmount() {
        return amount;
    }

    public TransactionInfo(final String logMess) {
        var splitMess = logMess.split(" ");
        if (splitMess.length < 4)
            throw new ArrayIndexOutOfBoundsException();
        this.month = splitMess[0];
        this.reason = splitMess[1];
        this.amount = convertToRightAmount(splitMess[2], splitMess[3]);
    }

    /**
     * K - thousand
     * M - Million
     * B - Billion
     * @param amount
     * @param prefix
     * @return
     */
    private int convertToRightAmount(String amount, String prefix) {
        var result = Integer.parseInt(amount); // Will need to catch Exception here

        switch (prefix.toUpperCase())
        {
            case "K":
                result *= 1_000;
                break;
            case "M":
                result *= 1_000_000;
                break;
            case "B":
                result *= 1_000_000_000;
                break;
        }

        return result;
    }

    @Override
    public String toString() {
        return "Month: " + this.month + " Reason: " + this.reason + " Amount: " + this.amount;
    }
}
