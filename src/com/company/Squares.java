package com.company;

import java.util.Arrays;

public class Squares {
    private Square[] squares;

    public Square getSquare(int index) {
        return squares[index];
    }

    public void setSquare(Square square, int index) {
        this.squares[index] = square;
    }

    public Squares(int n) {
        squares = new Square[n];
    }

    @Override
    public String toString() {
        return "Squares{" +
                "squares=" + Arrays.toString(squares) + getAreage() +
                '}';
    }

    public double getAreage() {
        for (Square square : squares) {
            area = area + square.GetAreSquare();
        }
        return area;
    }

    public double area = 0;
}
