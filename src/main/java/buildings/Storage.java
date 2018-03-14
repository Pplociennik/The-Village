package buildings;

public class Storage {
    //attributes
    double food = 2.75;
    final double maxFood = 3.75;

    int wood = 750;
    final int maxWood = 1000;


    //methods
    public double getFood() {
        return food;
    }

    public void addFood(double food) {
        this.food = food + this.food;
    }

    public int getWood() {
        return wood;
    }

    public void addWood(int wood) {
        this.wood = wood + this.wood;
    }
}
