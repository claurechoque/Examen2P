public class Main {
    public static void main(String[] args) {

            Suma suma = new Suma();

            // Ejemplos de llamadas a los métodos sobrecargados
            System.out.println("Suma de dos enteros: " + suma.sumar(9, 12));
            System.out.println("Suma de tres enteros: " + suma.sumar(8, 6, 5));

            System.out.println("Suma de dos números double: " + suma.sumar(2.8, 3.6));
            System.out.println("Suma de tres números double: " + suma.sumar(1.3, 2.4, 3.5));
        }
    }
