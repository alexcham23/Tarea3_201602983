
package tarea3;

/**
 *
 * @author Alejandro Armira                     
 */
import java.util.Scanner;
public class palindrome {
    public void palindrome () {
        //ESTE PROGRAMA NOS PERMITIRA SABER SI LA PALABRA SE PUEDE LEER DE IZQUIERDA A DERECHA Y VICEVERSA
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
            System.out.println("¡SI ES PALINDROMA!!!");  
        }else{
            System.out.println("¡NO ES PALINDROMA!!!");
        }
 
	}
   }

