import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {

    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        if (product == null) {
            return;
        }
        if (products.contains(product)) {
            throw new ProductAlreadyException();
        } else {
            this.products.add(product);
        }
    }

    public void checkProduct(String name) {
        for(Product product: this.products) {
            if (product.getName().equals(name)) {
                product.setChecked();
                break;
            }
        }
    }

    public void removeProduct(String name) {
        Iterator<Product> productsIterator = this.products.iterator();
        while (productsIterator.hasNext()) {
            if (productsIterator.next().getName().equals(name)) {
                productsIterator.remove();
                break;
            }
        }
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список продуктов:").append('\n');
        for (Product product : this.products) {
            sb.append(product).append('\n');
        }
        return sb.toString();
    }
}
