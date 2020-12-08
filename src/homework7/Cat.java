package homework7;

public class Cat {

    private String name;
    private int appetite;
    private boolean hungry = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }


    public String getName() {
        return name;
    }

    public void eat(Plate plate) {

        if (appetite < plate.getFood()) {
            System.out.println("Кот " + name + " ест...");
            hungry = true;
        } else {
            System.out.println("Слишком мало еды, аппетит " + name + " : " + appetite);
//            plate.addFood(getAppetite()); // задания 6
//            hungry = true; // задания 6
        }
        plate.decreaseFood(appetite);

    }

    public boolean getHungry() {

        return hungry;

    }
    public int getAppetite() { // задание 6
        return appetite;
    }
}