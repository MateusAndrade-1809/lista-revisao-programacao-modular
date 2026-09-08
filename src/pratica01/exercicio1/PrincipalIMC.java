package pratica01.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalIMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Exercicio 1 - IMC e Classificacao Corporal ===");

        String nome = lerTexto(scanner, "Nome: ");
        String sobrenome = lerTexto(scanner, "Sobrenome: ");
        int idade = lerInteiro(scanner, "Idade: ");
        double altura = lerDouble(scanner, "Altura em metros: ");
        double peso = lerDouble(scanner, "Peso em kg: ");

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);
        double imc = pessoa.CalculaIMC();

        System.out.println();
        System.out.println("Pessoa: " + pessoa.getNomeCompleto());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Classificacao: " + pessoa.InformaObesidade());

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

    private static double lerDouble(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim().replace(',', '.');

            try {
                double valor = Double.parseDouble(entrada);
                if (valor > 0) {
                    return valor;
                }
                System.out.println("Digite um valor maior que zero.");
            } catch (NumberFormatException erro) {
                System.out.println("Digite um numero valido.");
            }
        }
    }
}
