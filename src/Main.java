//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion = "";

        do {
            System.out.println("-----------");
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
                    Suma Suma = new Suma();

                    System.out.println("Escribe el primer numero");
                    num1 = sc.nextDouble();
                    Suma.setNum(num1);

                    System.out.println("Escribe el segundo numero");
                    num2 = sc.nextDouble();
                    Suma.setNum2(num2);
                    System.out.println("El resultado de la suma es "+Suma.Suma(num1, num2));
                    sc.nextLine();

                    break;
                case "2":
                    System.out.println("Resta");
                    Resta Resta = new Resta();

                    System.out.println("Escribe el primer numero");
                    num1 = sc.nextDouble();
                    Resta.setNum(num1);

                    System.out.println("Escribe el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.println("El resultado de la resta es" + Resta.Resta(num1, num2));
                    sc.nextLine();
                    break;

                case "3":
                    System.out.println("Multiplicar");
                    break;
                case "4":
                    System.out.println("Dividir");
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }

        } while (!opcion.equalsIgnoreCase("0")) ;
    }
}