package entities;

public class Transaction {

    private int id;
    private String transactionName;
    private boolean isEarning;
    private double value;

    public Transaction(String transactionName, boolean isEarning, double value) {
        this.transactionName = transactionName;
        this.isEarning = isEarning;
        this.value = value;
    }

    public Transaction(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTransactionName() {
        return transactionName;
    }
    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }
    public boolean isEarning() {
        return isEarning;
    }
    public void setEarning(boolean isEarning) {
        this.isEarning = isEarning;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    

}
