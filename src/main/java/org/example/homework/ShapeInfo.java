package org.example.homework;

public class ShapeInfo {

    public void printShapeName(Shape shape){

        System.out.println(shape.getShapeName());
    }

    public void printShapeName(Shape[] shapes){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shapes.length; i++) {
            sb.append(shapes[i].getShapeName());
            if (i != shapes.length - 1) {
                sb.append(", ");
            }
        }

        System.out.println(sb);
    }
}
