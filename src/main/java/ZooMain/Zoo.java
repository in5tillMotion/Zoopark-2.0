package ZooMain;

import Animals.*;
import Food.*;
import InfoAnimals.Information;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.google.gson.Gson;
import java.io.*;



import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static final Logger log = LogManager.getLogger("output");

    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        Information infoBear;
        Information infoKangaroo;
        Information infoLama;
        Information infoLynx;
        Information infoOstrich;
        Information infoTiger;
        FileReader read = new FileReader("info.json");
        infoBear = gson.fromJson(read, Information.class);
        infoKangaroo = gson.fromJson(read, Information.class);
        infoLama = gson.fromJson(read, Information.class);
        infoLynx = gson.fromJson(read, Information.class);
        infoOstrich = gson.fromJson(read, Information.class);
        infoTiger = gson.fromJson(read, Information.class);


        FileWriter write = new FileWriter("info.json");
        {
            infoBear = new Information("Sam ", 5);
            infoKangaroo = new Information("Jack", 8);
            infoLama = new Information("Harcho", 7);
            infoLynx = new Information("Killer", 10);
            infoOstrich = new Information("Feary", 2);
            infoTiger = new Information("Kingy", 12);
            gson.toJson(infoBear, write);
            gson.toJson(infoKangaroo, write);
            gson.toJson(infoLama, write);
            gson.toJson(infoLynx, write);
            gson.toJson(infoOstrich, write);
            gson.toJson(infoTiger, write);
            write.flush();

            Food[] foods = Food.values();

            //Создаём вольеры и указываем их размеры.
            AviaryCarnivorous aviaryCarnivorous1 = new AviaryCarnivorous(5);
            AviaryCarnivorous aviaryCarnivorous2 = new AviaryCarnivorous(4);
            AviaryHerbivore aviaryHerbivore1 = new AviaryHerbivore(6);
            AviaryHerbivore aviaryHerbivore2 = new AviaryHerbivore(3);

            log.info("Заполняем вольер № 1 животными");
            for (int i = 0; i < aviaryCarnivorous1.getSize(); i++) {
                aviaryCarnivorous1.addAnimal(new Tiger());
            }
            log.info("Заполняем вольер № 2 животными");
            for (int i = 0; i < 2; i++) {
                aviaryCarnivorous2.addAnimal(new Bear());
            }
            log.info("Заполняем вольер № 3 животными");
            for (int i = 0; i < 2; i++) {
                aviaryHerbivore1.addAnimal(new Lama());
            }
            log.info("Заполняем вольер № 4 животными");
            for (int i = 0; i < aviaryHerbivore2.getSize(); i++) {
                aviaryHerbivore2.addAnimal(new Kangaroo());
            }


            List<Aviary> aviaries = new ArrayList<Aviary>();
            aviaries.add(aviaryHerbivore1);
            aviaries.add(aviaryHerbivore2);
            aviaries.add(aviaryCarnivorous1);
            aviaries.add(aviaryCarnivorous2);

            log.info("Кормим зверей");
            for (Aviary aviary : aviaries) {
                for (int i = 0; i < aviary.getCount(); i++) {
                    int random = (int) (Math.random() * foods.length);
                    Food food = foods[random];
                    Animal animal = aviary.getAnimalByIndex(i);
                    System.out.println("Работник зоопарка для " + animal + " наложил еды: "
                            + food);
                }
            }

        }
    }
}
