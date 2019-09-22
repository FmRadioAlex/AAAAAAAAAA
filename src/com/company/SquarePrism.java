package com.company;

public class SquarePrism extends Square {
    double height=1;
    public SquarePrism(double size,double height) {
        super(size=size);
        this.height=height;
    }

    public double GetAreaSquarePrisma(){
        return GetAreSquare()*2+4*(size*height);
    }
    public double GetVolumeSquarePrisma(){
        return GetAreSquare()*height;
    }
    @Override
    public String toString() {
        return "SquarePrism{" +
                "height=" + height +'}'+
                "\n\tAreaSquarePrisma="+GetAreaSquarePrisma()+
                "\n\tVolumeSquardPrisma="+GetVolumeSquarePrisma();
    }

}
