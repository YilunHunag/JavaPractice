package JavaPractice;

public class DepositInfo {
    private String accountId;
    private double amount;

    public DepositInfo(String accountId, double amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "帳戶: " + accountId + " 成功存入 $" + amount;
    }
}
