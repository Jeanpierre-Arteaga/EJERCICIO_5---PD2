package PRACTICA_DOMICILIARIA_02.EJERCICIO_5;
import java.util.Scanner;
public class PruebaPolinomio {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // INSTANCIANDO DOS OBJETOS POLINOMIO
        System.out.println("Ingrese los coeficientes del PRIMER POLINOMIO:");
        POLINOMIO p1 = IngresarCoeficientes();
        System.out.println("\nIngrese los coeficientes del SEGUNDO POLINOMIO: ");
        POLINOMIO p2 = IngresarCoeficientes();
        
        // IMPRIMIENDO AMBOS OBJETOS
        System.out.println("\nPrimer polinomio es: " + p1);
        System.out.println("Segundo polinomio es: " + p2);

        // CALCULANDO LA SUMA ENTRE LOS DOS OBJETOS EN EL TERCER POLINOMIO
        POLINOMIO suma = p1.suma(p2);
        System.out.println("Suma: " + suma);
        System.out.println("El tercer polinomio sera: " + suma);

        // CALCULANDO EL PRODUCTO POR UN NUMERO AL TERCER POLINOMIO
        System.out.print("\nIngrese el número por el cual desea multiplicar al tercer polinomio: ");
        double numeroM = scanner.nextDouble();
        POLINOMIO producto = suma.productoPorNumero(numeroM);
        System.out.println("Producto del tercer polinomio por " + numeroM +": " + producto);

        // CALCULANDO LAS RAICES REALES DEL POLINOMIO
        double[] raices = producto.calcularRaices();
        System.out.print("\nRaíces del tercer polinomio: ");
        if (raices.length == 0) {
            System.out.println("No hay raíces reales.");
        }
        else {
            for (double raiz : raices) {
            System.out.print(raiz + " , ");
            }
            System.out.println();
        }
    }
    public static POLINOMIO IngresarCoeficientes(){
        double a,b,c;
        System.out.print(" Coeficiente principal: "); a = scanner.nextDouble();
        System.out.print(" Coeficiente lineal: "); b = scanner.nextDouble();
        System.out.print(" Termino Independiente: "); c = scanner.nextDouble();
        return new POLINOMIO(a,b,c);
    }
}