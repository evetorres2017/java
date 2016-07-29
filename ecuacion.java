// x1,2 = -b +- raiz(b2 - 4ac)/ 2a formula general ecuaciones de 2do. grado
import java.util.Scanner;
import java.lang.Math;
public class ecuacion{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double x1, x2, a, b, c;
        System.out.print("Teclee el valor de a: ");
        a = teclado.nextDouble();
        System.out.print("Teclee el valor de b: ");
        b = teclado.nextDouble();
        System.out.print("Teclee el valor de c: ");
        c = teclado.nextDouble();
        x1 = ((-1*b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        x2 = ((-1*b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        System.out.println("Valor de x1: "+x1);
        System.out.println("Valor de x2: "+x2);
    }
}