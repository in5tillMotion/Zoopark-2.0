package Animals;

import Food.*;

public class Kangaroo extends Herbivore {
    protected static int count;
    public Kangaroo() {
        count++;
        name = "Кенгуру №" + count;
    }

    @Override
    public String getName() {
        return name;
    }

}


