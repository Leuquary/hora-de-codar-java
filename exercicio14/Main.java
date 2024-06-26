package exercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int aprovados = 0;
        boolean continuar = true;

        while (continuar) {
            double notaTotal = 0;
            int media = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.println("Digite a " + i + " nota do aluno");
                double num = sc.nextDouble();
                sc.nextLine();
                notaTotal += num;
                media++;
            }

            if ((notaTotal / media) > 6.5) {
                System.out.println("Aprovado! ");
                System.out.println("Nota do aluno: " + (notaTotal / media));
                aprovados++;
            } else {
                System.out.println("Reprovado! ");
            }

            System.out.println("Deseja cadastrar mais um aluno? 1 - S / 2 - N");
            int num = sc.nextInt();
            sc.nextLine();

            if (num != 1) {
                continuar = false;
            }
        }

        System.out.println("Alunos aprovados: " + aprovados);
    }
}
