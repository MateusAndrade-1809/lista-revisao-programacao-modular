import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] vendas = new double[12][4];
        double[] totalSemanas = new double[4];
        double totalAno = 0;

        String[] meses = {
            "janeiro", "fevereiro", "marco", "abril",
            "maio", "junho", "julho", "agosto",
            "setembro", "outubro", "novembro", "dezembro"
        };

        for (int mes = 0; mes < 12; mes++) {
            System.out.println("Vendas de " + meses[mes]);

            for (int semana = 0; semana < 4; semana++) {
                System.out.print("Semana " + (semana + 1) + ": R$ ");
                vendas[mes][semana] = entrada.nextDouble();
            }
        }

        System.out.println("Total vendido em cada mes:");

        for (int mes = 0; mes < 12; mes++) {
            double totalMes = 0;

            for (int semana = 0; semana < 4; semana++) {
                totalMes = totalMes + vendas[mes][semana];
                totalSemanas[semana] = totalSemanas[semana] + vendas[mes][semana];
            }

            totalAno = totalAno + totalMes;

            System.out.println(meses[mes] + " = R$ " + totalMes);
        }

        System.out.println("Total vendido em cada semana durante todo o ano:");

        for (int semana = 0; semana < 4; semana++) {
            System.out.println("Semana " + (semana + 1) + " = R$ " + totalSemanas[semana]);
        }

        System.out.println("Total vendido pela loja no ano = R$ " + totalAno);

        entrada.close();
    }
}
