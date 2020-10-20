package _2.welcomefx.HelloJavaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

//import java.awt.*;//Swing be careful not to use awt.*

/**
 * Created by Osama Halabi on 2020/10/20.
 */
public class Controller {
    @FXML
    private Label helloLabel;

    @FXML
    public void handleHelloBtn(ActionEvent actionEvent) {
        helloLabel.setText("Hello JavaFX!");
    }
}
