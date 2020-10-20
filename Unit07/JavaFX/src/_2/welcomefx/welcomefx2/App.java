package _2.welcomefx.welcomefx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = FXMLLoader.load(getClass().getResource("Welcome2.fxml"));
        stage.setScene(new Scene(root, 400, 300));
        stage.setTitle("Welcome to JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}