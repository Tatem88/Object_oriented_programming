package lesson_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("input a: ");
        double a = scanner.nextDouble();

        System.out.println("input b: ");
        double b = scanner.nextDouble();

        Complex complexA = new Complex(a, 0);
        Complex complexB = new Complex(b, 0);

        Complex add = calculator.add(complexA, complexB);
        System.out.println("addition result: " + add);

        Complex multiply = calculator.multiply(complexA,complexB);
        System.out.println("multiplication result: " + multiply);

        Complex divide = calculator.divide(complexA,complexB);
        System.out.println("division result: " + divide);

        scanner.close();
    }
}
