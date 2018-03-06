package saving_system;

public class Variables {

    static int happy = 0;

    static int wood = 5000;
    static int clay = 1500;
    static int iron = 1000;

    static String username = "Gracz";
    static String villageName = "Wioska gracza " + username;

    static int town_hall_lvl = 1;
    static final int town_hall_max_lvl = 30;
    static final int[] TownHallLvlResourcesWood = {0, 50, 1000, 2000, 3000, 4000, 500, 6000};
    static final int[] TownHallLvlResourcesClay = {0, 75, 0, 0, 0, 0, 0, 0};
    static final int[] TownHallLvlResourcesIron = {0, 40, 0, 0, 0, 0, 0, 0};


    public static int getHappy() {
        return happy;
    }

    public static void setHappy(int happy) {
        Variables.happy = happy;
    }

    public static int getWood() {
        return wood;
    }

    public static void setWood(int wood) {
        Variables.wood = wood;
    }

    public static int getClay() {
        return clay;
    }

    public static void setClay(int clay) {
        Variables.clay = clay;
    }

    public static int getIron() {
        return iron;
    }

    public static void setIron(int iron) {
        Variables.iron = iron;
    }

    public static int getTown_hall_lvl() {
        return town_hall_lvl;
    }

    public static void setTown_hall_lvl(int town_hall_lvl) {
        Variables.town_hall_lvl = town_hall_lvl;
    }

    public static int getTown_hall_max_lvl() {
        return town_hall_max_lvl;
    }

    public static int getTownHallLvlResourcesWood(int lvl) {
        return TownHallLvlResourcesWood[lvl];
    }

    public static int getTownHallLvlResourcesClay(int lvl) {
        return TownHallLvlResourcesClay[lvl];
    }

    public static int getTownHallLvlResourcesIron(int lvl) {
        return TownHallLvlResourcesIron[lvl];
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Variables.username = username;
    }

    public static String getVillageName() {
        return villageName;
    }

    public static void setVillageName(String villageName) {
        Variables.villageName = villageName;
    }
}
