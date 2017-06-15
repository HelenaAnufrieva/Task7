package java15.entity.strategies;

import java15.entity.CashierStrategy;
import java15.entity.Customer;

/**
 * Created by Администратор on 15.06.2017.
 */
public class AngryStrategy implements CashierStrategy {
    int ANGRY_COEFFICIENT = 3;
    @Override
    public int communicate(Customer customer) {
        /*System.out.println("Angry Strategy");*/
        return customer.buyThings() + ANGRY_COEFFICIENT;
    }
}
