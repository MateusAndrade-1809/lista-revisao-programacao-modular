import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int x = entrada.nextInt();

        if (x < 0) {
            System.out.println("Nao existe fatorial de numero negativo.");
        } else {
            long fatorial = 1;

            for (int i = 1; i <= x; i++) {
                fatorial = fatorial * i;
            }

            System.out.println("Fatorial de " + x + " = " + fatorial);
        }

        entrada.close();
    }
}
