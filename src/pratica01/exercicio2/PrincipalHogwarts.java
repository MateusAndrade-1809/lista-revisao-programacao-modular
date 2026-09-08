package pratica01.exercicio2;

import java.util.Scanner;

public class PrincipalHogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Exercicio 2 - Chapeu Seletor de Hogwarts ===");

        while (true) {
            System.out.println();
            String nome = lerTexto(scanner, "Nome do aluno: ");
            int idade = lerInteiro(scanner, "Idade: ");
            int coragem = lerInteiro(scanner, "Coragem: ");
            int inteligencia = lerInteiro(scanner, "Inteligencia: ");
            int ambicao = lerInteiro(scanner, "Ambicao: ");
            int lealdade = lerInteiro(scanner, "Lealdade: ");
            int estrategia = lerInteiro(scanner, "Estrategia: ");
            int criatividade = lerInteiro(scanner, "Criatividade: ");

            Aluno aluno = new Aluno(
                    nome,
                    idade,
                    coragem,
                    inteligencia,
                    ambicao,
                    lealdade,
                    estrategia,
                    criatividade);

            aluno.calcularCasa();

            System.out.println();
            aluno.exibirInformacoes();

            System.out.print("\nDeseja cadastrar outro aluno? (s/n): ");
            String resposta = scanner.nextLine().trim();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    private static String lerTexto(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine().trim();
    }

    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException erro) {
                System.out.println("Digite um numero inteiro valido.");
            }
        }
    }
}
