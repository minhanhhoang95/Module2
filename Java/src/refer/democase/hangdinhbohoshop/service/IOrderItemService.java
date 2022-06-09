package refer.democase.hangdinhbohoshop.service;

import refer.democase.hangdinhbohoshop.model.OrderItem;

import java.util.List;

public interface IOrderItemService {
    List<OrderItem> getOrderItems();

    void add (OrderItem newOrderItem);

    void update();

    OrderItem getOrderItemById (int id);
}
