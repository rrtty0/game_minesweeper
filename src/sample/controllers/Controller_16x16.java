package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
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

public class Controller_16x16 extends SupController implements Initializable {

    @FXML private Cell cell0_0;
    @FXML private Cell cell0_1;
    @FXML private Cell cell0_2;
    @FXML private Cell cell0_3;
    @FXML private Cell cell0_4;
    @FXML private Cell cell0_5;
    @FXML private Cell cell0_6;
    @FXML private Cell cell0_7;
    @FXML private Cell cell0_8;
    @FXML private Cell cell0_9;
    @FXML private Cell cell0_10;
    @FXML private Cell cell0_11;
    @FXML private Cell cell0_12;
    @FXML private Cell cell0_13;
    @FXML private Cell cell0_14;
    @FXML private Cell cell0_15;

    @FXML private Cell cell1_0;
    @FXML private Cell cell1_1;
    @FXML private Cell cell1_2;
    @FXML private Cell cell1_3;
    @FXML private Cell cell1_4;
    @FXML private Cell cell1_5;
    @FXML private Cell cell1_6;
    @FXML private Cell cell1_7;
    @FXML private Cell cell1_8;
    @FXML private Cell cell1_9;
    @FXML private Cell cell1_10;
    @FXML private Cell cell1_11;
    @FXML private Cell cell1_12;
    @FXML private Cell cell1_13;
    @FXML private Cell cell1_14;
    @FXML private Cell cell1_15;

    @FXML private Cell cell2_0;
    @FXML private Cell cell2_1;
    @FXML private Cell cell2_2;
    @FXML private Cell cell2_3;
    @FXML private Cell cell2_4;
    @FXML private Cell cell2_5;
    @FXML private Cell cell2_6;
    @FXML private Cell cell2_7;
    @FXML private Cell cell2_8;
    @FXML private Cell cell2_9;
    @FXML private Cell cell2_10;
    @FXML private Cell cell2_11;
    @FXML private Cell cell2_12;
    @FXML private Cell cell2_13;
    @FXML private Cell cell2_14;
    @FXML private Cell cell2_15;

    @FXML private Cell cell3_0;
    @FXML private Cell cell3_1;
    @FXML private Cell cell3_2;
    @FXML private Cell cell3_3;
    @FXML private Cell cell3_4;
    @FXML private Cell cell3_5;
    @FXML private Cell cell3_6;
    @FXML private Cell cell3_7;
    @FXML private Cell cell3_8;
    @FXML private Cell cell3_9;
    @FXML private Cell cell3_10;
    @FXML private Cell cell3_11;
    @FXML private Cell cell3_12;
    @FXML private Cell cell3_13;
    @FXML private Cell cell3_14;
    @FXML private Cell cell3_15;

    @FXML private Cell cell4_0;
    @FXML private Cell cell4_1;
    @FXML private Cell cell4_2;
    @FXML private Cell cell4_3;
    @FXML private Cell cell4_4;
    @FXML private Cell cell4_5;
    @FXML private Cell cell4_6;
    @FXML private Cell cell4_7;
    @FXML private Cell cell4_8;
    @FXML private Cell cell4_9;
    @FXML private Cell cell4_10;
    @FXML private Cell cell4_11;
    @FXML private Cell cell4_12;
    @FXML private Cell cell4_13;
    @FXML private Cell cell4_14;
    @FXML private Cell cell4_15;

    @FXML private Cell cell5_0;
    @FXML private Cell cell5_1;
    @FXML private Cell cell5_2;
    @FXML private Cell cell5_3;
    @FXML private Cell cell5_4;
    @FXML private Cell cell5_5;
    @FXML private Cell cell5_6;
    @FXML private Cell cell5_7;
    @FXML private Cell cell5_8;
    @FXML private Cell cell5_9;
    @FXML private Cell cell5_10;
    @FXML private Cell cell5_11;
    @FXML private Cell cell5_12;
    @FXML private Cell cell5_13;
    @FXML private Cell cell5_14;
    @FXML private Cell cell5_15;


    @FXML private Cell cell6_0;
    @FXML private Cell cell6_1;
    @FXML private Cell cell6_2;
    @FXML private Cell cell6_3;
    @FXML private Cell cell6_4;
    @FXML private Cell cell6_5;
    @FXML private Cell cell6_6;
    @FXML private Cell cell6_7;
    @FXML private Cell cell6_8;
    @FXML private Cell cell6_9;
    @FXML private Cell cell6_10;
    @FXML private Cell cell6_11;
    @FXML private Cell cell6_12;
    @FXML private Cell cell6_13;
    @FXML private Cell cell6_14;
    @FXML private Cell cell6_15;

    @FXML private Cell cell7_0;
    @FXML private Cell cell7_1;
    @FXML private Cell cell7_2;
    @FXML private Cell cell7_3;
    @FXML private Cell cell7_4;
    @FXML private Cell cell7_5;
    @FXML private Cell cell7_6;
    @FXML private Cell cell7_7;
    @FXML private Cell cell7_8;
    @FXML private Cell cell7_9;
    @FXML private Cell cell7_10;
    @FXML private Cell cell7_11;
    @FXML private Cell cell7_12;
    @FXML private Cell cell7_13;
    @FXML private Cell cell7_14;
    @FXML private Cell cell7_15;

    @FXML private Cell cell8_0;
    @FXML private Cell cell8_1;
    @FXML private Cell cell8_2;
    @FXML private Cell cell8_3;
    @FXML private Cell cell8_4;
    @FXML private Cell cell8_5;
    @FXML private Cell cell8_6;
    @FXML private Cell cell8_7;
    @FXML private Cell cell8_8;
    @FXML private Cell cell8_9;
    @FXML private Cell cell8_10;
    @FXML private Cell cell8_11;
    @FXML private Cell cell8_12;
    @FXML private Cell cell8_13;
    @FXML private Cell cell8_14;
    @FXML private Cell cell8_15;

    @FXML private Cell cell9_0;
    @FXML private Cell cell9_1;
    @FXML private Cell cell9_2;
    @FXML private Cell cell9_3;
    @FXML private Cell cell9_4;
    @FXML private Cell cell9_5;
    @FXML private Cell cell9_6;
    @FXML private Cell cell9_7;
    @FXML private Cell cell9_8;
    @FXML private Cell cell9_9;
    @FXML private Cell cell9_10;
    @FXML private Cell cell9_11;
    @FXML private Cell cell9_12;
    @FXML private Cell cell9_13;
    @FXML private Cell cell9_14;
    @FXML private Cell cell9_15;

    @FXML private Cell cell10_0;
    @FXML private Cell cell10_1;
    @FXML private Cell cell10_2;
    @FXML private Cell cell10_3;
    @FXML private Cell cell10_4;
    @FXML private Cell cell10_5;
    @FXML private Cell cell10_6;
    @FXML private Cell cell10_7;
    @FXML private Cell cell10_8;
    @FXML private Cell cell10_9;
    @FXML private Cell cell10_10;
    @FXML private Cell cell10_11;
    @FXML private Cell cell10_12;
    @FXML private Cell cell10_13;
    @FXML private Cell cell10_14;
    @FXML private Cell cell10_15;

    @FXML private Cell cell11_0;
    @FXML private Cell cell11_1;
    @FXML private Cell cell11_2;
    @FXML private Cell cell11_3;
    @FXML private Cell cell11_4;
    @FXML private Cell cell11_5;
    @FXML private Cell cell11_6;
    @FXML private Cell cell11_7;
    @FXML private Cell cell11_8;
    @FXML private Cell cell11_9;
    @FXML private Cell cell11_10;
    @FXML private Cell cell11_11;
    @FXML private Cell cell11_12;
    @FXML private Cell cell11_13;
    @FXML private Cell cell11_14;
    @FXML private Cell cell11_15;

    @FXML private Cell cell12_0;
    @FXML private Cell cell12_1;
    @FXML private Cell cell12_2;
    @FXML private Cell cell12_3;
    @FXML private Cell cell12_4;
    @FXML private Cell cell12_5;
    @FXML private Cell cell12_6;
    @FXML private Cell cell12_7;
    @FXML private Cell cell12_8;
    @FXML private Cell cell12_9;
    @FXML private Cell cell12_10;
    @FXML private Cell cell12_11;
    @FXML private Cell cell12_12;
    @FXML private Cell cell12_13;
    @FXML private Cell cell12_14;
    @FXML private Cell cell12_15;

    @FXML private Cell cell13_0;
    @FXML private Cell cell13_1;
    @FXML private Cell cell13_2;
    @FXML private Cell cell13_3;
    @FXML private Cell cell13_4;
    @FXML private Cell cell13_5;
    @FXML private Cell cell13_6;
    @FXML private Cell cell13_7;
    @FXML private Cell cell13_8;
    @FXML private Cell cell13_9;
    @FXML private Cell cell13_10;
    @FXML private Cell cell13_11;
    @FXML private Cell cell13_12;
    @FXML private Cell cell13_13;
    @FXML private Cell cell13_14;
    @FXML private Cell cell13_15;

    @FXML private Cell cell14_0;
    @FXML private Cell cell14_1;
    @FXML private Cell cell14_2;
    @FXML private Cell cell14_3;
    @FXML private Cell cell14_4;
    @FXML private Cell cell14_5;
    @FXML private Cell cell14_6;
    @FXML private Cell cell14_7;
    @FXML private Cell cell14_8;
    @FXML private Cell cell14_9;
    @FXML private Cell cell14_10;
    @FXML private Cell cell14_11;
    @FXML private Cell cell14_12;
    @FXML private Cell cell14_13;
    @FXML private Cell cell14_14;
    @FXML private Cell cell14_15;

    @FXML private Cell cell15_0;
    @FXML private Cell cell15_1;
    @FXML private Cell cell15_2;
    @FXML private Cell cell15_3;
    @FXML private Cell cell15_4;
    @FXML private Cell cell15_5;
    @FXML private Cell cell15_6;
    @FXML private Cell cell15_7;
    @FXML private Cell cell15_8;
    @FXML private Cell cell15_9;
    @FXML private Cell cell15_10;
    @FXML private Cell cell15_11;
    @FXML private Cell cell15_12;
    @FXML private Cell cell15_13;
    @FXML private Cell cell15_14;
    @FXML private Cell cell15_15;

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

    private Window window_16x16;

    private ResultOfGameController resultOfGameController;

    public static Stage resultStage;

    private Date currentDate = new Date();;

    public void clickedAction(MouseEvent mouseEvent) {

        Object object = mouseEvent.getSource();
        Cell cell = (Cell) object;

        if(window_16x16 == null)
            window_16x16 = ((Node)mouseEvent.getSource()).getScene().getWindow();

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
                cell.setImage(imageBombed);
                cell.setOpened(true);
                openAllBombs(cell);
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
            resultStage.initOwner(window_16x16);
            resultOfGameController.setLabels(flag, currentDate, 256 - closedCells,
                    256 - cellsWithBomb.size(), cellsWithBomb.size());
            resultStage.show();
        }
        catch (Exception e)
        {
            gameOver = true;
            MenuController.stage_16x16.close();
            Main.menuStage.close();
            System.out.println("16x16Controller:showResults");
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
        closedCells = 256;
        window_16x16 = null;
        cellsWithBomb = new HashSet<>();
        cellsWithFlag = new HashSet<>();
        Random random = new Random();
        initializeCells();

        ArrayList<Integer> randomArray = new ArrayList<>();
        ArrayDeque<Pair<Integer, Integer>> rowWithOverflows = new ArrayDeque<>();

        for(int i = 0; i < 16; ++i)
            randomArray.add(random.nextInt(65536));

        for(int i = 0; i < 16; ++i)
        {
            int count = 0;
            for(int offset = 0; offset < 16; ++offset)
            {
                if((1 << offset & randomArray.get(i)) != 0)
                {
                    if((offset > 0 && offset < 15 && (1 << offset - 1 & randomArray.get(i)) != 0 && (1 << offset + 1 & randomArray.get(i)) != 0)
                            ||(i > 0 && i < 15 && (1 << offset & randomArray.get(i - 1)) != 0 && (1 << offset & randomArray.get(i + 1)) != 0))
                        randomArray.set(i, randomArray.get(i) & ~(1 << offset));
                    else
                    {
                        cellsWithBomb.add(getCell(i, 15 - offset));
                        ++count;
                    }
                }
            }
            if(count > 4)
                rowWithOverflows.add(new Pair(i, count));
        }

        if(cellsWithBomb.size() >= 50)
            deleteSomeBombs(rowWithOverflows, randomArray);

        /*
        System.out.println();
        for(int i = 0; i < 16; ++i)
            System.out.println(Integer.toBinaryString(randomArray.get(i)));
*/
        CountBombsAroundCells(randomArray);

        updateLabelBombs();

        currentDate.setTime(0);

        new Thread(new TimeThread(this)).start();
    }

    private void initializeCells()
    {
        for(int i = 0; i < 16; ++i)
            for (int j = 0; j < 16; ++j)
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
            for (int offset = 0; offset < 16 && rowAndCount.getValue() > 4; ++offset)
            {
                if(rowAndCount.getKey() % 2 == 0)
                {
                    if((1 << offset & randomArray.get(rowAndCount.getKey())) != 0)
                    {
                        randomArray.set(rowAndCount.getKey(), randomArray.get(rowAndCount.getKey()) & ~(1 << offset));
                        rowAndCount = new Pair<>(rowAndCount.getKey(), rowAndCount.getValue() - 1);
                        cellsWithBomb.remove(getCell(rowAndCount.getKey(), 15 - offset));
                    }
                }
                else
                if((1 << 15 - offset & randomArray.get(rowAndCount.getKey())) != 0)
                {
                    randomArray.set(rowAndCount.getKey(), randomArray.get(rowAndCount.getKey()) & ~(1 << 15 - offset));
                    rowAndCount = new Pair<>(rowAndCount.getKey(), rowAndCount.getValue() - 1);
                    cellsWithBomb.remove(getCell(rowAndCount.getKey(), offset));
                }
            }
        }

        /*
        System.out.println();
        for(int i = 0; i < 8; ++i)
            System.out.println(Integer.toBinaryString(randomArray.get(i)));*/

        while (cellsWithBomb.size() >= 50)
        {
            Random random = new Random();
            int row = random.nextInt(16);
            randomArray.set(row, 0);
            for(int y = 0; y < 16; ++y)
                cellsWithBomb.remove(getCell(row, y));
        }
    }

    private void CountBombsAroundCells(ArrayList<Integer> randomArray) {
        for(int i = 0; i < 16; ++i)
            for (int j = 0; j < 16; ++j)
            {
                int count = 0;


                if(0 < i && i < 15 && 0 < j && j < 15)
                {
                    count += ((randomArray.get(i - 1) >> 15 - j + 1) & 1) + ((randomArray.get(i - 1) >> 15 - j) & 1) + ((randomArray.get(i - 1) >> 15 - j - 1) & 1);
                    count += ((randomArray.get(i) >> 15 - j + 1) & 1) + ((randomArray.get(i) >> 15 - j - 1) & 1);
                    count += ((randomArray.get(i + 1) >> 15 - j + 1) & 1) + ((randomArray.get(i + 1) >> 15 - j) & 1) + ((randomArray.get(i + 1) >> 15 - j - 1) & 1);
                }

                if(j == 0)
                {
                    count = ((randomArray.get(i) >> 15 - j - 1) & 1);
                    if(i != 15)
                        count += ((randomArray.get(i + 1) >> 15 - j - 1) & 1) + ((randomArray.get(i + 1) >> 15 - j) & 1);
                    if(i != 0)
                        count += ((randomArray.get(i - 1) >> 15 - j - 1) & 1) + ((randomArray.get(i - 1) >> 15 - j) & 1);
                }

                if(j == 15)
                {
                    count = ((randomArray.get(i) >> 15 - j + 1) & 1);
                    if(i != 15)
                        count += ((randomArray.get(i + 1) >> 15 - j + 1) & 1) + ((randomArray.get(i + 1) >> 15 - j) & 1);
                    if(i != 0)
                        count += ((randomArray.get(i - 1) >> 15 - j + 1) & 1) + ((randomArray.get(i - 1) >> 15 - j) & 1);
                }

                if(i == 0 && j != 0 && j != 15)
                {
                    count += ((randomArray.get(i) >> 15 - j + 1) & 1) + ((randomArray.get(i) >> 15 - j - 1) & 1);
                    count += ((randomArray.get(i + 1) >> 15 - j + 1) & 1) + ((randomArray.get(i + 1) >> 15 - j) & 1) + ((randomArray.get(i + 1) >> 15 - j - 1) & 1);
                }

                if(i == 15 && j != 0 && j != 15)
                {
                    count += ((randomArray.get(i - 1) >> 15 - j + 1) & 1) + ((randomArray.get(i - 1) >> 15 - j) & 1) + ((randomArray.get(i - 1) >> 15 - j - 1) & 1);
                    count += ((randomArray.get(i) >> 15 - j + 1) & 1) + ((randomArray.get(i) >> 15 - j - 1) & 1);
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
                    case 0: return cell0_0;
                    case 1: return cell0_1;
                    case 2: return cell0_2;
                    case 3: return cell0_3;
                    case 4: return cell0_4;
                    case 5: return cell0_5;
                    case 6: return cell0_6;
                    case 7: return cell0_7;
                    case 8: return cell0_8;
                    case 9: return cell0_9;
                    case 10: return cell0_10;
                    case 11: return cell0_11;
                    case 12: return cell0_12;
                    case 13: return cell0_13;
                    case 14: return cell0_14;
                    case 15: return cell0_15;
                }
            case 1:
                switch (y)
                {
                    case 0: return cell1_0;
                    case 1: return cell1_1;
                    case 2: return cell1_2;
                    case 3: return cell1_3;
                    case 4: return cell1_4;
                    case 5: return cell1_5;
                    case 6: return cell1_6;
                    case 7: return cell1_7;
                    case 8: return cell1_8;
                    case 9: return cell1_9;
                    case 10: return cell1_10;
                    case 11: return cell1_11;
                    case 12: return cell1_12;
                    case 13: return cell1_13;
                    case 14: return cell1_14;
                    case 15: return cell1_15;
                }
            case 2:
                switch (y)
                {
                    case 0: return cell2_0;
                    case 1: return cell2_1;
                    case 2: return cell2_2;
                    case 3: return cell2_3;
                    case 4: return cell2_4;
                    case 5: return cell2_5;
                    case 6: return cell2_6;
                    case 7: return cell2_7;
                    case 8: return cell2_8;
                    case 9: return cell2_9;
                    case 10: return cell2_10;
                    case 11: return cell2_11;
                    case 12: return cell2_12;
                    case 13: return cell2_13;
                    case 14: return cell2_14;
                    case 15: return cell2_15;
                }
            case 3:
                switch (y)
                {
                    case 0: return cell3_0;
                    case 1: return cell3_1;
                    case 2: return cell3_2;
                    case 3: return cell3_3;
                    case 4: return cell3_4;
                    case 5: return cell3_5;
                    case 6: return cell3_6;
                    case 7: return cell3_7;
                    case 8: return cell3_8;
                    case 9: return cell3_9;
                    case 10: return cell3_10;
                    case 11: return cell3_11;
                    case 12: return cell3_12;
                    case 13: return cell3_13;
                    case 14: return cell3_14;
                    case 15: return cell3_15;
                }
            case 4:
                switch (y)
                {
                    case 0: return cell4_0;
                    case 1: return cell4_1;
                    case 2: return cell4_2;
                    case 3: return cell4_3;
                    case 4: return cell4_4;
                    case 5: return cell4_5;
                    case 6: return cell4_6;
                    case 7: return cell4_7;
                    case 8: return cell4_8;
                    case 9: return cell4_9;
                    case 10: return cell4_10;
                    case 11: return cell4_11;
                    case 12: return cell4_12;
                    case 13: return cell4_13;
                    case 14: return cell4_14;
                    case 15: return cell4_15;
                }
            case 5:
                switch (y)
                {
                    case 0: return cell5_0;
                    case 1: return cell5_1;
                    case 2: return cell5_2;
                    case 3: return cell5_3;
                    case 4: return cell5_4;
                    case 5: return cell5_5;
                    case 6: return cell5_6;
                    case 7: return cell5_7;
                    case 8: return cell5_8;
                    case 9: return cell5_9;
                    case 10: return cell5_10;
                    case 11: return cell5_11;
                    case 12: return cell5_12;
                    case 13: return cell5_13;
                    case 14: return cell5_14;
                    case 15: return cell5_15;
                }
            case 6:
                switch (y)
                {
                    case 0: return cell6_0;
                    case 1: return cell6_1;
                    case 2: return cell6_2;
                    case 3: return cell6_3;
                    case 4: return cell6_4;
                    case 5: return cell6_5;
                    case 6: return cell6_6;
                    case 7: return cell6_7;
                    case 8: return cell6_8;
                    case 9: return cell6_9;
                    case 10: return cell6_10;
                    case 11: return cell6_11;
                    case 12: return cell6_12;
                    case 13: return cell6_13;
                    case 14: return cell6_14;
                    case 15: return cell6_15;
                }
            case 7:
                switch (y)
                {
                    case 0: return cell7_0;
                    case 1: return cell7_1;
                    case 2: return cell7_2;
                    case 3: return cell7_3;
                    case 4: return cell7_4;
                    case 5: return cell7_5;
                    case 6: return cell7_6;
                    case 7: return cell7_7;
                    case 8: return cell7_8;
                    case 9: return cell7_9;
                    case 10: return cell7_10;
                    case 11: return cell7_11;
                    case 12: return cell7_12;
                    case 13: return cell7_13;
                    case 14: return cell7_14;
                    case 15: return cell7_15;
                }
            case 8:
                switch (y)
                {
                    case 0: return cell8_0;
                    case 1: return cell8_1;
                    case 2: return cell8_2;
                    case 3: return cell8_3;
                    case 4: return cell8_4;
                    case 5: return cell8_5;
                    case 6: return cell8_6;
                    case 7: return cell8_7;
                    case 8: return cell8_8;
                    case 9: return cell8_9;
                    case 10: return cell8_10;
                    case 11: return cell8_11;
                    case 12: return cell8_12;
                    case 13: return cell8_13;
                    case 14: return cell8_14;
                    case 15: return cell8_15;
                }
            case 9:
                switch (y)
                {
                    case 0: return cell9_0;
                    case 1: return cell9_1;
                    case 2: return cell9_2;
                    case 3: return cell9_3;
                    case 4: return cell9_4;
                    case 5: return cell9_5;
                    case 6: return cell9_6;
                    case 7: return cell9_7;
                    case 8: return cell9_8;
                    case 9: return cell9_9;
                    case 10: return cell9_10;
                    case 11: return cell9_11;
                    case 12: return cell9_12;
                    case 13: return cell9_13;
                    case 14: return cell9_14;
                    case 15: return cell9_15;
                }
            case 10:
                switch (y)
                {
                    case 0: return cell10_0;
                    case 1: return cell10_1;
                    case 2: return cell10_2;
                    case 3: return cell10_3;
                    case 4: return cell10_4;
                    case 5: return cell10_5;
                    case 6: return cell10_6;
                    case 7: return cell10_7;
                    case 8: return cell10_8;
                    case 9: return cell10_9;
                    case 10: return cell10_10;
                    case 11: return cell10_11;
                    case 12: return cell10_12;
                    case 13: return cell10_13;
                    case 14: return cell10_14;
                    case 15: return cell10_15;
                }
            case 11:
                switch (y)
                {
                    case 0: return cell11_0;
                    case 1: return cell11_1;
                    case 2: return cell11_2;
                    case 3: return cell11_3;
                    case 4: return cell11_4;
                    case 5: return cell11_5;
                    case 6: return cell11_6;
                    case 7: return cell11_7;
                    case 8: return cell11_8;
                    case 9: return cell11_9;
                    case 10: return cell11_10;
                    case 11: return cell11_11;
                    case 12: return cell11_12;
                    case 13: return cell11_13;
                    case 14: return cell11_14;
                    case 15: return cell11_15;
                }
            case 12:
                switch (y)
                {
                    case 0: return cell12_0;
                    case 1: return cell12_1;
                    case 2: return cell12_2;
                    case 3: return cell12_3;
                    case 4: return cell12_4;
                    case 5: return cell12_5;
                    case 6: return cell12_6;
                    case 7: return cell12_7;
                    case 8: return cell12_8;
                    case 9: return cell12_9;
                    case 10: return cell12_10;
                    case 11: return cell12_11;
                    case 12: return cell12_12;
                    case 13: return cell12_13;
                    case 14: return cell12_14;
                    case 15: return cell12_15;
                }
            case 13:
                switch (y)
                {
                    case 0: return cell13_0;
                    case 1: return cell13_1;
                    case 2: return cell13_2;
                    case 3: return cell13_3;
                    case 4: return cell13_4;
                    case 5: return cell13_5;
                    case 6: return cell13_6;
                    case 7: return cell13_7;
                    case 8: return cell13_8;
                    case 9: return cell13_9;
                    case 10: return cell13_10;
                    case 11: return cell13_11;
                    case 12: return cell13_12;
                    case 13: return cell13_13;
                    case 14: return cell13_14;
                    case 15: return cell13_15;
                }
            case 14:
                switch (y)
                {
                    case 0: return cell14_0;
                    case 1: return cell14_1;
                    case 2: return cell14_2;
                    case 3: return cell14_3;
                    case 4: return cell14_4;
                    case 5: return cell14_5;
                    case 6: return cell14_6;
                    case 7: return cell14_7;
                    case 8: return cell14_8;
                    case 9: return cell14_9;
                    case 10: return cell14_10;
                    case 11: return cell14_11;
                    case 12: return cell14_12;
                    case 13: return cell14_13;
                    case 14: return cell14_14;
                    case 15: return cell14_15;
                }
            case 15:
                switch (y)
                {
                    case 0: return cell15_0;
                    case 1: return cell15_1;
                    case 2: return cell15_2;
                    case 3: return cell15_3;
                    case 4: return cell15_4;
                    case 5: return cell15_5;
                    case 6: return cell15_6;
                    case 7: return cell15_7;
                    case 8: return cell15_8;
                    case 9: return cell15_9;
                    case 10: return cell15_10;
                    case 11: return cell15_11;
                    case 12: return cell15_12;
                    case 13: return cell15_13;
                    case 14: return cell15_14;
                    case 15: return cell15_15;
                }
        }
        return null;
    }
}