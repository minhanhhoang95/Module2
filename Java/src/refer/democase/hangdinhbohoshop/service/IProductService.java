package refer.democase.hangdinhbohoshop.service;

import refer.democase.hangdinhbohoshop.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProducts();

    void add (Product newProduct);

    Product getByID(int id);

    boolean existById(int id);

    void update(Product newProduct);

    boolean checkDuplicateName(String name);

    boolean checkDuplicateId(int id);

    void removeProduct(Product product);
}
