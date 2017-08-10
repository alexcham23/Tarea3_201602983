/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

/**
 *
 * @author alejandro armira
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class menu {
       public void metodo1(){
 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("MENÚ");
            System.out.println("1. Usuarios");
            System.out.println("2. Palabras Palíndromes");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1://llamando  al menu2
                        menu2 llamada=new menu2();
                        llamada.metodo2();
                        break;
                    case 2://llamado a la clase palindrome 
                      palindrome call =new palindrome();
                      call.palindrome();
                        break;
                    case 3://salida definitiva del programa
                        salir = true;
                        break;
                                               
                                 
                    default://permite avisarle al usuario que que solo puede utilizar cierto rango para elegir  
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();//nos permitira avisarle al usuario que no esta usando numeros si no letras
            }
            }
        }

     }