package saving_loading;

import buildings.Storage;
import buildings.TownHall;
import player.Player;

public class Saving {

    static void transfer_out(Player player, Storage storage, TownHall townHall)  {
        player.setDyedWool(storage.getDyedWool());
        player.setWhiteWool(storage.getWhiteWool());
        player.setStone(storage.getStone());
        player.setGlass(storage.getGlass());
        player.setSandstone(storage.getSandstone());
        player.setCobblestone(storage.getCobblestone());
        player.setFood(storage.getFood());
        player.setWood(storage.getWood());
        player.setCoal(storage.getCoal());
        player.setDiamond(storage.getDiamond());
        player.setDyers(storage.getDyers());
        player.setGold(storage.getGold());
        player.setIron(storage.getIron());
        player.setStorageLvl(storage.getLevel());

        player.setTownHallLvl(townHall.getLevel());
    }

    public static void Save(Player player, Storage storage, TownHall townHall) {

        transfer_out(player, storage, townHall);

        //serializacja obiektu player
    }
}
