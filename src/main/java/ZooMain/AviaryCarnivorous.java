package ZooMain;
import Animals.*;

import java.util.ArrayList;
import java.util.List;
public class AviaryCarnivorous implements Aviary {
    private List<Carnivorous> animals = new ArrayList<>();
    private int size;
    private int count;

    public AviaryCarnivorous(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Размер вольера не может быть меньше 1");
        }
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public int getCount() {
        return count;
    }

    @Override

    public void addAnimal(Animal animal) {
        if (size > animals.size() && animal instanceof Carnivorous) {
            animals.add((Carnivorous) animal);
            count = animals.size();
        } else {
            System.out.println("В вольере нет места");
        }
    }
    @Override
    public Animal getAnimalByIndex(int index) {
        if (0 <= index && index < size) {
            return animals.get(index);
        } else if (index < 0) {
            System.out.println("Индекс не может быть меньше нуля");
        } else {
            System.out.println("Животного с таким идексом нет");
        }
        return null;
    }
}
