import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(int year,int month, int date) {
        this.dateCreated = new Date(year,month,date);
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate/12;
    }

    public double withdraw(){
        double withdraw = this.balance * getMonthlyInterestRate();
        this.balance = this.balance - withdraw;
        return withdraw;
    }

    public double deposit(double deposit){
        return (this.balance + deposit);
    }
}
