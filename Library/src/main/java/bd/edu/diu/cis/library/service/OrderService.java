package bd.edu.diu.cis.library.service;

import bd.edu.diu.cis.library.model.Order;
import bd.edu.diu.cis.library.model.ShoppingCart;

import java.util.List;

public interface OrderService {
    List<Order> listAll();
    Order get(long id);
    void saveOrder(ShoppingCart cart);
    void acceptOrder(Long id);
    void cancelOrder(Long id);
    void updatePayment(Order order);
}
