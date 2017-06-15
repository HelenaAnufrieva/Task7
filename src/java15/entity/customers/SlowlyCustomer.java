package java15.entity.customers;

/**
 * Created by Администратор on 15.06.2017.
 */
public class SlowlyCustomer extends AbstractCustomer {
    @Override
    public int buyThings() {
        return 100;
    }
}
