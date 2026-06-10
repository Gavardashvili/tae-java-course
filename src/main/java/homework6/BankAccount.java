/** @author Lizi Gavardashvili*/
package homework6;

public class BankAccount {
    private String owner;
    private double balance;
    public BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
        }else {
            System.out.println("არასწორი თანხა");
        }
    }
    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("არასაკმარისი თანხა");

        }else if(amount <= 0){
            System.out.println("არასწორი თანხა");

        }else {
            balance -= amount;
        }
    }
    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Lizi",100);
        acc.deposit(50);
        System.out.println(acc.getBalance());
    }
}
