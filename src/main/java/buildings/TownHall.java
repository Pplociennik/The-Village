package buildings;

public class TownHall {

    //attributes
    int level = 1;
    final int maxLevel = 30;

    final int[] woodForLvl = {0, 50, 75, 126, 300, 450, 500, 60, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
    final double[] foodForLvl = {0, 0.20, 0.20, 0.35, 0.40, 0.40, 50, 60, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};


    //methods
    public void improve(Storage storage) {
        if (level < maxLevel) {
            if (storage.getFood() >= foodForLvl[level]) {
                if(storage.getWood() >= woodForLvl[level]) {
                    level++; storage.addWood(-woodForLvl[level]); storage.addFood(-foodForLvl[level]);
                    System.out.println("Town Hall Improved!");
                    System.out.println("Town Hall Level: "+level);
                    System.out.println("Wood: "+storage.getWood());
                    System.out.println("Food: "+storage.getFood());
                }
                else {System.out.println("Too little wood!");}
            }
            else {System.out.println("Too little food!");}
        }
        else {System.out.println("Max levelof Town Hall!");}
    }
}
