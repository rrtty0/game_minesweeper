package sample;

import javafx.application.Platform;

import java.util.Date;

public class TimeThread<T extends SupController> implements Runnable {

    private final T controller;

    public TimeThread(T controller) {
        this.controller = controller;
    }

    @Override
    public void run() {
        try {
            Date dateStart = new Date();
            Thread.sleep(1000);
            while (!T.gameOver) {

                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Date dateNow = new Date();
                        controller.updateTime(new Date(dateNow.getTime() - dateStart.getTime()));
                    }
                });
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Time error");
            e.printStackTrace();

        }
    }

}

