/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

/**
 *
 * @author jaime armira                     
 */
import java.util.Scanner;
public class palindrome {
    public void palindrome () {
    Scanner teclado = new Scanner(System.in); 
        String nombre, nombre1 = "",nombre2 = ""; 
        System.out.println("Ingrese un nombre"); 
        nombre = teclado.nextLine();
        for (int i = 0; i < nombre.length(); i++) { 
        	if(nombre.codePointAt(i)>96 && nombre.codePointAt(i)<123) {
	            nombre1 = nombre1 + nombre.charAt(i);
        	}
        }
        
        for (int i = nombre.length()-1; i >= 0; i--) { 
        	if(nombre.codePointAt(i)>96 && nombre.codePointAt(i)<123) {
	            nombre2 = nombre2 + nombre.charAt(i);
        	}
        }
                
        if (nombre1.equals(nombre2)) { 
            System.out.println("La palabra es palindroma");  
        }else{
            System.out.println("No es palindroma");
        }
 
	}
   }

