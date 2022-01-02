package good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("Benny", "Hill");
        Order order1 = new Order("Bras");
        Order order2 = new Order("Boxers");

        return new OrderRequest(user, order1, order2);
    }
}
