package java15.entity.customers;

import java15.entity.Customer;

/**
 * Created by Администратор on 15.06.2017.
 */
public abstract class AbstractCustomer implements Customer{
    int timeOfShopping;
    public AbstractCustomer()
    {
        timeOfShopping = 0;
    }
}
