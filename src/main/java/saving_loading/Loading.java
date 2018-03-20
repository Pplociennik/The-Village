package saving_loading;

import buildings.Storage;
import buildings.TownHall;
import player.Player;

public class Loading {

    static void transfer_in(Player player, Storage storage, TownHall townHall)  {
        storage.setDyedWool(player.getDyedWool());
        storage.setWhiteWool(player.getWhiteWool());
        storage.setStone(player.getStone());
        storage.setGlass(player.getGlass());
        storage.setSandstone(player.getSandstone());
        storage.setCobblestone(player.getCobblestone());
        storage.setFood(player.getFood());
        storage.setWood(player.getWood());
        storage.setCoal(player.getCoal());
        storage.setDiamond(player.getDiamond());
        storage.setDyers(player.getDyers());
        storage.setGold(player.getGold());
        storage.setIron(player.getIron());
        storage.setLevel(player.getStorageLvl());

        townHall.setLevel(player.getTownHallLvl());
    }

    public static void load(Player player, Storage storage, TownHall townHall) {

        //deserializacja do obietu player

        transfer_in(player, storage, townHall);
    }
}
