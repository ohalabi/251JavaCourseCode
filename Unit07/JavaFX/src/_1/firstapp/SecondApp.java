package _1.firstapp;
/**
 * Created by Osama Halabi on 2020/10/15.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//import java.awt.*; // from Swing and error

public class SecondApp extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("My Second JavaFX App");
        VBox root = new VBox(); //layout
//        HBox root = new HBox(); //layout
        Label label = new Label("Welcome to JavaFX!");
        label.setTextFill(Color.BLUE);
        Button button = new Button("Submit");
        button.setTextFill(Color.GREEN);
        Button button1 = new Button("Help");
        root.getChildren().addAll(label, button, button1);
        Scene scene = new Scene(root, 500, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
