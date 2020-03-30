package sample;

import javafx.scene.image.ImageView;
import javafx.util.Pair;
import sample.controllers.MenuController;

public class Cell extends ImageView {

    private boolean isOpened;
    private int coordinateX;
    private int coordinateY;
    private int numberOfBombsAround = 0;
    public static int number = 0;

    public Cell()
    {
        super();
        if(MenuController.stageNow)
        {
            coordinateX = number/8;
            coordinateY = number%8;
        }
        else
        {
            coordinateX = number/16;
            coordinateY = number%16;
        }

        ++number;
        isOpened = false;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public Pair<Integer, Integer> getCoordinate()
    {
        return new Pair<>(coordinateX, coordinateY);
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setNumberOfBombsAround(int numberOfBombsAround) {
        this.numberOfBombsAround = numberOfBombsAround;
    }

    public int getNumberOfBombsAround() {
        return numberOfBombsAround;
    }

    @Override
    public int hashCode() {
        return coordinateX * 8 + coordinateY;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(obj == null)
            return false;

        if(getClass() != obj.getClass())
            return false;

        Cell other = (Cell)obj;

        return coordinateX == other.coordinateX && coordinateY == other.coordinateY;
    }

    @Override
    public String toString() {
        return "[" + coordinateX + "," + coordinateY + "]";
    }
}
