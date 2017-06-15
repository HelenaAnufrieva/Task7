package java15.entity.strategies;

import java15.entity.CashierStrategy;
import java15.entity.Customer;


/**
 * Created by Администратор on 15.06.2017.
 */
public class FriendlyStrategy implements CashierStrategy {
    private final static int FRIENDLY_COEFFICIENT = -2;

    public int communicate(Customer customer) {

            /*System.out.println("Friendly Strategy");*/
            return customer.buyThings() + FRIENDLY_COEFFICIENT;

    }
}
