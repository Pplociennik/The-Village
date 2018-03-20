package player;

public class Player {
    //attributes
    String userName = "Gracz";
    String villageName = "Wioska gracza "+userName;

    int storageLvl = 1;
    int townHallLvl = 1;

    double food = 0;
    int wood = 0;
    int sandstone = 0;
    int sand = 0;
    int glass = 0;
    int coal = 0;
    int iron = 0;
    int gold = 0;
    int diamond = 0;
    int dyers = 0;
    int whiteWool = 0;
    int dyedWool = 0;
    int cobblestone = 0;
    int stone = 0;



    //methods
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public int getStorageLvl() {
        return storageLvl;
    }

    public void setStorageLvl(int storageLvl) {
        this.storageLvl = storageLvl;
    }

    public int getTownHallLvl() {
        return townHallLvl;
    }

    public void setTownHallLvl(int townHallLvl) {
        this.townHallLvl = townHallLvl;
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
}
