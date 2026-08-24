import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos em cada disciplina: ");
        int n = entrada.nextInt();

        int[] programacaoModular = new int[n];
        int[] calculo = new int[n];

        System.out.println("Digite as matriculas dos alunos de Programacao Modular:");
        for (int i = 0; i < n; i++) {
            System.out.print("Matricula " + (i + 1) + ": ");
            programacaoModular[i] = entrada.nextInt();
        }

        System.out.println("Digite as matriculas dos alunos de Calculo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Matricula " + (i + 1) + ": ");
            calculo[i] = entrada.nextInt();
        }

        System.out.println("Alunos matriculados nas duas disciplinas:");

        boolean encontrou = false;

        for (int i = 0; i < n; i++) {
            boolean jaMostrou = false;

            for (int k = 0; k < i; k++) {
                if (programacaoModular[k] == programacaoModular[i]) {
                    jaMostrou = true;
                }
            }

            if (!jaMostrou) {
                for (int j = 0; j < n; j++) {
                    if (programacaoModular[i] == calculo[j]) {
                        System.out.println(programacaoModular[i]);
                        encontrou = true;
                        j = n;
                    }
                }
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum aluno esta nas duas disciplinas.");
        }

        entrada.close();
    }
}
