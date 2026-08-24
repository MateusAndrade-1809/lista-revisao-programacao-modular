import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] precos = new double[10];
        int[] quantidades = new int[10];
        double totalGeral = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Objeto " + (i + 1));

            System.out.print("Valor unitario: R$ ");
            precos[i] = entrada.nextDouble();

            System.out.print("Quantidade vendida: ");
            quantidades[i] = entrada.nextInt();
        }

        int posicaoMaisVendido = 0;

        System.out.println("RELATORIO DE VENDAS");

        for (int i = 0; i < 10; i++) {
            double totalObjeto = precos[i] * quantidades[i];
            totalGeral = totalGeral + totalObjeto;

            System.out.println("Objeto " + (i + 1));
            System.out.println("Quantidade vendida = " + quantidades[i]);
            System.out.println("Valor unitario = R$ " + precos[i]);
            System.out.println("Valor total = R$ " + totalObjeto);

            if (quantidades[i] > quantidades[posicaoMaisVendido]) {
                posicaoMaisVendido = i;
            }
        }

        double comissao = totalGeral * 0.05;
        double salarioFinal = 545.00 + comissao;

        System.out.println("Valor geral das vendas = R$ " + totalGeral);
        System.out.println("Comissao do vendedor = R$ " + comissao);
        System.out.println("Salario final do vendedor = R$ " + salarioFinal);
        System.out.println("Objeto mais vendido esta na posicao " + (posicaoMaisVendido + 1));
        System.out.println("Valor unitario do objeto mais vendido = R$ " + precos[posicaoMaisVendido]);

        entrada.close();
    }
}
