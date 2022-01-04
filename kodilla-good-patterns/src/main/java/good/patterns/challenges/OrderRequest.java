package good.patterns.challenges;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class OrderRequest {

    private User user;
    private List<Order> orderList = new LinkedList<>();

    public OrderRequest(User user, Order ... order) {
        this.user = user;
        this.orderList.addAll(Arrays.asList(order));
    }

    public User getUser() {
        return user;
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}

