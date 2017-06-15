package java15.entity;

/**
 * Created by Администратор on 15.06.2017.
 */
public interface Cashier {
    CashierStrategy strategy(Class customerClass);
}
