package good.patterns.challenges;

public class OrderDto {

    private User user;
    private boolean canWeBay;

    public OrderDto(User user, boolean canWeBay) {
        this.user = user;
        this.canWeBay = canWeBay;
    }

    public User getUser() {
        return user;
    }

    public boolean isCanWeBay() {
        return canWeBay;
    }
}
