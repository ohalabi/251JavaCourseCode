/**
 * Created by Osama Halabi on 2020/09/20.
 */
public class Account {

    private final int accountNo;
    private final String type;
    private double balance; // by default is 0
    private Customer customer;

    // new account where the balance is 0
    public Account(int accountNo, String type, Customer customer) {
        this.accountNo = accountNo;
        this.type = type;
        this.customer = customer;
    }

    //new account with initial deposit
    public Account(int accountNo, String type, double balance, Customer customer) {
        this(accountNo, type, customer);
        deposit (balance);
    }
    //deposit
    public String deposit (double amount) {
        balance += amount;
        return String.format("%.2f deposited to your account No: %d %nYour new balance is %.2f%n", amount, accountNo, balance);
    }
    //withdrawal
    public String withdraw (double amount) {
        balance -= amount;
        return String.format("%.2f withdrawn from your account No: %d %nYour new balance is %.2f%n", amount, accountNo, balance);
    }

    public boolean equals(Account acct) {
        return (this.accountNo == acct.getAccountNo() &&
                this.customer.getId() == acct.getCustomer().getId() &&
                this.type.equals(acct.getType())  &&
                this.balance == acct.getBalance());
    }

    public int getAccountNo() {
        return accountNo;
    }


    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
