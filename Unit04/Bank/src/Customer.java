import java.util.ArrayList;
import java.util.List;

/**
 * Created by Osama Halabi on 2020/09/20.
 */
public class Customer {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private Address address;
    //each customer has many accounts? how to create this
    private List<Account> accounts;

    public Customer(int id, String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        accounts = new ArrayList<>();
    }

    public Customer(int id, String firstname, String lastname, String email, Address address) {
        this(id, firstname, lastname, email);
        this.address = address;
    }

    //add accounts
    public void addAccount(Account account) {
        accounts.add(account);
    }

    //remove account
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // how many accounts?
    public int getAccountCount() {
        return accounts.size();
    }

    // calculate the total balance for all accounts
    public double getTotalBalance () {
        double totalBalance = 0;
        for (var acct:accounts) {
            if (acct != null) {
                totalBalance += acct.getBalance();
            }
        }
        return totalBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
