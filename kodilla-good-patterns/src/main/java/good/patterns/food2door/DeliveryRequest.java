package good.patterns.food2door;

public class DeliveryRequest {
    private User user;
    private String productName;
    private int quantity;

    public DeliveryRequest(String productName, int quantity) {
        this.user = new User("Franky", "frankyfurbo@gmail.com",
                "Richmond Avenue");
        this.productName = productName;
        this.quantity = quantity;
    }

    public DeliveryRequest(User user, String glutenFreeWater, int quantity) {
    }

    public User getUser() {
        return user;
    }
    public String getProductName() {
        return productName;
    }
    public int getQuantity() {
        return quantity;
    }
}

