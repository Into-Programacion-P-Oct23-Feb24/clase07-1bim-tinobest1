/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //permite ingresar datos por teclado y poner decimales
        int limite;
        int contador = 1;
        System.out.println("Ingrese el límite");
        limite = entrada.nextInt(); //9
        while (contador <= limite) {

            if (contador % 2 != 0) {

                System.out.printf("Contador %d\n", contador);

            }
            contador = contador + 1;

        }
    }
}
