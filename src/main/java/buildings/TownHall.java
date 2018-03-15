package buildings;

public class TownHall {

    //attributes
    int level = 1;
    final int maxLevel = 30;

    final int[] woodForLvl = {0, 50, 0, 20, 300, 4, 50, 60, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
    final double[] foodForLvl = {0, 0.20, 0, 20, 300, 4, 50, 60, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};


    //methods
    public void improve(Storage storage) {
        if (level < maxLevel) {
            if (storage.getFood() >= foodForLvl[level]) {
                if(storage.getWood() >= woodForLvl[level]) {
                    level++; storage.addWood(-woodForLvl[level]); storage.addFood(-foodForLvl[level]);
                }
            }
        }
    }
}
