package a3;

import java.util.*;

class Customer {
    // Private attributes
    private String name;
    private double balance;

    // Parameterized constructor
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // toString method to return name and balance
    @Override
    public String toString() {
        return "Name: " + name + ", Balance: $" + balance;
    }

    // Method to add a percentage increase to the balance
    public void addPercentage(double percentage) {
        balance += balance * (percentage / 100);
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

public class a31 {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer[] customers = new Customer[6];

        // Input 6 customer details
        for (int i = 0; i < customers.length; i++) {
            System.out.print("Enter name for customer " + (i + 1) + ": ");
            String name = input.nextLine();
            System.out.print("Enter balance for customer " + (i + 1) + ": ");
            double balance = input.nextDouble();
            input.nextLine();  // consume newline
            customers[i] = new Customer(name, balance);
        }

        // 1. Display customers with balance less than $150
        System.out.println("Customers with balance less than $150:");
        for (Customer customer : customers) {
            if (customer.getBalance() < 150) {
                System.out.println(customer);
            }
        }

        // 2. Calculate and display average balance
        double totalBalance = 0;
        for (Customer customer : customers) {
            totalBalance += customer.getBalance();
        }
        double averageBalance = totalBalance / customers.length;
        System.out.println("Average balance: $" + averageBalance);

        // 3. Find and display customer with highest and lowest balance
        Customer highestBalanceCustomer = customers[0];
        Customer lowestBalanceCustomer = customers[0];
        for (Customer customer : customers) {
            if (customer.getBalance() > highestBalanceCustomer.getBalance()) {
                highestBalanceCustomer = customer;
            }
            if (customer.getBalance() < lowestBalanceCustomer.getBalance()) {
                lowestBalanceCustomer = customer;
            }
        }
        System.out.println("Customer with highest balance: " + highestBalanceCustomer);
        System.out.println("Customer with lowest balance: " + lowestBalanceCustomer);

        // 4. Show all accounts after 15% balance increase
        System.out.println("Accounts after 15% balance increase:");
        for (Customer customer : customers) {
            customer.addPercentage(15);  // Increase balance by 15%
            System.out.println(customer);
        }

        input.close();
    }

}
