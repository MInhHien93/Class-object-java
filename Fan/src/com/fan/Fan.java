package com.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius =5;
    private String color = "blue";

    public void Fan() {}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed == FAST) {
            this.speed = 3;
        } else if (speed == MEDIUM) {
            this.speed = 2;
        } else if (speed == SLOW) {
            this.speed = 1;
        } else {
            return;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on == true) {
            return  "Fan{" +
                    " speed=" + speed +
                    ", Fan is on" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return  "Fan{" +
                    " speed=" + speed +
                    " Fan is off" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
