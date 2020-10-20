package _3.basics.gettime;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Created by Osama Halabi on 2020/10/16.
 */
public class TimeController {
    @FXML
    private Label timeLabel;

    @FXML
    public void handleGetTime(ActionEvent actionEvent) {
        timeLabel.setText(TimeModel.getCurrentDateTime());
    }
}

