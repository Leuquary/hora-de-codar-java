package exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valorTotal = 0;
        int media = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor");
            double num = sc.nextDouble();
            sc.nextLine();
            valorTotal += num;
            media++;
        }

        System.out.println(valorTotal / media);
    }
}
