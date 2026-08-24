import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char[] gabarito = new char[8];
        char[] respostas = new char[8];
        int aprovados = 0;

        System.out.println("Digite o gabarito da prova.");

        for (int i = 0; i < 8; i++) {
            System.out.print("Questao " + (i + 1) + ": ");
            String alternativa = entrada.next();
            gabarito[i] = alternativa.charAt(0);
        }

        for (int aluno = 1; aluno <= 10; aluno++) {
            System.out.print("Digite o numero do aluno " + aluno + ": ");
            int numeroAluno = entrada.nextInt();

            int nota = 0;

            System.out.println("Digite as respostas do aluno " + numeroAluno + ":");

            for (int i = 0; i < 8; i++) {
                System.out.print("Questao " + (i + 1) + ": ");
                String alternativa = entrada.next();
                respostas[i] = alternativa.charAt(0);

                if (respostas[i] == gabarito[i]) {
                    nota++;
                }
            }

            System.out.println("Aluno " + numeroAluno + " - nota = " + nota);

            if (nota >= 6) {
                aprovados++;
            }
        }

        double porcentagemAprovacao = aprovados * 100.0 / 10;

        System.out.println("Porcentagem de aprovacao = " + porcentagemAprovacao + "%");

        entrada.close();
    }
}
