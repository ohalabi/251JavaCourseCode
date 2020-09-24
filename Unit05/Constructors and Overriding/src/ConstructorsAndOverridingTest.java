/**
 * Created by Osama Halabi on 2020/09/24.
 */

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }
}

class CommissionEmployee extends Person {
    double commission;
    double sales;

    public CommissionEmployee(String name, double commission, double sales) {
        super(name); //call superclass constructor
        this.commission = commission;
        this.sales = sales;
    }

    public double getPayAmount() {
        return sales * commission;
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    public double salary;

    public BasePlusCommissionEmployee(String n, double c, double s, double salary) {
        super(n, c, s); //call superclass constructor
        this.salary = salary;
    }

    @Override
    public double getPayAmount() {
        return salary + sales * commission;
    }
}

public class ConstructorsAndOverridingTest {
    public static void main(String[] args) {
        CommissionEmployee ce = new CommissionEmployee("Ali", 0.2, 600);
        BasePlusCommissionEmployee baseCE = new BasePlusCommissionEmployee("Omar", 0.1, 600, 1000);

        System.out.printf("%s %.2f %.2f %n", ce.name, ce.commission, ce.sales);
        System.out.printf("%s %.2f %.2f %.2f %n", baseCE.name, baseCE.commission, baseCE.sales, baseCE.salary);

        System.out.printf("Ali's Salary: %.2f %n", ce.getPayAmount());
        System.out.printf("Omar's Salary: %.2f %n", baseCE.getPayAmount());
    }
}
