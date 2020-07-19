package Animals;
import Food.Food;
import Exception.FoodException;
//Хищники
public abstract class Animal {
    protected static int count;
    protected String name;

    public abstract void eat(Food food) throws FoodException;

    public abstract String getName();

    @Override
    public String toString() {
        return name;
    }
}
