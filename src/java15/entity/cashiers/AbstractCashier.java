package java15.entity.cashiers;

import java15.entity.Cashier;
import java15.entity.CashierStrategy;

/**
 * Created by Администратор on 15.06.2017.
 */
public abstract class AbstractCashier implements Cashier {
    @Override
    public abstract CashierStrategy strategy(Class customerClass);
}
