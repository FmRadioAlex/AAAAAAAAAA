package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Square square ;
        SquarePrism squarePrism;
        Scanner str =new Scanner(System.in);
        double size=-1;
        double height=-1;
        System.out.print("Ведите сторону квадрата=");
        while (Square.CheckSizeSquare(""+(size=str.nextDouble()))<0)
        {
            if (size<0){
                System.out.print("Не надо ломать мой (∩ᄑ_ᄑ)⊃━☆ﾟ*･｡*･:≡( ε:) -0ВЖУХ код тут работает магия"+
                        "\n\tЛадно дам тебе еще попытку:"+"");
            }

        }

        square =new Square(size);
        System.out.println(square);
        System.out.print("Ведите высоту призмы=");
        while (Square.CheckSizeSquare(""+(height=str.nextDouble()))<0)
        {
            if (height<0){
                System.out.print("Не надо ломать мой (∩ᄑ_ᄑ)⊃━☆ﾟ*･｡*･:≡( ε:) ВЖУХ ОСТОРОЖНО!!!! тут работает магия"+
                        "\n\tЛадно дам тебе еще попытку:"+"");
            }

        }
        squarePrism=new SquarePrism(size,height);
        System.out.println(squarePrism);

    }
}
