package refer.democase.hangdinhbohoshop.comparator;

import refer.democase.hangdinhbohoshop.model.Product;

import java.util.Comparator;

public class ComparatorPriceASC implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
