package PRACTICA_DOMICILIARIA_02.EJERCICIO_5;

public class POLINOMIO {
    // ATRIBUTOS
    private double a;//coeficiente de x^2
    private double b;//coeficiente de x
    private double c;//termino independiente
    
    // CONSTRUCTOR
    public POLINOMIO(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // PARA METODO PARA SUMAR EL POLINOMIO CON OTRO
    public POLINOMIO suma(POLINOMIO otro) {
        double nuevoA = this.a + otro.a;
        double nuevoB = this.b + otro.b;
        double nuevoC = this.c + otro.c;
        return new POLINOMIO(nuevoA, nuevoB, nuevoC);
    }
    
    // METODO PARA OBTENER EL PRODUCTO POR UN NUMERO
    public POLINOMIO productoPorNumero(double numero) {
        return new POLINOMIO(this.a * numero, this.b * numero, this.c * numero);
    }
    
    // METODO PARA CALCULAR LAS RAICES DEL POLINOMIO (RETORNANDO UN ARRAY)
    public double[] calcularRaices() {
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            return new double[0]; // No hay raíces reales
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            return new double[]{raiz,raiz}; // Dos raíces reales e iguales
        } else {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return new double[]{raiz1, raiz2}; // Dos raíces reales y diferentes
        }
    }
    
    // METODO PARA DAR FORMATO DE SALIDA
    public String toString() {
        return Formato(a) + "x^2 + " + Formato(b) + "x + " + Formato(c);
    }

    //METODO PARA DAR FORMATO A LOS COEFICIENTES DEL POLINOMIO
    // TANTO SI ES INT O DOUBLE
    public Object Formato(double x){
        if(x == (long) x){
            return (int) x;
        }
        return x;
    }
}