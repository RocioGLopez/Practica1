

package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int avanzar;

    public static void main(String[] args) {
        //menu inicial
        //inicio del menu

        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int opcion;


        do {

            //desplegar el menu
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println(" 1. Iniciar Juego ");
            System.out.println(" 2. Renaudar Juego ");
            System.out.println(" 3. Generar Reportes ");
            System.out.println(" 4. Salir ");


            try {
                System.out.println(" Ingrese la opción que desea realizar: ");
                opcion = entrada.nextInt();

//estructura del Switch para realizar las operaciones

                switch (opcion) {
                    case 1:
                        System.out.println("INiCIO DeL JUeGO\n  ");
                        //inicio del tablero veamos como queda


                        String jugador = "@";
                        String penalizacion = "#";

                        /*[0][n]*/
                        char[][] tablero = {{45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45},
/*[1][]*/                                {124, 32, 32, 54, 52, 124, 32, 32, 54, 51, 124, 32, 32, 54, 50, 124, 32, 32, 54, 49, 124, 32, 32, 54, 48, 124, 32, 32, 53, 57, 124, 32, 32, 53, 56, 124, 32, 32, 53, 55, 124},
/*[2][]*/                                {124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124},
/*[3][]*/                                {45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45},

/*[4][]*/                                {124, 32, 32, 52, 57, 124, 32, 32, 53, 48, 124, 32, 32, 53, 49, 124, 32, 32, 53, 50, 124, 32, 32, 53, 51, 124, 32, 32, 53, 52, 124, 32, 32, 53, 53, 124, 32, 32, 53, 54, 124},
/*[5][]*/                                {124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124},
/*[6][]*/                                {45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45},

/*[7][]*/                                {124, 32, 32, 52, 56, 124, 32, 32, 52, 55, 124, 32, 32, 52, 54, 124, 32, 32, 52, 53, 124, 32, 32, 52, 52, 124, 32, 32, 52, 51, 124, 32, 32, 52, 50, 124, 32, 32, 52, 49, 124},
/*[8][]*/                                {124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124},
/*[9][]*/                                {45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45},

/*[10][]*/                                {124, 32, 32, 51, 51, 124, 32, 32, 51, 52, 124, 32, 32, 51, 53, 124, 32, 32, 51, 54, 124, 32, 32, 51, 55, 124, 32, 32, 51, 56, 124, 32, 32, 51, 57, 124, 32, 32, 52, 48, 124},
/*[11][]*/                                {124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124},
/*[12][]*/                                {45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45},

/*[13][]*/                                {124, 32, 32, 51, 50, 124, 32, 32, 51, 49, 124, 32, 32, 51, 48, 124, 32, 32, 50, 57, 124, 32, 32, 50, 56, 124, 32, 32, 50, 55, 124, 32, 32, 50, 54, 124, 32, 32, 50, 53, 124},
/*[14][]*/                               {124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124},
/*[15][]*/                                {45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45},

/*[16][]*/                                {124, 32, 32, 49, 55, 124, 32, 32, 49, 56, 124, 32, 32, 49, 57, 124, 32, 32, 50, 48, 124, 32, 32, 50, 49, 124, 32, 32, 50, 50, 124, 32, 32, 50, 51, 124, 32, 32, 50, 52, 124},
/*[17][]*/                                {124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124},
/*[18][]*/                                {45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45},

/*[19][]*/                                {124, 32, 32, 49, 54, 124, 32, 32, 49, 53, 124, 32, 32, 49, 52, 124, 32, 32, 49, 51, 124, 32, 32, 49, 50, 124, 32, 32, 49, 49, 124, 32, 32, 49, 48, 124, 32, 32, 32, 57, 124},
/*[20][]*/                                {124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124},
/*[21][]*/                                {45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45},


/*[22][]*/                                {124, 32, 32, 32, 49, 124, 32, 32, 32, 50, 124, 32, 32, 32, 51, 124, 32, 32, 32, 52, 124, 32, 32, 32, 53, 124, 32, 32, 32, 54, 124, 32, 32, 32, 55, 124, 32, 32, 32, 56, 124},
/*[23][]*/                                {124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124, 32, 32, 32, 32, 124},
/*[24][]*/                                {45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45},
                                /*[0][0]   1   2   3   4    5   6  7   */
                        };
// los numero que salen en el tablero son html, probar en consola real si sirve...

                        //numero 1
                        tablero[22][4] = 49;
                        //@
                        tablero[23][2] = 64;

                        //columnas                           fila
                        // 4  9  14  19  24  29  34  39       2  5  8  11  14  17  20  23
                        // 1  2   3   4   5   6   7  8        1  2  3   4   5   6   7   8
                        //suma 5,10,15                    suma 3,6,9..
                        //+(5*i)                            +(3*i)
                        //el random de las penalizaciones

                        int Cp = (int) ((Math.random() * 9));
                        int Fp = (int) ((Math.random() * 9));

//if que me recorre las filas 2, 5, 11.. 23, pero solo lo recorre 1 vez

// if y fors para poner las penalizaciones randoms
                        for (int i = 0; i < 8; i++) {
                            tablero[2 + (3 * i)][4 + (5 * (int) (Math.random() * 4))] = 35;
                            tablero[2 + (3 * i)][4 + (5 * (int) (Math.random() * 4 + 4))] = 35;
                        }

                        if (tablero[23][4] == 35) {
                            tablero[23][4] = 32;

                            tablero[23][9 + (5 * (int) (Math.random() * 8))] = 35;
                        }
                        for (int i = 0; i < (int) ((Math.random() * 3 + 2)); i++) {
                            tablero[2 + (3 * i)][4 + (5 * (int) (Math.random() * 8))] = 35;

                        }
                        for (int i = 5; i < (int) ((Math.random() * 3 + 6)); i++) {
                            tablero[2 + (3 * i)][4 + (5 * (int) (Math.random() * 8))] = 35;
                            tablero[2 + (3 * i)][4 + (5 * (int) (Math.random() * 8))] = 35;

                        }

                        //core el tablero en pantalla
                        for (int i = 0; i < tablero.length; i++) {
                            //System.out.print("|");
                            for (int j = 0; j < tablero[0].length; j++) {
                                System.out.print(tablero[i][j] + "");
//                               if(j!= tablero[i].length-1);
//                                    System.out.println("\t")
                            }
                            System.out.print("\n");
                        }

//el random de las penalizaciones


                        // System.out.println(jugador);


                        // dadito ranrandom
                        int lanzamiento = (int) (Math.random() * 5 + 2);

                        int k = 0;
                        do {
                            System.out.println("El Juego ha comenzado");
                            try {

                                System.out.println("Deseas avanzar? si = 1, no = 0");
                                avanzar = entrada.nextInt();


                                System.out.println("TIRANDO EL DADO ... \n" + "EL NÚMERO DEL DADO ES: " + lanzamiento);

                                //luego que tire dado, el jugador avanzara x numero hacia delante del vector
                                //este es el primero movimiento

                                tablero[23][2] = 32; // casilla vacia
                                tablero[23][2 + lanzamiento] = 49;
                                for (int i = 0; i < 8; i++) {
                                    //for (int j = 0; j < tablero.length; j++) {


                                        switch (tablero[23][i]) {
                                            case 35:
                                                System.out.println("¡Has caído en una penalización!");
                                                System.out.println("Deberas realizar una prueba!!");
                                                //prueba al azar facil, media, dificil
                                                //reconocidad     1       2       3
                                                int prueba =(int) (Math.random() * 3+1);
                                                System.out.println("Realizara una prueba de dificultad: " +prueba);
                                                if (prueba == 3) {
                                                    System.out.println("PRUEBA DIFICIL\n DIVICION DE MATRICES");
                                                    //opcion 1

                                                    





                                                }if (prueba == 2) {
                                                    System.out.println("PRUEBA FACIL");

                                                }if (prueba == 1) {
                                                    System.out.println("PRUEBA FACIL");

                                                }





                                                break;
                                        }


                                   // }
                                }
                                System.out.println("juego ha quedado en pausa");


                            } catch (InputMismatchException e) {
                                System.out.println("¡¡¡Debes insertar un número!!!");
                                // utilizar el nombre de la variable de entrada, y solo .next para que jale bien el trycatch
                                entrada.next();
                            }
                        k++;
                        } while (k < 1);


                        //sistema de juego que de alguna manera tienen que salir y no usar el case2
                        //int opcion =3;
                        System.out.println("EL JUEGO HA TERMINADO");

                        break;
                    case 2:
                        // si y solo si el juego no ha terminado
                        System.out.println("RENaUDAR JUeGO");
//                        if (casiila_usada <=64) {
//
//


                        break;
                    case 3:
                        System.out.println("REPoRTES");
//usando 3 decimales!!!
                        double d = 7435.9876;
                        double roundDbl = Math.round(d*1000.0)/1000.0;
                        System.out.println("Rounded Double value: "+roundDbl);

                        break;
                    case 4:

                        salir = true;

                        System.out.println("SAlIR DeL JUeGO");

                        System.out.println("Has salido exitosamente del juego!");
                        break;

                    default:
                        System.out.println("Ha ingresado una opción incorrecta");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("¡¡¡Debes insertar un número!!!");
                // utilizar el nombre de la variable de entrada, y solo .next para que jale bien el trycatch
                entrada.next();

            }
        } while (!salir);


    }


    public void tablero() {
        System.out.println("gjk");
    }
}


