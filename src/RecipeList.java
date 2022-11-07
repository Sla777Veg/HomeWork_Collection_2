import java.util.HashSet;
import java.util.Set;

public class RecipeList {

    private final Set<Recipe> recipes = new HashSet<>();



    public  void addRecipe(Recipe recipe) {
        if (recipe == null) {
            return;
        }
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        } else {
            recipes.add(recipe);
        }

    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public String toString() {
        return "RecipeList{" +
                "recipes=" + recipes +
                '}';
    }
}
