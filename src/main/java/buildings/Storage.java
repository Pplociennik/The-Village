package buildings;

public class Storage {
    //attributes
    double food = 2.75;
    final double maxFood = 3.75;

    int wood = 1000;
    final int maxWood = 1000;


    //methods
    public double getFood() {
        return food;
    }

    public void addFood(double foodIncome) {
        this.food = food + foodIncome;
    }

    public int getWood() {
        return wood;
    }

    public void addWood(int woodIncome) {
        this.wood = wood + woodIncome;
    }
}
