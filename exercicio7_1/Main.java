package exercicio7_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double primeiroMaior = 0;
        double segundoMaior = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número: ");
            numeros.add(sc.nextDouble());
        }

        primeiroMaior = numeros.get(0);

        for (int i = 0; i < numeros.size(); i++) {
            if (primeiroMaior < numeros.get(i)) {
                primeiroMaior = numeros.get(i);
            }
            numeros.remove(primeiroMaior);
        }

        for (int i = 0; i < numeros.size(); i++) {
            if (segundoMaior < numeros.get(i)) {
                segundoMaior = numeros.get(i);
            }
        }

        System.out.println("1 Maior: " + primeiroMaior + ", 2 Maior:" + segundoMaior);
    }
}
