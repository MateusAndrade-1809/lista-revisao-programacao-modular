import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos do vetor X: ");
        int n = entrada.nextInt();

        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("X[" + i + "]: ");
            x[i] = entrada.nextInt();
        }

        System.out.print("Digite a quantidade de elementos do vetor Y: ");
        int m = entrada.nextInt();

        int[] y = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Y[" + i + "]: ");
            y[i] = entrada.nextInt();
        }

        int[] z = new int[n + m];
        int quantidadeZ = 0;

        for (int i = 0; i < n; i++) {
            boolean existe = false;

            for (int j = 0; j < quantidadeZ; j++) {
                if (z[j] == x[i]) {
                    existe = true;
                }
            }

            if (!existe) {
                z[quantidadeZ] = x[i];
                quantidadeZ++;
            }
        }

        for (int i = 0; i < m; i++) {
            boolean existe = false;

            for (int j = 0; j < quantidadeZ; j++) {
                if (z[j] == y[i]) {
                    existe = true;
                }
            }

            if (!existe) {
                z[quantidadeZ] = y[i];
                quantidadeZ++;
            }
        }

        System.out.println("Vetor uniao Z:");

        for (int i = 0; i < quantidadeZ; i++) {
            System.out.println("Z[" + i + "] = " + z[i]);
        }

        entrada.close();
    }
}
