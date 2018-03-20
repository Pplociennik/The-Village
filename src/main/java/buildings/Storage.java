package buildings;

public abstract class Storage implements Building{
    //attributes
    int level = 1;
    final int maxLevel = 25;

    final int[] woodForLvl = {0, 50, 75, 126, 300, 450, 500, 60, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
    final int[] cobbleForLvl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    final int[] sandstoneForLvl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    final int[] glassForLvl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    final int[] stoneForLvl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    final int[] whiteWoolForLvl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    final int[] dyedWoolForLvl = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    final double[] foodForLvl = {0, 0.20, 0.20, 0.35, 0.40, 0.40, 50, 60, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};



    double food = 2000;
    final double maxFood = 3.75;


    int wood = 100000;
    final int maxWood = 1000;

    int sandstone = 1500;
    final int maxSandstone = 1500;

    int sand = 100;
    final int maxSand = 100;

    int glass = 100;
    final int maxGlass = 100;

    int coal = 25;
    final int maxCoal = 25;

    int iron = 10;
    final int maxIron = 100;

    int gold = 6;
    final int maxGold  =100;

    int diamond = 1;
    final int maxDiamond = 20;

    int dyers = 45;
    final int maxDyers = 125;

    int whiteWool = 75;
    final int maxWhiteWool = 150;

    int dyedWool = 75;
    final int maxDyedWool = 150;

    int cobblestone = 250;
    final int maxCobblestone = 350;

    int stone = 45;
    final int maxStone = 65;

    //methods


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getSandstone() {
        return sandstone;
    }

    public void setSandstone(int sandstone) {
        this.sandstone = sandstone;
    }

    public int getSand() {
        return sand;
    }

    public void setSand(int sand) {
        this.sand = sand;
    }

    public int getGlass() {
        return glass;
    }

    public void setGlass(int glass) {
        this.glass = glass;
    }

    public int getCoal() {
        return coal;
    }

    public void setCoal(int coal) {
        this.coal = coal;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getDiamond() {
        return diamond;
    }

    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }

    public int getDyers() {
        return dyers;
    }

    public void setDyers(int dyers) {
        this.dyers = dyers;
    }

    public int getWhiteWool() {
        return whiteWool;
    }

    public void setWhiteWool(int whiteWool) {
        this.whiteWool = whiteWool;
    }

    public int getDyedWool() {
        return dyedWool;
    }

    public void setDyedWool(int dyedWool) {
        this.dyedWool = dyedWool;
    }

    public int getCobblestone() {
        return cobblestone;
    }

    public void setCobblestone(int cobblestone) {
        this.cobblestone = cobblestone;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public double getMaxFood() {
        return maxFood;
    }

    public int getMaxWood() {
        return maxWood;
    }

    public int getMaxSandstone() {
        return maxSandstone;
    }

    public int getMaxSand() {
        return maxSand;
    }

    public int getMaxGlass() {
        return maxGlass;
    }

    public int getMaxCoal() {
        return maxCoal;
    }

    public int getMaxIron() {
        return maxIron;
    }

    public int getMaxGold() {
        return maxGold;
    }

    public int getMaxDiamond() {
        return maxDiamond;
    }

    public int getMaxDyers() {
        return maxDyers;
    }

    public int getMaxWhiteWool() {
        return maxWhiteWool;
    }

    public int getMaxDyedWool() {
        return maxDyedWool;
    }

    public int getMaxCobblestone() {
        return maxCobblestone;
    }

    public int getMaxStone() {
        return maxStone;
    }

    public void improve() {
        level++;
        setWood((getWood() - woodForLvl[level - 1]));
        setFood((getFood() - foodForLvl[level - 1]));
        setCobblestone(getCobblestone() - cobbleForLvl[level - 1]);
        setSandstone(getSandstone() - sandstoneForLvl[level - 1]);
        setGlass(getGlass() - glassForLvl[level - 1]);
        setStone(getStone() - stoneForLvl[level - 1]);
        setWhiteWool(getWhiteWool() - whiteWoolForLvl[level - 1]);
        setDyedWool(getDyedWool() - dyedWoolForLvl[level - 1]);
        System.out.println("Storage Improved!");
        System.out.println("Storage Level: " + level);
        System.out.println("Wood: " + getWood());
        System.out.println("Food: " + getFood());
        System.out.println("Cobblestone: " + getCobblestone());
        System.out.println("Sandstone: " + getSandstone());
        System.out.println("Glass: " + getGlass());
        System.out.println("Stone: " + getStone());
        System.out.println("White Wool: " + getWhiteWool());
        System.out.println("Dyed Wool: " + getDyedWool());
    }

    public void checkAndImprove() {
        if (level < maxLevel) {
            if (getFood() >= foodForLvl[level - 1]) {
                if (getWood() >= woodForLvl[level - 1]) {
                    if (getCobblestone() >= cobbleForLvl[level - 1]) {
                        if (getSandstone() >= sandstoneForLvl[level - 1]) {
                            if (getGlass() >= glassForLvl[level - 1]) {
                                if (getStone() >= stoneForLvl[level - 1]) {
                                    if (getWhiteWool() >= whiteWoolForLvl[level - 1]) {
                                        if (getDyedWool() >= dyedWoolForLvl[level - 1]) {
                                            improve();
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
            System.out.println("Max level of Storage!");
            System.out.println("Storage Level: " + level);
        }
    }
}
