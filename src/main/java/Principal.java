import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num1, num2, num3, solucion = 0;

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

        if (operacion.equals("+")) {
            solucion = num1 + num2;
        } else if (operacion.equals("-")) {
            solucion = num1 - num2;
        } else if (operacion.equals("*")) {
            solucion = num1 * num2;
        } else if (operacion.equals("/")) {
            if (num2 == 0) {
                System.out.println("ERROR: División por cero");
                err = true;
            } else {
                solucion = num1 / num2;
            }
        } else if (operacion.equals("mcm")) {
            solucion = mcm(num1, num2);
        } else if (operacion.equals("mcd")) {
            solucion = mcd(num1, num2);
        } else {
            System.out.println("Operación inválida");
            err = true;
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
