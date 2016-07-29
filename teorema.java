import java.util.Scanner;
import java.lang.Math; // Funciones matematicas.
public class teorema{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double catOpuesto, catAdyacente, hipotenusa;
        int opcion;
        System.out.print("1. Obtener cateto adyacente.\n2. Obtener cateto opuesto.\n3. Obtener cateto hipotenusa.\nSeleccione una opcion: ");
        opcion = teclado.nextInt();
        if(opcion == 1){
            System.out.print("Teclee la hipotenusa: ");
            hipotenusa = teclado.nextDouble();
            System.out.print("Teclee el cateto opuesto: ");
            catOpuesto = teclado.nextDouble();
            catAdyacente = Math.sqrt((hipotenusa*hipotenusa)-(catOpuesto*catOpuesto));
            System.out.println("El cateto adyacente es: "+catAdyacente);
            
        }
        else if(opcion == 2){
            System.out.print("Teclee la hipotenusa: ");
            hipotenusa = teclado.nextDouble();
            System.out.print("Teclee el cateto adyacente: ");
            catAdyacente = teclado.nextDouble();
            catOpuesto = Math.sqrt((hipotenusa*hipotenusa)-(catAdyacente*catAdyacente));
            System.out.println("El cateto opuesto es: "+catOpuesto);
        }
        else if(opcion == 3){
            System.out.print("Teclee el cateto opuesto: ");
            catOpuesto = teclado.nextDouble();
            System.out.print("Teclee el cateto adyacente: ");
            catAdyacente = teclado.nextDouble();
            hipotenusa = catAdyacente = Math.sqrt((catAdyacente*catAdyacente)+(catOpuesto*catOpuesto));
            System.out.println("La hipotenusa es: "+hipotenusa);
        }
        else
            System.out.println("Error: la opcion que selecciono no existe.");
    }
} // Elaboro: Everth Neftaly Torres Alvarez.