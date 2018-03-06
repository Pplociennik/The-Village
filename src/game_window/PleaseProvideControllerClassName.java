package game_window;

import improvement.Improvement;
import improvement.TownHall_improvementImpl;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class PleaseProvideControllerClassName {

    @FXML
    void clickButton(MouseEvent event) {
        Improvement improve = new TownHall_improvementImpl();

        improve.improveTownHall();

    }

}
