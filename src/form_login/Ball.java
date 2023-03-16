package form_login;

import java.awt.*;
import javax.swing.*;

import lesson31.vehicle;

import java.awt.event.*;
import java.util.*;

public class Ball extends Rectangle {

    Random random;
    int xVelcocity;
    int yVelcocity;
    int initialSpeed = 2;

    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();
        int ramdomXDirection = random.nextInt(2);
        if (ramdomXDirection == 0)
            ramdomXDirection--;
        setXDirection(ramdomXDirection * initialSpeed);

        random = new Random();
        int ramdomYDirection = random.nextInt(2);
        if (ramdomYDirection == 0)
            ramdomYDirection--;
        setYDirection(ramdomYDirection * initialSpeed);

    }

    public void setXDirection(int ramdomXDirection) {
        xVelcocity = ramdomXDirection;
    }

    public void setYDirection(int ramdomYDirection) {
        yVelcocity = ramdomYDirection;
    }

    public void move() {
        x += xVelcocity;
        y += yVelcocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, height, width);
    }
}
