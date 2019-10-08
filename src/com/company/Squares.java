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
            area = area + square.getSquareArea();
        }
        return area;
    }

    public double area = 0;

    public double getMaxArea()
    {
        double squareArea = 0;
        for (Square square:this.squares){
            if (square.getSquareArea() > squareArea)
                squareArea = square.getSquareArea();
        }
        return squareArea;
    }

    public int getMaxAreaIndex()
    {
        int index = 0;
        for (int i = 1; i < squares.length; i++) {

            if (squares[i].getSquareArea() > squares[index].getSquareArea())
                index =  i;
        }
        return index;
    }
}
