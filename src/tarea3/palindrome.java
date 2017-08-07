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
    Scanner nose =new Scanner(System.in);
    String str = nose.nextLine();
    int cont = 0;
    for(int i=0; i < str.length()-1; i++) {
if(str.charAt(i) !=str.charAt(str.length()-1-i)){
        break;
}
if(cont==0)
  System.out.println("loa");
else
   System.out.println("perro");
}
    }
   }

