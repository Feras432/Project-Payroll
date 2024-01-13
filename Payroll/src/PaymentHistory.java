public class PaymentHistory {

    public double amount;
    public String payMethod;

    public PaymentHistory(double amount, String payMethod) {

        this.amount = amount;
        this.payMethod = payMethod;

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }
}