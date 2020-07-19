package Animals;

import Food.*;

public class Lynx extends Carnivorous {
    protected static int count;
    public Lynx() {
        count++;
        name = "Рысь №" + count;
    }

    @Override
    public String getName() {
        return name;
    }

}
