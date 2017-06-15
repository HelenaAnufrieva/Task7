package java15.entity;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by Администратор on 15.06.2017.
 */
public class Register {
    private int breakRegister;
    private final Cashier cashier;
    private final Queue<Customer> queue = new LinkedList<>();

    public Register(Cashier cashier) {
        this.cashier = cashier;
        breakRegister = 0;
    }

    public void newCustomer(Customer customer)
    {
        queue.add(customer);
    }

    public int breakRegister()
    {
        Random random = new Random();
        if(random.nextBoolean()) {
            breakRegister++;
            return 360;
        }
        else
            breakRegister++;
        return 60;
    }

    public void run()
    {
        Random random = new Random();
        int numberOfCustomers = 0;
        int totalTime = 0;
        Customer customer;
        while ((customer = queue.poll()) != null)
        {
            CashierStrategy strategy = cashier.strategy(customer.getClass());
            if(random.nextBoolean())
                totalTime += breakRegister();
            totalTime += strategy.communicate(customer);
            numberOfCustomers++;
        }
        System.out.println("It was " + numberOfCustomers + " customers and it took " + totalTime/60 + " minutes. The cash register broke down " + breakRegister + " times!\n" );
    }
}
