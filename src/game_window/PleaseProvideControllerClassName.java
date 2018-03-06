package game_window;

import improvement.Improvement;
import improvement.TownHall_improvementImpl;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import saving_system.Variables;

public class PleaseProvideControllerClassName {

    @FXML
    private AnchorPane pane1;

    @FXML
    private Label villageName;

    @FXML
    private AnchorPane pane2;

    @FXML
    void clickButton(MouseEvent event) {
        Improvement improve = new TownHall_improvementImpl();

        improve.improveTownHall();

        pane1.setDisable(true);
        pane2.setDisable(false);
        pane2.setVisible(true);



    }

    @FXML
    void showVillageName(MouseEvent event) {
        Variables var = new Variables();
        villageName.setText(var.getVillageName());

    }

}
