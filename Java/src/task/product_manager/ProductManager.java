package task.product_manager;

import task.product_manager.model.Product;

import java.util.*;

public class ProductManager {
    ArrayList<Product> products = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public ProductManager() {
        products.add(new Product(1, "CCC", 2));
        products.add(new Product(77, "AAA", 9));
        products.add(new Product(2, "AAA", 5));
        products.add(new Product(3, "DDD", 3));

    }

    //    public void addProduct() {
//        long id = System.currentTimeMillis()/10000;
//
//        System.out.print("Nhap Ten :");
//        String name = sc.nextLine();
//
//        System.out.print("Nhap gia : ");
//        double price = sc.nextDouble();
//
//        Product product = new Product(id, name, price);
//        products.add(product);
//    }

    public void searchId(int id) {
        for (Product value : products) {
            if (value.getId() == id) {
                System.out.println(value);
            }
        }
    }

    public void searchName(String name) {
        for (Product value : products) {
            if (value.getTitle().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(value);
            }
        }
    }

    public void searchPrice(double price) {
        for (Product value : products) {
            if (value.getPrice() == price) {
                System.out.println(value);
            }
        }
    }

    public void sortId() {
//        ArrayList<Product> productsCopy = new ArrayList<>(products);
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                long result = o1.getId() - o2.getId();
                return (result == 0) ? 0 : (result < 0) ? -1 : 1;
            }
        };
        Collections.sort(products, comparator);
        showProducts();
    }

    public void sortName() {
//        ArrayList<Product> productsCopy = new ArrayList<>(products);
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                String a = o1.getTitle();
                String b = o2.getTitle();
                int c = a.compareTo(b);
                if (c > 0) {
                    return 1;
                } else if (c < 0) {
                    return -1;
                } else {
                    if (o1.getId() - o2.getId() > 0) {
                        return 1;
                    } else if (o1.getId() - o2.getId() < 0) {
                        return -1;
                    } else {
                        if (o1.getPrice() - o2.getPrice() > 0) {
                            return 1;
                        } else if (o1.getPrice() - o2.getPrice() < 0) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                }

            }
        };
        Collections.sort(products, comparator);
        showProducts();
    }

    public void replaceName(int id, String name) {
        for (Product value : products) {
            if (value.getId() == id) {
                value.setTitle(name);
            }
        }
    }

    public void replacePrice(int id, double price) {
        for (Product value : products) {
            if (value.getId() == id) {
                value.setPrice(price);
            }
        }
    }

    public void replaceAll(int id, String name, double price) {
        for (Product value : products) {
            if (value.getId() == id) {
                value.setTitle(name);
                value.setPrice(price);
            }
        }
    }

    public void removeProduct(int id) {
        for (Product value : products) {
            if (value.getId() == id) {
                products.remove(value);
                break;
            }
        }
    }

    public void showProducts() {
        for (Product value : products) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

//        productManager.replaceName(1,"ach");
//        productManager.replacePrice(1,100.9);
//        productManager.replaceAll(3,"FFFFFFF",2999.2);
        productManager.removeProduct(3);
        productManager.showProducts();


    }

}
