package org.example.homework;

public class Rhombus extends Shape{
    private int edgeA;
    private String name = "Rhombus";

    public int getEdgeA() {
        return edgeA;
    }

    public void setEdgeA(int edgeA) {
        this.edgeA = edgeA;
    }

    @Override
    public String getShapeName() {

        return name;
    }
}
