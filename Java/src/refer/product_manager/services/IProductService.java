package refer.product_manager.services;

import refer.product_manager.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(long id);

    boolean existsById(long id);

    void add(Product newProduct);

    void update(Product newProduct);
}
