package good.patterns.food2door;

import java.util.Map;

public interface DeliveryRepository {
    boolean isAvailable(String productName, int quantity);
    boolean process(User user, DeliveryRequest deliveryRequest);
    Map<String, Integer> getStorage();
}
