package Animals;

import Food.*;

public class Lama extends Herbivore {
    protected static int count;
    public Lama() {
        count++;
        name = "Лама №" + count;
    }

    @Override
    public String getName() {
        return name;
    }


}