/**
 * Sample Skeleton for 'game_window.fxml' Controller Class
 */
package game_window;

import buildings.Storage;
import buildings.TownHall;
import com.fasterxml.jackson.core.JsonProcessingException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import player.Player;
import saving_loading.Saving;


public class Controller extends Saving {

    Player player = new Player();
    TownHall townHall = new TownHall();
    Storage storage = new Storage();

    @FXML // fx:id="mainPane"
    private AnchorPane mainPane; // Value injected by FXMLLoader

    @FXML // fx:id="townHallPane"
    private AnchorPane townHallPane; // Value injected by FXMLLoader

    @FXML // fx:id="storageimpr"
    private Button storageimpr; //Value injected by FXMLLoader

    @FXML // fx:id="pane2"
    private AnchorPane pane2; // Value injected by FXMLLoader

    @FXML
    void clickTownHallImprovement(MouseEvent event) {
        townHall.checkAndImprove(storage);
    }

    @FXML
    void clickImproveStorage(MouseEvent event)  {
        storage.checkAndImprove();
        try {
            save(player, storage, townHall);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void setPane2(MouseEvent event) {
        townHallPane.setVisible(false);
        pane2.setVisible(true);
    }

}
