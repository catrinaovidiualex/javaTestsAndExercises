package ClassVsInstanceMethod;

public class BankAccount {
    //private double balance; // instance field

    private static double balance; // instance field

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balanceAcc){
        this.balance=balanceAcc;
    }

}
