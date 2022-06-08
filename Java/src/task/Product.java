package task;


public class Product {
    private long id;
    private String nameProducts;
    private double price;

    public Product(){

    }
    public Product(long id, String nameProducts, double price) {
        this.id = id;
        this.nameProducts = nameProducts;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProducts() {
        return nameProducts;
    }

    public void  setNameProducts(String nameProducts) {
        this.nameProducts = nameProducts;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProducts='" + nameProducts + '\'' +
                ", price=" + price +
                '}';
    }

}
