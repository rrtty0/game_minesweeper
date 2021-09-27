package sample.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import sample.Main;

import java.io.IOException;

public class MenuController {

    public static Stage stage_8x8;
    public static Stage stage_16x16;
    public static boolean stageNow;//сцена, которая использовалась в последний раз, true - 8x8, false - 16x16


    public void action8x8(ActionEvent actionEvent) {
        try {
            stageNow = true;
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/field_8x8.fxml"));
            stage_8x8 = new Stage();
            stage_8x8.setTitle("Minesweeper");
            stage_8x8.getIcons().add(new Image("sample/img/icon.png"));
            stage_8x8.setScene(new Scene(root, 409, 497));
            stage_8x8.setResizable(false);
            stage_8x8.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Controller_8x8.gameOver = true;
                    stage_8x8.close();
                    Main.menuStage.show();
                }
            });
            Main.menuStage.hide();
            stage_8x8.show();
        }
        catch (IOException e) {
            System.out.println("OSHIBKA8x8");
            e.printStackTrace();
        }
    }

    public void action16x16(ActionEvent actionEvent) {
        try {
            stageNow = false;
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/field_16x16.fxml"));
            stage_16x16 = new Stage();
            stage_16x16.setTitle("Minesweeper");
            stage_16x16.getIcons().add(new Image("sample/img/icon.png"));
            stage_16x16.setScene(new Scene(root, 561, 627));
            stage_16x16.setResizable(false);
            stage_16x16.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Controller_16x16.gameOver = true;
                    stage_16x16.close();
                    Main.menuStage.show();
                }
            });
            Main.menuStage.hide();
            stage_16x16.show();
        }
        catch (IOException e) {
            System.out.println("OSHIBKA16x16");
            e.printStackTrace();
        }
    }
}
