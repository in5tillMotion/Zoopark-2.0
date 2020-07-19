package ZooMain;

import Animals.Animal;

public interface Aviary {
    int getSize();

    int getCount();

    void addAnimal(Animal animal);

    Animal getAnimalByIndex(int index);
}
