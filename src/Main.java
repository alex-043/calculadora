//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Calculadora");

        double num1 = 0;
        double num2 = 0;

        System.out.println("Escribe el primer numero");
        num1 = sc.nextDouble();
        System.out.println("Escribe el segundo numero");
        num2 = sc.nextDouble();

        System.out.println("------Menu------");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");


    }
}