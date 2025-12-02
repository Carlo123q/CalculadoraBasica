import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num1, num2,num3, solucion=0;



        System.out.print("introduce el primer numero: ");
        while (!entrada.hasNextInt()){
            System.out.println("ERROR!!! El tipo de dato es incorrecto, pon un numero entero");
            entrada.next();
        }
        num1 = entrada.nextInt();
        System.out.print("Introduce el segundo numero: ");
        while (!entrada.hasNextInt()){
            System.out.println("ERROR!!! Tipo de dato es incorrecto, pon un numero entero");
            entrada.next();
        }
        num2 = entrada.nextInt();

        System.out.print("Introduce la operacion (+, -): ");
        Scanner eleccion= new Scanner(System.in);
        String operacion = eleccion.nextLine();


        boolean err = false; //para evitar que algo se cumpla si paso por un camino n

        if (operacion.equals("+")){
            num3 = (num1 + num2);
            solucion=num3;
        }else if (operacion.equals("-")){
            num3=num1-num2;
            solucion=num3;
        } else {System.out.println("Operación inválida");
            err=true;}//n

        if(!err){  //n

            System.out.println(num1 + operacion + num2 +" = "+ solucion);
        }
    }
}
