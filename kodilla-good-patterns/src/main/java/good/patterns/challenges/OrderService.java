package good.patterns.challenges;

import java.util.List;

public interface OrderService {

    boolean canWeBuy(User user, List<Order> orders);
}
