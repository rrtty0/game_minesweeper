package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import sample.Main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ResultOfGameController {

    @FXML private Label lblResult;

    @FXML private Label lblTime;

    @FXML private Label lblOpened;

    @FXML private Label lblCellsWithBomb;



    public void setLabels(boolean flag, Date date, int openedCells, int cellsWithOutBomb, int numberOfBomb)
    {
        if(flag)
            lblResult.setText("Вы выиграли!");
        else
            lblResult.setText("Вы проиграли!");

        SimpleDateFormat formatForTime = new SimpleDateFormat("mm:ss");
        lblTime.setText("Время игры: " + formatForTime.format(date));

        lblOpened.setText("Открытых ячеек: " + openedCells + "/" + cellsWithOutBomb);

        lblCellsWithBomb.setText("Всего бомб: " + numberOfBomb);
    }

    public void actionRestart(ActionEvent actionEvent) {
        if(MenuController.stageNow)
        {
            MenuController.stage_8x8.close();
            Main.menuController.action8x8(null);
        }
        else
        {
            MenuController.stage_16x16.close();
            Main.menuController.action16x16(null);
        }

    }

    public void actionExit(ActionEvent actionEvent) {
        if(MenuController.stageNow)
            MenuController.stage_8x8.close();
        else
            MenuController.stage_16x16.close();
        Main.menuStage.show();
    }
}
