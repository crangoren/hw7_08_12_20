package homework7;

public class Main {

    public static void main(String[] args) {

//        Cat cat = new Cat("Murzik1", 10);
//        Plate plate = new Plate(100);
        Plate plate = new Plate(70);

        Cat[] cats = {
                new Cat("Barsik", 20),
                new Cat("Pushok", 30),
                new Cat("Murzik", 35),
                new Cat("Kisya", 30),
                new Cat("Hvostik", 10),

        };
        plate.info();
//        cat.eat(plate);
//        cat.getHungry();
//        plate1.getFood();
//        plate.info();

        for (int i = 0; i < cats.length; i++) {

            cats[i].eat(plate);

//            cats[i].getHungry(); // задание 4

            plate.info();

        }
        for (int j =0; j < cats.length; j++) {

            if (cats[j].getHungry()) {
                System.out.println(cats[j].getName() + " поел");
            } else {
                System.out.println(cats[j].getName() + " голодный");
            }
        }



    }
}
