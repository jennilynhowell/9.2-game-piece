package com.company;

public class GamePiece {

    private int positionX;
    private int positionY;
    private boolean frozen;
    private String name;
    private String color;
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;

        this.minX = 0;
        this.maxX = 25;
        this.minY = 0;
        this.maxY = 35;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }

    public void move(int x, int y) {
        if ((x >= this.minX && x <= this.maxX) && (y >= this.minY && y <= this.maxY)) {
            if (!frozen) {
                this.positionX = x;
                this.positionY = y;
            }
        }
    }

    public void freeze() {
        this.frozen = true;
    }

    public void unfreeze() {
        this.frozen = false;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Frozen? "+ this.frozen);
        System.out.println("X position: " + this.positionX);
        System.out.println("Y position: " + this.positionY);
    }
}
