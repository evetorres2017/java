/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teorema;
import java.util.Scanner;
/**
 *
 * @author Everth Neftaly Torres Alvarez
 */
public class Teorema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        funciones t;
        t = new funciones();
        Scanner teclado = new Scanner(System.in);
        System.out.print("1. Obtener cateto adyacente.\n2. Obtener cateto opuesto.\n3. Obtener cateto hipotenusa.\nSeleccione una opcion: ");
        t.opcion = teclado.nextInt();
        if(t.opcion == 1){
            t.cady();
        }
        else if(t.opcion == 2){
            t.copu();
        }
        else if(t.opcion == 3){
            t.hip();
        }
        else
            System.out.println("Error: la opcion que selecciono no existe.");
    }
}