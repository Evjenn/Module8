package org.example.homework;


public class Triangle extends Shape{
    private String name = "Triangle" ;
    private int edgeA;
    private int edgeB;
    private int edgeC;

    public int getEdgeA() {
        return edgeA;
    }

    public void setEdgeA(int edgeA) {
        this.edgeA = edgeA;
    }

    public int getEdgeB() {
        return edgeB;
    }

    public void setEdgeB(int edgeB) {
        this.edgeB = edgeB;
    }

    public int getEdgeC() {
        return edgeC;
    }

    public void setEdgeC(int edgeC) {
        this.edgeC = edgeC;
    }

    public Triangle() {
    }

    @Override
    public String getShapeName() {
        return name;
    }
}
