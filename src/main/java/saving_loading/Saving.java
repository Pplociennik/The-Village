package saving_loading;

import buildings.Storage;
import buildings.TownHall;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.Test;
import player.Player;

import java.io.File;
import java.io.IOException;

public class Saving {

    @Test
    public static void whenJavaSerializedToXmlStr_thenCorrect(Player player) throws JsonProcessingException {

        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(new File("XML.xml"), player);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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

    public static void save(Player player, Storage storage, TownHall townHall) throws JsonProcessingException {

        transfer_out(player, storage, townHall);

        whenJavaSerializedToXmlStr_thenCorrect(player);
    }
}
