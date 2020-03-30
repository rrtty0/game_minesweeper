package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Pair;
import sample.Cell;
import sample.Main;
import sample.SupController;
import sample.TimeThread;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

public class Controller_8x8 extends SupController implements Initializable {

    @FXML private Cell cell00;

    @FXML private Cell cell01;

    @FXML private Cell cell02;

    @FXML private Cell cell03;

    @FXML private Cell cell04;

    @FXML private Cell cell05;

    @FXML private Cell cell06;

    @FXML private Cell cell07;

    @FXML private Cell cell10;

    @FXML private Cell cell11;

    @FXML private Cell cell12;

    @FXML private Cell cell13;

    @FXML private Cell cell14;

    @FXML private Cell cell15;

    @FXML private Cell cell16;

    @FXML private Cell cell17;

    @FXML private Cell cell20;

    @FXML private Cell cell21;

    @FXML private Cell cell22;

    @FXML private Cell cell23;

    @FXML private Cell cell24;

    @FXML private Cell cell25;

    @FXML private Cell cell26;

    @FXML private Cell cell27;

    @FXML private Cell cell30;

    @FXML private Cell cell31;

    @FXML private Cell cell32;

    @FXML private Cell cell33;

    @FXML private Cell cell34;

    @FXML private Cell cell35;

    @FXML private Cell cell36;

    @FXML private Cell cell37;

    @FXML private Cell cell40;

    @FXML private Cell cell41;

    @FXML private Cell cell42;

    @FXML private Cell cell43;

    @FXML private Cell cell44;

    @FXML private Cell cell45;

    @FXML private Cell cell46;

    @FXML private Cell cell47;

    @FXML private Cell cell50;

    @FXML private Cell cell51;

    @FXML private Cell cell52;

    @FXML private Cell cell53;

    @FXML private Cell cell54;

    @FXML private Cell cell55;

    @FXML private Cell cell56;

    @FXML private Cell cell57;

    @FXML private Cell cell60;

    @FXML private Cell cell61;

    @FXML private Cell cell62;

    @FXML private Cell cell63;

    @FXML private Cell cell64;

    @FXML private Cell cell65;

    @FXML private Cell cell66;

    @FXML private Cell cell67;

    @FXML private Cell cell70;

    @FXML private Cell cell71;

    @FXML private Cell cell72;

    @FXML private Cell cell73;

    @FXML private Cell cell74;

    @FXML private Cell cell75;

    @FXML private Cell cell76;

    @FXML private Cell cell77;

    @FXML private Label lblTime;

    @FXML private Label lblBombs;

    private static HashSet<Cell> cellsWithBomb;

    private static HashSet<Cell> cellsWithFlag;

    Image imageClosed = new Image("sample/img/closed.png");
    Image imageFlaged = new Image("sample/img/flaged.png");
    Image imageBombed = new Image("sample/img/bombed.png");
    Image imageWithBomb = new Image("sample/img/bomb.png");
    Image imageZeroBomb = new Image("sample/img/zero.png");
    Image imageOneBomb = new Image("sample/img/num1.png");
    Image imageTwoBombs = new Image("sample/img/num2.png");
    Image imageThreeBombs = new Image("sample/img/num3.png");
    Image imageFourBombs = new Image("sample/img/num4.png");
    Image imageFiveBombs = new Image("sample/img/num5.png");
    Image imageSixBombs = new Image("sample/img/num6.png");
    Image imageSevenBombs = new Image("sample/img/num7.png");
    Image imageEightBombs = new Image("sample/img/num8.png");

    private static int closedCells;

    private Window window_8x8;

    private ResultOfGameController resultOfGameController;

    public static Stage resultStage;

    private Date currentDate = new Date();


    public void clickedAction(MouseEvent mouseEvent) {

        Object object = mouseEvent.getSource();
        Cell cell = (Cell) object;

        if(window_8x8 == null)
            window_8x8 = ((Node)mouseEvent.getSource()).getScene().getWindow();

        if(mouseEvent.getClickCount() == 2)
        {
            if(mouseEvent.getButton() == MouseButton.PRIMARY)
                openCellsAroundWithFlags(cell);
        }
        else
            if(mouseEvent.getClickCount() == 1)
            {
                if(mouseEvent.getButton() == MouseButton.PRIMARY)
                    openCell(cell);
                else
                    if(mouseEvent.getButton() == MouseButton.SECONDARY)
                        setFlag(cell);
            }
    }

    private void openCellsAroundWithFlags(Cell cell) {
        if(cell.isOpened())
        {
            if(cell.getNumberOfBombsAround() == getNumberOfFlagsAround(cell))
            {
                if(!cellsWithFlag.contains(getCell(cell.getCoordinateX() - 1, cell.getCoordinateY() - 1)))
                    openCell(getCell(cell.getCoordinateX() - 1, cell.getCoordinateY() - 1));
                if(!cellsWithFlag.contains(getCell(cell.getCoordinateX(), cell.getCoordinateY() - 1)))
                    openCell(getCell(cell.getCoordinateX(), cell.getCoordinateY() - 1));
                if(!cellsWithFlag.contains(getCell(cell.getCoordinateX() + 1, cell.getCoordinateY() - 1)))
                    openCell(getCell(cell.getCoordinateX() + 1, cell.getCoordinateY() - 1));
                if(!cellsWithFlag.contains(getCell(cell.getCoordinateX() - 1, cell.getCoordinateY())))
                    openCell(getCell(cell.getCoordinateX() - 1, cell.getCoordinateY()));
                if(!cellsWithFlag.contains(getCell(cell.getCoordinateX() + 1, cell.getCoordinateY())))
                    openCell(getCell(cell.getCoordinateX() + 1, cell.getCoordinateY()));
                if(!cellsWithFlag.contains(getCell(cell.getCoordinateX() - 1, cell.getCoordinateY() + 1)))
                    openCell(getCell(cell.getCoordinateX() - 1, cell.getCoordinateY() + 1));
                if(!cellsWithFlag.contains(getCell(cell.getCoordinateX(), cell.getCoordinateY() + 1)))
                    openCell(getCell(cell.getCoordinateX(), cell.getCoordinateY() + 1));
                if(!cellsWithFlag.contains(getCell(cell.getCoordinateX() + 1, cell.getCoordinateY() + 1)))
                    openCell(getCell(cell.getCoordinateX() + 1, cell.getCoordinateY() + 1));
            }
        }
    }

    private int getNumberOfFlagsAround(Cell cell)
    {
        int x = cell.getCoordinateX();
        int y = cell.getCoordinateY();
        int result = 0;
        if(cellsWithFlag.contains(getCell(x - 1, y - 1)))
            ++result;
        if(cellsWithFlag.contains(getCell(x, y - 1)))
            ++result;
        if(cellsWithFlag.contains(getCell(x + 1, y - 1)))
            ++result;
        if(cellsWithFlag.contains(getCell(x - 1, y)))
            ++result;
        if(cellsWithFlag.contains(getCell(x + 1, y)))
            ++result;
        if(cellsWithFlag.contains(getCell(x - 1, y + 1)))
            ++result;
        if(cellsWithFlag.contains(getCell(x, y + 1)))
            ++result;
        if(cellsWithFlag.contains(getCell(x + 1, y + 1)))
            ++result;

        return result;
    }

    private void setFlag(Cell cell) {
        if(!cell.isOpened())
        {
            if(cellsWithFlag.contains(cell))
            {
                cellsWithFlag.remove(cell);
                cell.setImage(imageClosed);
            }
            else
            {
                cellsWithFlag.add(cell);
                cell.setImage(imageFlaged);
            }
            updateLabelBombs();
        }
    }

    private void openCell(Cell cell)
    {
        if(cell != null && !cell.isOpened() && !cellsWithFlag.contains(cell))
        {
            Image image;
            if(cellsWithBomb.contains(cell))
            {
                openAllBombs(cell);
                cell.setImage(imageBombed);
                cell.setOpened(true);
                showResults(false);
            }
            else
            {
                --closedCells;
                image = chooseImage(cell);
                cell.setImage(image);
                cell.setOpened(true);

                if(closedCells == cellsWithBomb.size())
                {
                    openAllBombs(null);
                    showResults(true);
                }

                if(image.equals(imageZeroBomb))
                {
                    openCell(getCell(cell.getCoordinateX() - 1, cell.getCoordinateY() - 1));
                    openCell(getCell(cell.getCoordinateX(), cell.getCoordinateY() - 1));
                    openCell(getCell(cell.getCoordinateX() + 1, cell.getCoordinateY() - 1));
                    openCell(getCell(cell.getCoordinateX() - 1, cell.getCoordinateY()));
                    openCell(getCell(cell.getCoordinateX() + 1, cell.getCoordinateY()));
                    openCell(getCell(cell.getCoordinateX() - 1, cell.getCoordinateY() + 1));
                    openCell(getCell(cell.getCoordinateX(), cell.getCoordinateY() + 1));
                    openCell(getCell(cell.getCoordinateX() + 1, cell.getCoordinateY() + 1));
                }
            }
        }
    }

    private void showResults(boolean flag) {
        try
        {
            gameOver = true;

            FXMLLoader fxmlLoader = new FXMLLoader();

            fxmlLoader.setLocation(getClass().getResource("../fxml/resultOfGame.fxml"));
            Parent fxmlResultOfGame = fxmlLoader.load();
            resultOfGameController = fxmlLoader.getController();
            resultStage = new Stage();
            resultStage.setTitle("Result of game");
            resultStage.getIcons().add(new Image("sample/img/icon.png"));
            resultStage.setScene(new Scene(fxmlResultOfGame));
            resultStage.setResizable(false);
            resultStage.initModality(Modality.WINDOW_MODAL);
            resultStage.initOwner(window_8x8);
            resultOfGameController.setLabels(flag, currentDate, 64 - closedCells,
                    64 - cellsWithBomb.size(), cellsWithBomb.size());
            resultStage.show();
        }
        catch (Exception e)
        {
            gameOver = true;
            MenuController.stage_8x8.close();
            Main.menuStage.close();
            System.out.println("8x8Controller:showResults");
            e.printStackTrace();
        }
    }

    private void openAllBombs(Cell cell) {
        Iterator<Cell> iterator = cellsWithBomb.iterator();
        while (iterator.hasNext())
        {
            Cell currentCell = iterator.next();
            if(!currentCell.equals(cell))
            {
                Image image = imageWithBomb;
                currentCell.setImage(image);
            }
        }
    }

    private Image chooseImage(Cell im) {
        switch (im.getNumberOfBombsAround())
        {
            case 0: return imageZeroBomb;
            case 1: return imageOneBomb;
            case 2: return imageTwoBombs;
            case 3: return imageThreeBombs;
            case 4: return imageFourBombs;
            case 5: return imageFiveBombs;
            case 6: return imageSixBombs;
            case 7: return imageSevenBombs;
            case 8: return imageEightBombs;
        }
        return null;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Cell.number = 0;
        gameOver = false;
        closedCells = 64;
        window_8x8 = null;
        cellsWithBomb = new HashSet<>();
        cellsWithFlag = new HashSet<>();
        Random random = new Random();
        initializeCells();

        ArrayList<Integer> randomArray = new ArrayList<>();
        ArrayDeque<Pair<Integer, Integer>> rowWithOverflows = new ArrayDeque<>();

        for(int i = 0; i < 8; ++i)
            randomArray.add(random.nextInt(256));

        for(int i = 0; i < 8; ++i)
        {
            int count = 0;
            for(int offset = 0; offset < 8; ++offset)
            {
                if((1 << offset & randomArray.get(i)) != 0)
                {
                    if((offset > 0 && offset < 7 && (1 << offset - 1 & randomArray.get(i)) != 0 && (1 << offset + 1 & randomArray.get(i)) != 0)
                       ||(i > 0 && i < 7 && (1 << offset & randomArray.get(i - 1)) != 0 && (1 << offset & randomArray.get(i + 1)) != 0))
                              randomArray.set(i, randomArray.get(i) & ~(1 << offset));
                    else
                    {
                        cellsWithBomb.add(getCell(i, 7 - offset));
                        ++count;
                    }
                }
            }
            if(count > 2)
                rowWithOverflows.add(new Pair(i, count));
        }

        if(cellsWithBomb.size() >= 13)
            deleteSomeBombs(rowWithOverflows, randomArray);

/*
        System.out.println();
        for(int i = 0; i < 8; ++i)
            System.out.println(Integer.toBinaryString(randomArray.get(i)));
*/
        CountBombsAroundCells(randomArray);

        updateLabelBombs();

        currentDate.setTime(0);

        new Thread(new TimeThread(this)).start();
    }

    private void initializeCells()
    {
        for(int i = 0; i < 8; ++i)
            for (int j = 0; j < 8; ++j)
            {
                getCell(i, j).setImage(imageClosed);
                getCell(i, j).setOpened(false);
            }
    }

    public void updateTime(Date date)
    {
        SimpleDateFormat formatForTime = new SimpleDateFormat("mm:ss");
        String time = "Время: " + formatForTime.format(date);
        currentDate = date;
        lblTime.setText(time);
    }

    private void updateLabelBombs()
    {
        int res = cellsWithBomb.size() - cellsWithFlag.size();
        if(res >= 0)
            lblBombs.setText("Количество бомб: " + res);
    }

    private void deleteSomeBombs(ArrayDeque<Pair<Integer, Integer>> rowWithOverflows, ArrayList<Integer> randomArray) {
        while (!rowWithOverflows.isEmpty())
        {
            Pair<Integer, Integer> rowAndCount = rowWithOverflows.pollFirst();
            for (int offset = 0; offset < 8 && rowAndCount.getValue() > 2; ++offset)
            {
                if(rowAndCount.getKey() % 2 == 0)
                {
                    if((1 << offset & randomArray.get(rowAndCount.getKey())) != 0)
                    {
                        randomArray.set(rowAndCount.getKey(), randomArray.get(rowAndCount.getKey()) & ~(1 << offset));
                        rowAndCount = new Pair<>(rowAndCount.getKey(), rowAndCount.getValue() - 1);
                        cellsWithBomb.remove(getCell(rowAndCount.getKey(), 7 - offset));
                    }
                }
                else
                    if((1 << 7 - offset & randomArray.get(rowAndCount.getKey())) != 0)
                    {
                        randomArray.set(rowAndCount.getKey(), randomArray.get(rowAndCount.getKey()) & ~(1 << 7 - offset));
                        rowAndCount = new Pair<>(rowAndCount.getKey(), rowAndCount.getValue() - 1);
                        cellsWithBomb.remove(getCell(rowAndCount.getKey(), offset));
                    }
            }
        }

        while (cellsWithBomb.size() >= 13)
        {
            Random random = new Random();
            int row = random.nextInt(8);
            randomArray.set(row, 0);
            for(int y = 0; y < 8; ++y)
                cellsWithBomb.remove(getCell(row, y));
        }
    }

    private void CountBombsAroundCells(ArrayList<Integer> randomArray) {
        for(int i = 0; i < 8; ++i)
            for (int j = 0; j < 8; ++j)
            {
                int count = 0;


                if(0 < i && i < 7 && 0 < j && j < 7)
                {
                    count += ((randomArray.get(i - 1) >> 7 - j + 1) & 1) + ((randomArray.get(i - 1) >> 7 - j) & 1) + ((randomArray.get(i - 1) >> 7 - j - 1) & 1);
                    count += ((randomArray.get(i) >> 7 - j + 1) & 1) + ((randomArray.get(i) >> 7 - j - 1) & 1);
                    count += ((randomArray.get(i + 1) >> 7 - j + 1) & 1) + ((randomArray.get(i + 1) >> 7 - j) & 1) + ((randomArray.get(i + 1) >> 7 - j - 1) & 1);
                }

                if(j == 0)
                {
                    count = ((randomArray.get(i) >> 7 - j - 1) & 1);
                    if(i != 7)
                        count += ((randomArray.get(i + 1) >> 7 - j - 1) & 1) + ((randomArray.get(i + 1) >> 7 - j) & 1);
                    if(i != 0)
                        count += ((randomArray.get(i - 1) >> 7 - j - 1) & 1) + ((randomArray.get(i - 1) >> 7 - j) & 1);
                }

                if(j == 7)
                {
                    count = ((randomArray.get(i) >> 7 - j + 1) & 1);
                    if(i != 7)
                        count += ((randomArray.get(i + 1) >> 7 - j + 1) & 1) + ((randomArray.get(i + 1) >> 7 - j) & 1);
                    if(i != 0)
                        count += ((randomArray.get(i - 1) >> 7 - j + 1) & 1) + ((randomArray.get(i - 1) >> 7 - j) & 1);
                }

                if(i == 0 && j != 0 && j != 7)
                {
                    count += ((randomArray.get(i) >> 7 - j + 1) & 1) + ((randomArray.get(i) >> 7 - j - 1) & 1);
                    count += ((randomArray.get(i + 1) >> 7 - j + 1) & 1) + ((randomArray.get(i + 1) >> 7 - j) & 1) + ((randomArray.get(i + 1) >> 7 - j - 1) & 1);
                }

                if(i == 7 && j != 0 && j != 7)
                {
                    count += ((randomArray.get(i - 1) >> 7 - j + 1) & 1) + ((randomArray.get(i - 1) >> 7 - j) & 1) + ((randomArray.get(i - 1) >> 7 - j - 1) & 1);
                    count += ((randomArray.get(i) >> 7 - j + 1) & 1) + ((randomArray.get(i) >> 7 - j - 1) & 1);
                }

                getCell(i, j).setNumberOfBombsAround(count);
            }
    }

    private Cell getCell(int x, int y)
    {
        switch (x)
        {
            case 0:
                switch (y)
                {
                    case 0: return cell00;
                    case 1: return cell01;
                    case 2: return cell02;
                    case 3: return cell03;
                    case 4: return cell04;
                    case 5: return cell05;
                    case 6: return cell06;
                    case 7: return cell07;
                }
            case 1:
                switch (y)
                {
                    case 0: return cell10;
                    case 1: return cell11;
                    case 2: return cell12;
                    case 3: return cell13;
                    case 4: return cell14;
                    case 5: return cell15;
                    case 6: return cell16;
                    case 7: return cell17;
                }
            case 2:
                switch (y)
                {
                    case 0: return cell20;
                    case 1: return cell21;
                    case 2: return cell22;
                    case 3: return cell23;
                    case 4: return cell24;
                    case 5: return cell25;
                    case 6: return cell26;
                    case 7: return cell27;
                }
            case 3:
                switch (y)
                {
                    case 0: return cell30;
                    case 1: return cell31;
                    case 2: return cell32;
                    case 3: return cell33;
                    case 4: return cell34;
                    case 5: return cell35;
                    case 6: return cell36;
                    case 7: return cell37;
                }
            case 4:
                switch (y)
                {
                    case 0: return cell40;
                    case 1: return cell41;
                    case 2: return cell42;
                    case 3: return cell43;
                    case 4: return cell44;
                    case 5: return cell45;
                    case 6: return cell46;
                    case 7: return cell47;
                }
            case 5:
                switch (y)
                {
                    case 0: return cell50;
                    case 1: return cell51;
                    case 2: return cell52;
                    case 3: return cell53;
                    case 4: return cell54;
                    case 5: return cell55;
                    case 6: return cell56;
                    case 7: return cell57;
                }
            case 6:
                switch (y)
                {
                    case 0: return cell60;
                    case 1: return cell61;
                    case 2: return cell62;
                    case 3: return cell63;
                    case 4: return cell64;
                    case 5: return cell65;
                    case 6: return cell66;
                    case 7: return cell67;
                }
            case 7:
                switch (y)
                {
                    case 0: return cell70;
                    case 1: return cell71;
                    case 2: return cell72;
                    case 3: return cell73;
                    case 4: return cell74;
                    case 5: return cell75;
                    case 6: return cell76;
                    case 7: return cell77;
                }
        }
        return null;
    }
}
