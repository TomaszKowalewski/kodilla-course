package good.patterns.challenges;

import java.util.List;

public class ProductOrderService implements OrderService {

    @Override
    public boolean canWeBuy(User user, List<Order> orders) {
        System.out.println("We are checking can We buy: " + orders.toString() + "for " + user.toString());
        return true;
    }
}
