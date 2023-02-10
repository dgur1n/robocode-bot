package ua.dh.robocode;

import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;
import java.util.Random;

public class First extends Robot {

    @Override
    public void setColors(Color bodyColor, Color gunColor, Color radarColor) {

    }

    @Override
    public void run() {
        setColors(Color.YELLOW, Color.BLACK, Color.BLACK, Color.RED, Color.PINK);
        Random rnd = new Random();
        while (true) {
            int where = rnd.nextInt(4);
            int distance = rnd.nextInt(200);
            int degree = rnd.nextInt(180);
            if (where == 0) {
                ahead(distance);
            }
            else if (where == 1) {
                turnRight(degree);
                ahead(distance);
            }
            else if (where == 2) {
                turnLeft(degree);
                ahead(distance);
            }
            else if (where == 3) {
                back(distance);
            } else {
                // do nothing for now
            }

            turnGunRight(360);
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }
}
