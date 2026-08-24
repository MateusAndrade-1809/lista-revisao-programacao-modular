import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiorIdade = 0;
        int menorIdade = 0;
        int quantidadeHabitantes = 0;
        int quantidadeMulheres = 0;

        System.out.println("Digite -1 na idade para encerrar.");
        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        while (idade != -1) {
            System.out.println("Sexo: 1 - masculino | 2 - feminino");
            System.out.print("Sexo: ");
            int sexo = entrada.nextInt();

            System.out.println("Olhos: 1 - azuis | 2 - verdes | 3 - castanhos");
            System.out.print("Cor dos olhos: ");
            int olhos = entrada.nextInt();

            System.out.println("Cabelos: 1 - louros | 2 - castanhos | 3 - pretos");
            System.out.print("Cor dos cabelos: ");
            int cabelos = entrada.nextInt();

            if (quantidadeHabitantes == 0) {
                maiorIdade = idade;
                menorIdade = idade;
            } else {
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }

                if (idade < menorIdade) {
                    menorIdade = idade;
                }
            }

            if (sexo == 2 && idade >= 18 && idade <= 35 && olhos == 2 && cabelos == 1) {
                quantidadeMulheres++;
            }

            quantidadeHabitantes++;

            System.out.print("Idade: ");
            idade = entrada.nextInt();
        }

        if (quantidadeHabitantes == 0) {
            System.out.println("Nenhum habitante foi informado.");
        } else {
            System.out.println("Maior idade = " + maiorIdade);
            System.out.println("Menor idade = " + menorIdade);
            System.out.println("Quantidade de mulheres entre 18 e 35 anos, olhos verdes e cabelos louros = " + quantidadeMulheres);
        }

        entrada.close();
    }
}
