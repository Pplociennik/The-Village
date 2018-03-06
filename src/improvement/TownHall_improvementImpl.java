package improvement;

import static saving_system.Variables.*;

public class TownHall_improvementImpl {

    public static boolean checkTownHallReady(int lvl) {
        if (getTown_hall_lvl() >= getTown_hall_max_lvl()) {
            System.out.println("Max level of Town Hall!!!");
        } else {
            if (getWood() >= getTownHallLvlResourcesWood(lvl)) {
                if (getClay() >= getTownHallLvlResourcesClay(lvl)) {
                    if (getIron() >= getTownHallLvlResourcesIron(lvl)) {
                        return true;
                    } else {
                        System.out.println("Too less iron!");
                        return false;
                    }
                } else {
                    System.out.println("Too less clay!");
                    return false;
                }
            } else {
                System.out.println("Too less wood!");
                return false;
            }
        }
        return false;
    }

    public static void improveTownHall() {
        int lvl = getTown_hall_lvl();
        if (checkTownHallReady(lvl) == true) {
            setTown_hall_lvl(getTown_hall_lvl() + 1);
            setHappy(getHappy() + 5);
            setWood(getWood() - getTownHallLvlResourcesWood(lvl));
            setClay(getClay() - getTownHallLvlResourcesClay(lvl));
            setIron(getIron() - getTownHallLvlResourcesIron(lvl));
        } else {
            System.out.println("Too less resources...");
        }
    }
}
