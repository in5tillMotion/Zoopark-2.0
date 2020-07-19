package Animals;
import Exception.FoodException;
import Food.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//Травоядные
public abstract class Herbivore extends Animal {
    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();
    @Override
    public void eat(Food food) throws FoodException {
        if (food.isVegetable()) {
            System.out.println(name + " ест " + food);
        } else {
            throw new FoodException (name + " не ест такую еду");
        }
    }
}