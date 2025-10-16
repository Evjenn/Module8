package org.example.homework;

public class Circle extends Shape{
    private  int diameter;
    private String name = "Circle";

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String getShapeName() {

        return name;
    }
}
