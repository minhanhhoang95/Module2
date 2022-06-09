package task.product_manager.sevices;

import task.product_manager.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductBService implements IProductService {
    private List<Product> productList = new ArrayList<>();
    public  ProductBService() {
        productList.add(new Product(30200, "Iphone", 100));
        productList.add(new Product(30220, "Samsung", 200));
        productList.add(new Product(30201, "Nokia", 300));
        productList.add(new Product(30251, "Xiaomi", 400));


    }
    @Override
    public  List<Product> findAll(){
        return productList;
    }
    @Override
    public Product findById(long id){
        List<Product> productList =findAll();
        for (Product product : productList) {
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }
    @Override
    public boolean existsById(long id ){
        return findById(id)!= null;
    }
    @Override
    public void add(Product newProduct){
        newProduct.setId(System.currentTimeMillis()/1000);
//        System.out.println("aaaaaaaaaaaaaaaaaaaaa");
        productList.add(newProduct);
    }
    @Override
    public void update(Product newProduct){

    }

//    public static void main(String[] args) {
//        ProductBService productBService=new ProductBService();
//        System.out.println(productBService.findAll());
//
//    }

}
