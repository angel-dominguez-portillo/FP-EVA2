/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class PRACTICA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String text;
        Scanner captu = new Scanner(System.in);
        System.out.println("Escribe: ");
        text = captu.nextLine();
        System.out.println("Cuantas veces: ");
        num = captu.nextInt();
        for(int i = 1; i<= num; i++){
        System.out.println(text);
        }
    }
}
