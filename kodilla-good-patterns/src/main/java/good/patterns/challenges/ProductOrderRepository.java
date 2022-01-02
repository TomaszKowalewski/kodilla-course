package good.patterns.challenges;

import java.util.List;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public void createPurchase(User user, List<Order> order) {
        System.out.println("Creating purchase for: " + user.toString());

    }
}
