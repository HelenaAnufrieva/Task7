package java15.entity.cashiers;

import java15.entity.CashierStrategy;
import java15.entity.customers.CustomerWithCreditCard;
import java15.entity.customers.NormalCustomer;
import java15.entity.strategies.CommonStrategy;
import java15.entity.strategies.FriendlyStrategy;

/**
 * Created by Администратор on 15.06.2017.
 */
public class NiceCashier extends AbstractCashier {
    public CashierStrategy strategy(Class customerClass) {
        if (CustomerWithCreditCard.class.isAssignableFrom(customerClass) || NormalCustomer.class.isAssignableFrom(customerClass))
            return new FriendlyStrategy(); // с обычными покупателями кассир дружелюбный
        else
            return new CommonStrategy(); // с медленными - обычный

    }
}
