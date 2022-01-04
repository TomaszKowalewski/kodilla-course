package good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("Benny", "Hill");
        Order order1 = new Order("Bras", 3.0);
        Order order2 = new Order("Boxers", 5.0);

        return new OrderRequest(user, order1, order2);
    }
}
