// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ejercicio 1: Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.

        System.out.println("EJERCICIO 1");

        int numeroIf = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        numeroIf = reader.nextInt(); // Escanea la siguiente entrada y la asigna a la variable numeroIf


        if (numeroIf>0) {
            System.out.println("El numero ingresado es MAYOR que cero");
        } else {
            if (numeroIf<0) {
                System.out.println("El numero ingresado es MENOR que cero");

            } else {
                System.out.println("El numero ingresado es IGUAL a cero");
            }
        }

        // Ejercicio 2: Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //
        //Mostrarlo por pantalla cada vez que se ejecute.

        System.out.println("EJERCICIO 2");

        int numeroWhile = 0;

        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        System.out.println("EJERCICIO 3");

        numeroWhile= 0;
        do{
            System.out.println("numerowhile " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile == 0);


        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
        // que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute
        // y deberá mostrarse por pantalla.

        System.out.println("EJERCICIO 4");

        for (int numeroFor = 0;numeroFor <= 3;numeroFor++){
            System.out.println("numeroFor " + numeroFor);

        }

        // Por último, para el Switch, deberás crear la variable estacion, y distintos case para las
        // cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar
        // un mensaje por consola informando de la estación en la que está.
        // También habrá que poner un default para cuando el valor de la variable no sea una estación.

        System.out.println("Ingrese la estación en la que se encuentra, 1 = primavera, 2 = verano, 3 = otoño, 5 = invierno ");

        numeroIf = reader.nextInt(); // Escanea la siguiente entrada y la asigna a la variable numeroIf

        switch (numeroIf) {
            case 1:
                System.out.println("Es primavera");
                break;
            case 2:
                System.out.println("Es verano");
                break;
            case 3:
                System.out.println("Es otoño");
                break;
            case 4:
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("no has ingresado un valor válido");
                break;

        }
        reader.close();

    }
}