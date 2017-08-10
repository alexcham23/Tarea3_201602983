

package tarea3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alejandro armira
 */
public class menu2 {
    private static Scanner nombre;
    public void metodo2(){
         String []  nombre =new String[5];
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opc; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("Menú de Usuarios");
            System.out.println("1. Ingresar Usuarios");
            System.out.println("2. Mostrar Todos Los Usuarios");
            System.out.println("3. Mostrar Un Usuario Personalizado");
            System.out.println("4. Menú Principal");
            System.out.println("5. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opc = sn.nextInt();
 
                switch (opc) {
                    case 1://guardara a los 5 usuarios
                       Scanner user = new Scanner(System.in);
                @SuppressWarnings("LocalVariableHidesMemberVariable")
                            
                             
                             int i = 0;
                        System.out.println("Ingresar Usuario\n");
                             for(i=0;i < 5; i++){
                            nombre[i] = user.nextLine(); 

    }
                            break;
                    case 2://mostrara los 5 usuarios guardados anteriormente 
                        System.out.println("Mostrar Todos Los Usuarios");
                                             
                        for(int k = 0 ; k < 5;  k++){
                    
                            System.out.println( nombre[k]);
                        }
                        
                        break;
                    case 3://buscaremos al usuario previamente guardado
                        System.out.println("Mostrar Un Usuario Personalizado");
                        System.out.println("Ingresar Usuario");
                        String buscar = sn.next();
                        
                        for(int r = 0;r < 5;r++ ){
                            if (buscar.equals(nombre[r])){
                                System.out.println("Usuario");
                                  System.out.println (""+nombre[r]);
                                
                                break;
                            }else
                                if (r==4 && !buscar.equals(nombre[r])){
                                System.out.println("ERROR!! No existe ningún usuario con esta coicidencia");
                                }
                        }                                                           
                        
                        break;
                    case 4: //retornara al menu principal 
                        return;
                    case 5://saldra del menu2
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                       //esto nos permitira avisar al usuario que no esta en el rango de eleccion
                       
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();// esto nos permitira avisarle que el usuario a utilizado letras en ves de numeros 
            }
            }
    }
}
