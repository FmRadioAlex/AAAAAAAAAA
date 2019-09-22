package com.company;

public class Square {

    public static double CheckSizeSquare(String value) {
        double size = -1;
        try {
            size = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;

        } catch (Exception e) {
        }
        if (size == 0) {
            size = -1;
        }
        return size;
    }

    public double GetPerimetr() {

        return size * 4;
    }

    public double GetDigional() {
        return size * Math.sqrt(2);
    }

    public double GetAreSquare() {
        return size * size;
    }


    @Override
    public String toString() {
        return "Square{" + "size=" + size + '}' +
                "\n\tPerimetr=" + GetPerimetr() +
                "\n\tDigional=" + GetDigional() +
                "\n\tAreSquare=" + GetAreSquare();
    }
    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double size;
    public double max=0;
}
