package buildings;

public class TownHall {

    //attributes
    int level = 1;
    final int maxLevel = 30;

    final int[] woodForLvl = {0, 50, 75, 126, 300, 450, 500, 60, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
    final int[] cobbleForLvl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    final int[] sandstoneForLvl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    final int[] glassForLvl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    final int[] stoneForLvl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    final int[] whiteWoolForLvl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    final int[] dyedWoolForLvl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    final double[] foodForLvl = {0, 0.20, 0.20, 0.35, 0.40, 0.40, 50, 60, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};


    //methods

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void improve(Storage storage) {
        level++;
        storage.setWood((storage.getWood() - woodForLvl[level - 1]));
        storage.setFood((storage.getFood() - foodForLvl[level - 1]));
        storage.setCobblestone(storage.getCobblestone() - cobbleForLvl[level - 1]);
        storage.setSandstone(storage.getSandstone() - sandstoneForLvl[level - 1]);
        storage.setGlass(storage.getGlass() - glassForLvl[level - 1]);
        storage.setStone(storage.getStone() - stoneForLvl[level - 1]);
        storage.setWhiteWool(storage.getWhiteWool() - whiteWoolForLvl[level - 1]);
        storage.setDyedWool(storage.getDyedWool() - dyedWoolForLvl[level - 1]);
        System.out.println("Town Hall Improved!");
        System.out.println("Town Hall Level: " + level);
        System.out.println("Wood: " + storage.getWood());
        System.out.println("Food: " + storage.getFood());
        System.out.println("Cobblestone: " + storage.getCobblestone());
        System.out.println("Sandstone: " + storage.getSandstone());
        System.out.println("Glass: " + storage.getGlass());
        System.out.println("Stone: " + storage.getStone());
        System.out.println("White Wool: " + storage.getWhiteWool());
        System.out.println("Dyed Wool: " + storage.getDyedWool());
    }

    public void checkAndImprove(Storage storage) {
        if (level < maxLevel) {
            if (storage.getFood() >= foodForLvl[level - 1]) {
                if (storage.getWood() >= woodForLvl[level - 1]) {
                    if (storage.getCobblestone() >= cobbleForLvl[level - 1]) {
                        if (storage.getSandstone() >= sandstoneForLvl[level - 1]) {
                            if (storage.getGlass() >= glassForLvl[level - 1]) {
                                if (storage.getStone() >= stoneForLvl[level - 1]) {
                                    if (storage.getWhiteWool() >= whiteWoolForLvl[level - 1]) {
                                        if (storage.getDyedWool() >= dyedWoolForLvl[level - 1]) {
                                            improve(storage);
                                        } else {
                                            System.out.println("Too little dyed wool!");
                                        }
                                    } else {
                                        System.out.println("Too little white wool!");
                                    }
                                } else {
                                    System.out.println("Too little stone!");
                                }
                            } else {
                                System.out.println("Too little glass!");
                            }
                        } else {
                            System.out.println("Too little sandstone!");
                        }
                    } else {
                        System.out.println("Too little cobblestone!");
                    }
                } else {
                    System.out.println("Too little wood!");
                }
            } else {
                System.out.println("Too little food!");
            }
        } else {
            System.out.println("Max level of Town Hall!");
            System.out.println("Town Hall Level: " + level);
        }
    }
}

