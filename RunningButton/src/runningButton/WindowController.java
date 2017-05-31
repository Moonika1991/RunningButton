package runningButton;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.awt.event.ActionEvent;

public class WindowController {

    @FXML
    private Button close;

    @FXML
    private AnchorPane layout;

    @FXML
    private void handleClose(){
        System.exit(0);
    }

    @FXML
    private void run(){
        close.setLayoutX(Math.random()*(layout.getWidth() - close.getWidth()));
        close.setLayoutY(Math.random()*(layout.getHeight() - close.getHeight()));
    }
}
