package task.product_manager.model;


public class Product {
    private long id;
    private String title;
    private double price;

    public Product(){

    }

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Product(long id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String nameProducts) {
        this.title = title;
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
                ", nameProducts='" + title + '\'' +
                ", price=" + price +
                '}';
    }

}
