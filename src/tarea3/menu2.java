/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alejandro armira
 */
public class menu2 {
    public void metodo2(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opc; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("Menú de Usuarios");
            System.out.println("1. Ingresar Usuarios");
            System.out.println("2. Mostrar Usuario Personalizado");
            System.out.println("3. Menú Principal");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opc = sn.nextInt();
 
                switch (opc) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
            }
    }
}
