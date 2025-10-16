package org.example.homework;

public class DrawShapes implements Drawable{

    @Override
    public void idraw(Shape shape) {
        System.out.println("Draw a " + shape.getShapeName());
    }
}
