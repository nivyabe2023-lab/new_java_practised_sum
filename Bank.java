import java.util.*;
public class Bank {
    private String accountholder;
    private double balance;

public void setaccountholder(String accountholder){
    this.accountholder = accountholder;
    System.out.println("accountholder:"+this.accountholder);
}
public void deposit(int deposit_amount){
        if(deposit_amount>0){
    balance = balance+deposit_amount;
    }
    else{
        System.out.println("Deposit amount must be greater than zero.");
    }
    System.out.println("Balance after deposit: " + balance);
}
public void withdraw(int withdraw_amount){
    if(withdraw_amount <= balance){
        balance = balance - withdraw_amount;
        System.out.println("Balance after withdrawal: " + balance);
    }
    else{
        System.out.println("Insufficient balance.");
    }
    System.out.println("Balance:"+balance);
}
    public void getbalance(){
        this.balance = balance;
    System.out.println("Balance:"+this.balance);
    }
    public void getaccountholder(String accountholder){
        this.accountholder = accountholder;
    }

public static void main(String[]args){
    Bank b = new Bank();
    b.setaccountholder("Nivya");
    b.getbalance();
    b.deposit(1000);
    b.withdraw(100);

}}
