/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeCraps;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */
public class JuegoDeCraps {

    public static void main(String[] args) {

        int Dinero, dado1, dado2, suma = 0;

        Scanner leer = new Scanner(System.in);

        System.out.print("Cuanto Dinero apuesta: ");
        Dinero = leer.nextInt();

        while (true) {

            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;

            suma = dado1 + dado2;
//            int sumaGuardada = suma;

            System.out.println("suma" + suma);

            if (suma == 7 || suma == 11) {

                System.out.println("Usted ha ganado: " + Dinero * 2);
                System.exit(0);

            } else if (suma == 2 || suma == 3 || suma == 12) {

                System.out.println("Usted ha perdido:");
                System.exit(0);

            } else {
                int n =2;
                int x=0;
                 while(x==1) {
                    System.out.println("Vamos a la etapa " + n + ": ");

                    dado1 = (int) (Math.random() * 6) + 1;
                    dado2 = (int) (Math.random() * 6) + 1;

                    int suma2 = dado1 + dado2;
                    if (suma2 == suma) {
                        System.out.println("suma 2=" + suma2);
                        System.out.println("Usted ha ganado!!!");
                    } else if (suma2 == 7) {
                        System.out.println("Usted ha perdido");
                    } else if (true) {
                         n++;
                         
                    }
                };
//                switch (suma) {
                //
                //                    case 4:
                //                        if (suma == suma2) {
                //                            System.out.println("Usted ha PERDIDO: ");
                //                            System.exit(0);
                //                            break;
                //                        }
                //
                //                    case 5:
                //                        if (suma == suma2) {
                //                            System.out.println("Usted ha PERDIDO: ");
                //                            System.exit(0);
                //                            break;
                //                        }
                //
                //                    case 6:
                //                        if (suma == suma2) {
                //                            System.out.println("Usted ha PERDIDO: ");
                //                            System.exit(0);
                //                            break;
                //                        }
                //
                //                    case 8:
                //                        if (suma == suma2) {
                //                            System.out.println("Usted ha PERDIDO: ");
                //                            System.exit(0);
                //                            break;
                //                        }
                //                    case 9:
                //
                //                        if (suma == suma2) {
                //                            System.out.println("Usted ha PERDIDO: ");
                //                            System.exit(0);
                //                            break;
                //                        }
                //
                //                    case 10:
                //                        if (suma == suma2) {
                //                            System.out.println("Usted ha PERDIDO: ");
                //                            System.exit(0);
                //                            break;
                //                        }
                //
                //                    case 7:
                //                        if (suma == 7) {
                //                            System.out.println("Usted ha perdido: " + Dinero * 2);
                //                            System.exit(0);
                //                            break;
                //                        }
                //                   
                //                }
            
            }
        }
    }

}
