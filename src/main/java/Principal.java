import java.util.Scanner;

/**
 * @author Equipo Patata
 * @version 1.1
 * @since 9/12/25
 *
 * Clase que actúa como una calculadora para realizar diferentes operaciones
 * matemáticas básicas entre dos números.
 *
 * <p>
 * Se pueden realizar las siguientes operaciones:
 * </p>
 *
 * <ul>
 *     <li><b>Suma (+):</b> Suma dos números enteros.</li>
 *     <li><b>Resta (-):</b> Resta el segundo número al primero.</li>
 *     <li><b>Multiplicación (*):</b> Multiplica dos números enteros.</li>
 *     <li><b>División (/):</b> Divide el primer número entre el segundo,
 *         controlando la división por cero.</li>
 *     <li><b>MCD:</b> Calcula el máximo común divisor de dos números.</li>
 *     <li><b>MCM:</b> Calcula el mínimo común múltiplo de dos números.</li>
 * </ul>
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num1, num2, solucion = 0;



        System.out.print("introduce el primer numero: ");
        while (!entrada.hasNextInt()) {
            System.out.println("ERROR!!! El tipo de dato es incorrecto, pon un numero entero");
            entrada.next();
        }
        num1 = entrada.nextInt();

        System.out.print("Introduce el segundo numero: ");
        while (!entrada.hasNextInt()) {
            System.out.println("ERROR!!! Tipo de dato es incorrecto, pon un numero entero");
            entrada.next();
        }
        num2 = entrada.nextInt();

        System.out.print("Introduce la operacion (+, -, *, /, mcm, mcd): ");
        Scanner eleccion = new Scanner(System.in);
        String operacion = eleccion.nextLine();

        boolean err = false;

        switch (operacion) {
            case "+" -> solucion = num1 + num2;
            case "-" -> solucion = num1 - num2;
            case "*" -> solucion = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("ERROR: División por cero");
                    err = true;
                } else {
                    solucion = num1 / num2;
                }
            }
            case "mcm" -> solucion = mcm(num1, num2);
            case "mcd" -> solucion = mcd(num1, num2);
            default -> {
                System.out.println("Operación inválida");
                err = true;
            }
        }

        if (!err) {
            System.out.println(num1 + " " + operacion + " " + num2 + " = " + solucion);
        }
    }

    public static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static int mcm(int a, int b) {
        return Math.abs(a * b) / mcd(a, b);
    }
}
