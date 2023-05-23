package bd.edu.diu.cis.library.service;

import bd.edu.diu.cis.library.model.Customer;
import bd.edu.diu.cis.library.model.Product;
import bd.edu.diu.cis.library.model.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart addItemToCart(Product product, int quantity, Customer customer);

    ShoppingCart updateItemInCart(Product product, int quantity, Customer customer);

    ShoppingCart deleteItemFromCart(Product product, Customer customer);

}
