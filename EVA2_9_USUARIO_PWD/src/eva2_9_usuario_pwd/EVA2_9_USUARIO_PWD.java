/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_9_USUARIO_PWD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, contra;
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("Usuario: ");
            nombre = captu.nextLine();
            System.out.println("Contraseña: ");
            contra = captu.nextLine();
        }while(! (nombre.equals("Angel Dominguez") &&  contra.equals("1B")));
        System.out.println("¡Bienbenido!");
    }
}