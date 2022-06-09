package task.product_manager.views;

import task.product_manager.model.Product;
import task.product_manager.sevices.IProductService;
import task.product_manager.sevices.ProductBService;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final Scanner scanner = new Scanner(System.in);
    ProductBService productService = new ProductBService() ;

    public void renderProduct() {
        List<Product> products = productService.findAll();
        System.out.printf("\n\t%-16s %-36s %s\n\n", "Product ID", "Product Name", "Product Quantity", "Product Price");
        for (Product product : products)
            System.out.printf("\t%-16s %-36s $%.2f\n",
                    product.getId(),
                    product.getTitle(),
                    product.getPrice());
    }


    public void addProduct() {
        System.out.print("■ Type a product name: ");
        String productName = scanner.nextLine();

        System.out.print("■ Type a product price: ");
        double productPrice = Double.parseDouble(scanner.nextLine());

        Product newProduct = new Product(productName, productPrice);
        productService.add(newProduct);
        System.out.println("\n■ Product added successfully!");
    }

    public void launch() {

        while (true) {
            System.out.print("╔══════════════════════════════════════════════════════════════════════════════════════════════════╗" +
                    "\n║                                                                                                  ║" +
                    "\n║                              PRODUCT MANAGEMENT - v1.0 (Dev Builds)                              ║" +
                    "\n║                                          [Main Menu]                                             ║" +
                    "\n║                                                                                                  ║" +
                    "\n║           ■  [1] Product List - Shows all current product from the Product List.                 ║" +
                    "\n║           ■  [2] Product Add - Adding a new product to the Product List.                         ║" +
                    "\n║           ■  [3] Product Edit - Editing a product from Product List.                             ║" +
                    "\n║           ■  [4] Product Remove - Removing a product from Product List.                          ║" +
                    "\n║           ■  [5] Product Search - Searching a product from Product List.                         ║" +
                    "\n║           ■  [6] Product Sort (Ascending Price) - Sorting product by ascending price.            ║" +
                    "\n║           ■  [7] Product Sort (Descending Price) - Sorting product by descending price.          ║" +
                    "\n║           ■  [8] Exit the application.                                                           ║" +
                    "\n║                                                                                                  ║" +
                    "\n╚══════════════════════════════════════════════════════════════════════════════════════════════════╝" +
                    "\n■ Type a number above by your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    renderProduct();
                    break;

                case "2":
                    addProduct();
                    break;

                case "3":
                    //  productManager.editProduct();
                    break;

                case "4":
                    //    .removeProduct();
                    break;

                case "5":
                    //   productManager.searchProductByName();
                    break;

                case "6":
                    //lamba express
                    //   productManager.renderProduct();
                    break;

                case "7":
//                    PRODUCTS.sort(Comparator.comparing(Product::getProductPrice).reversed());
//                    renderProduct();
//                    break;

                case "8":
                    System.out.println("■ Exiting the application successfully!");
                    System.exit(0);

                default:
                    System.out.println("■ Invalid selected number, please try again!");
            }
        }
    }

//    public static void main(String[] args) {
//        ProductView productView = new ProductView();
//
//        productView.addProduct();
//        productView.renderProduct();
//    }
}

