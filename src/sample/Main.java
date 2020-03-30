package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sample.controllers.MenuController;

import java.io.IOException;

public class Main extends Application {

    public static Stage menuStage;
    public static MenuController menuController;

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();

            fxmlLoader.setLocation(getClass().getResource("fxml/menu.fxml"));
            Parent fxmlMenu = fxmlLoader.load();
            menuController = fxmlLoader.getController();
            primaryStage.setTitle("Minesweeper");
            primaryStage.getIcons().add(new Image("sample/img/icon.png"));
            primaryStage.setScene(new Scene(fxmlMenu));//, 398, 486));
            primaryStage.setResizable(false);
            menuStage = primaryStage;
            primaryStage.show();
        }
        catch (IOException e) {
            System.out.println("Main error!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
