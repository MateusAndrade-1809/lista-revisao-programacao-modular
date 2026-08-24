import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.print("Digite o valor de x: ");
        numeros[0] = entrada.nextInt();

        System.out.print("Digite o valor de y: ");
        numeros[1] = entrada.nextInt();

        System.out.print("Digite o valor de z: ");
        numeros[2] = entrada.nextInt();

        int x = numeros[0];
        int y = numeros[1];
        int z = numeros[2];

        int maior = x;
        int menor = x;

        if (y > maior) {
            maior = y;
        }

        if (z > maior) {
            maior = z;
        }

        if (y < menor) {
            menor = y;
        }

        if (z < menor) {
            menor = z;
        }

        System.out.println("Maior numero = " + maior);
        System.out.println("Menor numero = " + menor);

        if (x >= y && x <= z) {
            System.out.println("O numero x esta dentro do intervalo [y, z].");
        } else {
            System.out.println("O numero x esta fora do intervalo [y, z].");
        }

        if (y == 0 || z == 0) {
            System.out.println("Nao e possivel testar divisao por zero.");
        } else if (x % y == 0 && x % z == 0) {
            System.out.println("x e divisivel por y e por z.");
        } else {
            System.out.println("x nao e divisivel por y e por z ao mesmo tempo.");
        }

        entrada.close();
    }
}
