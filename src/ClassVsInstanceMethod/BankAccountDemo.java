package ClassVsInstanceMethod;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount a= new BankAccount();
        a.setBalance(195.15);

        BankAccount b= new BankAccount();
        b.setBalance(200.45);

        BankAccount c= new BankAccount();
        c.setBalance(666.999);

        System.out.println("First: $"+a.getBalance());
        System.out.println("Second: $"+b.getBalance());


    }
}
