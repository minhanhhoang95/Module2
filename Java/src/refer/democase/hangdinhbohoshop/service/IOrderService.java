package refer.democase.hangdinhbohoshop.service;

import refer.democase.hangdinhbohoshop.model.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getOrders() ;
    void add (Order newOrder);
//    void update(Order order);

    void update();

    // void remove(Order order);
    Order getOrderById(int id);
    boolean exist (int id);
    boolean checkDuplicateName(String name);
    boolean checkDuplicateId(int id);
}
