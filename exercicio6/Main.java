package exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double num1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o segundo valor: ");
        double num2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o terceiro valor: ");
        double num3 = sc.nextDouble();
        sc.nextLine();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O número " + num1 + " é o maior");
        }

        if (num2 > num1 && num2 > num3) {
            System.out.println("O número " + num2 + " é o maior");
        }

        if (num3 > num2 && num3 > num1) {
            System.out.println("O número " + num3 + " é o maior");
        }
    }
}
