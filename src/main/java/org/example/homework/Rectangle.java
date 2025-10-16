package org.example.homework;

public class Rectangle extends Shape{

    private int length;
    private int width;
    private String name = "Rectangle";

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String getShapeName() {

        return name;
    }
}
