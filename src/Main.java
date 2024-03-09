//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

/**
 * @author Alejandro Hernandez Aranda DAM1B
 *
 * Esta clase sirve como enlace entre todas las clases (Suma, Resta, Multiplicar y Division),
 * asi como un menu para realizar dichas operaciones.
 * En resumen, una calculadora simple.
 */


public class Main {

    /**
     * @Param num1 Numero 1, es el primer numero que introducirá el usuario por consola
     * @Param num2 Numero2. Segundo numero introducido por el usuario por consola. Ambos
     * numeros se utilizarán para las diversas operaciones de este proyecto.
     */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion = "";

        do {
            System.out.println("------------------------");
            System.out.println("Calculadora");

            double num1 = 0;
            double num2 = 0;

            System.out.println("----------Menu----------");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("0.Salir");
            System.out.println("------------------------");
            System.out.println("Escoge una opcion");
            opcion = sc.nextLine();
            System.out.println("------------------------");
            switch (opcion) {
                case "1":
                    System.out.println("Suma");
                    CalcSuma(num1, num2);
                    break;

                case "2":
                    System.out.println("Resta");
                    CalcResta(num1, num2);
                    break;

                case "3":
                    System.out.println("Multiplicar");
                    CalcMulti(num1, num2);
                    break;

                case "4":
                    System.out.println("Dividir");
                    CalcDiv(num1, num2);
                    break;

                case "0":
                    System.out.println("Hasta otra");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }

        } while (!opcion.equalsIgnoreCase("0")) ;
    }

    public static void CalcSuma(double num1, double num2){
        /**
         * Este metodo implementará la clase
         * {@link Suma}
         */

        Suma Suma = new Suma();

        System.out.println("Escribe el primer numero");
        num1 = sc.nextDouble();

        System.out.println("Escribe el segundo numero");
        num2 = sc.nextDouble();

        System.out.println("El resultado de la operacion es "+Suma.Suma(num1, num2));
        sc.nextLine();
    }

    public static void CalcResta(double num1, double num2){
        Resta Resta = new Resta();

        /**
         * Este metodo implementará la clase
         * {@link Resta}
         */

        System.out.println("Escribe el primer numero");
        num1 = sc.nextDouble();

        System.out.println("Escribe el segundo numero");
        num2 = sc.nextDouble();

        System.out.println("El resultado de la operacion es " + Resta.Resta(num1, num2));
        sc.nextLine();
    }

    public static void CalcMulti(double num1, double num2){
        /**
         * Este metodo implementará la clase
         * {@link Multiplicar}
         */

        Multiplicar Multiplicar = new Multiplicar();

        System.out.println("Escribe el primer numero");
        num1 = sc.nextDouble();

        System.out.println("Escribe el segundo numero");
        num2 = sc.nextDouble();

        System.out.println("El resultado de la operacion es " + Multiplicar.Multiplicar(num1, num2));
        sc.nextLine();
    }

    public static void CalcDiv(double num1, double num2){
        /**
         * Este metodo implementará la clase
         * {@link Division}
         */

        Division Division = new Division();

        System.out.println("Escribe el primer numero");
        num1 = sc.nextDouble();

        System.out.println("Escribe el segundo numero");
        num2 = sc.nextDouble();
        if(num2 == 0){
            System.out.println("El resultado de la division es 0");
        }else {
            System.out.println("El resultado de la division es " + Division.Dividir(num1, num2));
            sc.nextLine();
        }

    }


}