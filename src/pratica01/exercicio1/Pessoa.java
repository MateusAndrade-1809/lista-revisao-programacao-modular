package pratica01.exercicio1;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public double CalculaIMC() {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }

        imc = peso / (altura * altura);
        return imc;
    }

    public String InformaObesidade() {
        double valorImc = imc > 0 ? imc : CalculaIMC();

        if (valorImc < 18.5) {
            return "Abaixo do peso";
        } else if (valorImc < 25.0) {
            return "Peso normal";
        } else if (valorImc < 30.0) {
            return "Sobrepeso";
        } else if (valorImc < 35.0) {
            return "Obesidade grau I";
        } else if (valorImc < 40.0) {
            return "Obesidade grau II";
        }

        return "Obesidade grau III";
    }
}
