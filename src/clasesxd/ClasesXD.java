/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesxd;

import java.util.Scanner;

/**
 *
 * @author lampi
 */
public class ClasesXD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("For  incremento");
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("For de 2 en 2");
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For decremento");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("For dentro de for");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            for (int j = 10; i <= 20; i++) {
            System.out.println(i*j);
    }
    }
     Scanner miConsola = new Scanner( System.in);
        System.out.println("------------------------[Ejercicio 1]-----------------------------");
        int suma =0;
        System.out.println("Suma consecutiva del 0 al 10 es: ");
        for (int i = 0; i <= 10 ; i++) {
            suma=i+suma;
        }
        System.out.println(suma);
        System.out.println("------------------------[Ejercicio 2]-----------------------------");
        System.out.println("El factorial del 1 al 10");
        //cambiar el valor para obtener el factorial del numero
        int num;
        int contador=1;
        int factorial=1;
        for (int i = 1; i < 10; i++) {
            contador = contador+1;
            factorial = factorial*contador;
        }
        System.out.println(factorial);
        System.out.println("------------------------[Ejercicio 3]-----------------------------");
        System.out.println("Factroial de un numero ingresado");
        int numx;
        int contadorx=1;
        int factorialx=1;
        System.out.println("Ingrese un numero");
        numx = miConsola.nextInt();
        for (int i = 1; i < numx; i++) {
            contadorx = contadorx+1;
            factorialx = factorialx*contadorx;
        }
        System.out.println("El factorial de "+numx+ " es "+factorialx);
        System.out.println("------------------------[Ejercicio 4]-----------------------------");
        float numy;
        int sumax=0;
        numy = miConsola.nextInt();
        System.out.println("Suma consecutiva del 0 al 10 es: ");
        for (int i = 0; i <= numy ; i++) {
            sumax=i+sumax;
        }
        System.out.println(sumax/(numy+1));
        System.out.println("------------------------[Ejercicio 6]-----------------------------");
        System.out.println("Dias de la semana");
        String [] dSemana;
        dSemana = new String [7];
        dSemana [0] = "Lunes";
        dSemana [1] = "Martes";
        dSemana [2] = "Miercoles";
        dSemana [3] = "Jueves";
        dSemana [4] = "Viernes";
        dSemana [5] = "Sabado";
        dSemana [6] = "Domingo";
    
        for (int i = 0; i < dSemana.length; i++) {
            System.out.println(dSemana[i]);    
        }
        System.out.println("------------------------[Ejercicio 7]-----------------------------");
        String[][] starwars;
        starwars = new String[10][2];
        starwars [0][0] = "Darth Vader";
        starwars [0][1] = "Yoda";
        starwars [1][0] = "Chewbacca";
        starwars [1][1] = "R2-D2";
        starwars [2][0] = "Obi-Wan Kenobi";
        starwars [2][1] = "Anakin Skywalker";
        starwars [3][0] = "Luke Skywalker";
        starwars [3][1] = "C3PO";
        starwars [4][0] = "Han Solo";
        starwars [4][1] = "Leia Skywalker";
        starwars [5][0] = "BB8";
        starwars [5][1] = "Kylo Ren";
        starwars [6][0] = "Rey";
        starwars [6][1] = "Padme Amidala";
        starwars [7][0] = "Darth Sidious";
        starwars [7][1] = "Finn";
        starwars [8][0] = "Poe Dameron";
        starwars [8][1] = "Snoke";
        starwars [9][0] = "General Hux";
        starwars [9][1] = "Jabba el Hutt";
        for (int i = 0; i < starwars.length; i++) {
            for (int j = 0; j < starwars[i].length; j++) {
                System.out.print(starwars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------[Ejercicio 8]-----------------------------");
        String [][] gato;
        gato = new String[3][3];
        gato [0][0] = "_";
        gato [0][1] = "| |";
        gato [0][2] = "_";
        gato [1][0] = " ";
        gato [1][1] = "| |";
        gato [1][2] = " ";
        gato [2][0] = "¯";
        gato [2][1] = "| |";
        gato [2][2] = "¯";
        for (int i = 0; i < gato.length; i++) {
            for (int j = 0; j < gato.length; j++) {
                    System.out.println(gato[i][j] + " ");
            }
            System.out.println();
        }
}
    }
