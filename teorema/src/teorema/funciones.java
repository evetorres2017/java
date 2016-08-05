/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teorema;
import java.util.Scanner;
import java.lang.Math; // Funciones matematicas.

/**
 *
 * @author Everth Neftaly Torres Alvarez
 */
public class funciones {
    Scanner leer = new Scanner(System.in);
    double catOpuesto, catAdyacente, hipotenusa;
    int opcion;
    public void cady(){
        System.out.print("Teclee la hipotenusa: ");
        hipotenusa = leer.nextDouble();
        System.out.print("Teclee el cateto opuesto: ");
        catOpuesto = leer.nextDouble();
        catAdyacente = Math.sqrt((hipotenusa*hipotenusa)-(catOpuesto*catOpuesto));
        System.out.println("El cateto adyacente es: "+catAdyacente);
    }
    public void copu(){
        System.out.print("Teclee la hipotenusa: ");
        hipotenusa = leer.nextDouble();
        System.out.print("Teclee el cateto adyacente: ");
        catAdyacente = leer.nextDouble();
        catOpuesto = Math.sqrt((hipotenusa*hipotenusa)-(catAdyacente*catAdyacente));
        System.out.println("El cateto opuesto es: "+catOpuesto);
    }
    public void hip(){
        System.out.print("Teclee el cateto opuesto: ");
        catOpuesto = leer.nextDouble();
        System.out.print("Teclee el cateto adyacente: ");
        catAdyacente = leer.nextDouble();
        hipotenusa = catAdyacente = Math.sqrt((catAdyacente*catAdyacente)+(catOpuesto*catOpuesto));
        System.out.println("La hipotenusa es: "+hipotenusa);
    }
}