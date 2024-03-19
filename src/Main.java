
import nuevoCelular.Iphone; // se importa desde otro package

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variables
        Scanner leer = new Scanner(System.in);
        String marca;
        String color;

        // proceso
        System.out.println("Ingrese marca");
        marca = leer.nextLine();

        System.out.println("Ingrese color");
        color = leer.nextLine();

        // instanciar clase
        Android android1 = new Android(marca, color);
        Android android2 = new Android(5, "Samsung", "rojo", 256, 5000);

        Iphone iphone1 = new Iphone(marca, color);
        Android iphone2 = new Android(5, "Samsung", "rojo", 256, 5000);
        

        android2.setColor("azul");
        android1.llamar(); // llamando...

        // salida
        System.out.println("Info del celu");
        System.out.println("Marca: " + android1.getMarca());
        System.out.println("Marca iphone1: " + iphone1.getMarca());
        System.out.println("Marca iphone2: " + iphone2.getMarca());
        System.out.println("Color: " + android1.getColor());

        System.out.println("Info: " + android2);
        System.out.println("Info: " + android2.getMarca()+" "+android2.getColor());


        leer.close();
    }
}