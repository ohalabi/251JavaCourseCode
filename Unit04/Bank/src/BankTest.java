/**
 * Created by Osama Halabi on 2020/09/20.
 */
public class BankTest {
    public static void main(String[] args) {
        Address ahmedAddress = new Address("123 University Street", "Doha", "Qatar");
        Customer ahmedCustomer = new Customer(123, "Ahmed", "AlAli", "ahmed@qu.edu.qa", ahmedAddress);

        //create accounts
        Account ahmedAcct1 = new Account(111, "Saving", 5000, ahmedCustomer);
        Account ahmedAcct2 = new Account(222, "Current", 1000, ahmedCustomer);
        Account ahmedAcct3 = new Account(333, "Cheque", 3000, ahmedCustomer);
        Account ahmedAcct4 = new Account(444, "Travel", 500, ahmedCustomer);

        //add accounts to customer
        ahmedCustomer.addAccount(ahmedAcct1);
        ahmedCustomer.addAccount(ahmedAcct2);
        ahmedCustomer.addAccount(ahmedAcct3);
        ahmedCustomer.addAccount(ahmedAcct4);

        displayCustomerTotalAccounts(ahmedCustomer);

        System.out.println(ahmedAcct1.deposit(500));
        displayCustomerTotalAccounts(ahmedCustomer);

        System.out.println(ahmedAcct2.withdraw(1000));
        displayCustomerTotalAccounts(ahmedCustomer);

        //check if two accounts are same
        System.out.println("Account NO: " + ahmedAcct1.getAccountNo() + " balance is " + ahmedAcct1.getBalance());
        Account ahmedAcct5 = new Account(111, "Saving", 5500, ahmedCustomer);

        if (ahmedAcct1.equals(ahmedAcct5)) {
            System.out.println("two objects have same values");
        } else {
            System.out.println("two objects do not have the same values");
        }

    }

    private static void displayCustomerTotalAccounts(Customer ahmedCustomer) {
        System.out.println("Welcome " + ahmedCustomer.getFirstname() + " " + ahmedCustomer.getLastname() +
                " Your " + ahmedCustomer.getAccountCount() +
                " accounts balance is: " + ahmedCustomer.getTotalBalance());
    }
}
