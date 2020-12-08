package homework7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public  void decreaseFood(int amount) {
        if (amount < 0 || amount > this.getFood()) {
            return;
        } else {
            food -= amount;
        }
    }

    public void info() {
        System.out.println("Еды в тарелке: " + food + "\n");
    }

//    public void addFood(int value) { // метод задания 6
//        if (value > food) {
//            int feed = (value - food);
//            food += feed;
//            System.out.println("Добавлено еды: " + (feed));
//        } else {
//            return;
//        }
//    }
}