import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final String recipeName;

    private final Set<Product> products;
    //private  double price = getRecipePrice();

    public Recipe(String recipeName, Set<Product> products) {
        if (recipeName == null || products ==null || products.size() == 0) {
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.recipeName = recipeName;
        this.products = products;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public double getRecipePrice() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeName='" + recipeName + '\'' +
                ", products=" + products +
                ", price=" + getRecipePrice() +
                '}';
    }
}
