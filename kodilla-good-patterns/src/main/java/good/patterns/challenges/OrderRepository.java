package good.patterns.challenges;

import java.util.List;

public interface OrderRepository {

    void createPurchase(User user, List<Order> order);
}
