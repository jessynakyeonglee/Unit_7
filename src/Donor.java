public class Donor {
    private String name;
    private double amount;

    public Donor(String name,double amount){
        this.name = name;
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String toString() {
        return name+amount;
    }
}
