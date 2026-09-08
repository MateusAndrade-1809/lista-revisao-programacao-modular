package pratica01.exercicio2;

public class Aluno {
    private String nome;
    private int idade;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int lealdade;
    private int estrategia;
    private int criatividade;
    private String casa;

    public Aluno(
            String nome,
            int idade,
            int coragem,
            int inteligencia,
            int ambicao,
            int lealdade,
            int estrategia,
            int criatividade) {
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
        this.casa = "Nao definida";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCoragem() {
        return coragem;
    }

    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getAmbicao() {
        return ambicao;
    }

    public void setAmbicao(int ambicao) {
        this.ambicao = ambicao;
    }

    public int getLealdade() {
        return lealdade;
    }

    public void setLealdade(int lealdade) {
        this.lealdade = lealdade;
    }

    public int getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(int estrategia) {
        this.estrategia = estrategia;
    }

    public int getCriatividade() {
        return criatividade;
    }

    public void setCriatividade(int criatividade) {
        this.criatividade = criatividade;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String calcularCasa() {
        double pontosGrifinoria = (2 * coragem) + lealdade;
        double pontosSonserina = (2 * ambicao) + estrategia;
        double pontosCorvinal = (2 * inteligencia) + criatividade;
        double pontosLufaLufa = ((2.0 * lealdade) + coragem) / 3.0;

        casa = "Grifinoria";
        double maiorPontuacao = pontosGrifinoria;

        if (pontosSonserina > maiorPontuacao) {
            casa = "Sonserina";
            maiorPontuacao = pontosSonserina;
        }

        if (pontosCorvinal > maiorPontuacao) {
            casa = "Corvinal";
            maiorPontuacao = pontosCorvinal;
        }

        if (pontosLufaLufa > maiorPontuacao) {
            casa = "Lufa-Lufa";
        }

        return casa;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Coragem: " + coragem);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Ambicao: " + ambicao);
        System.out.println("Lealdade: " + lealdade);
        System.out.println("Estrategia: " + estrategia);
        System.out.println("Criatividade: " + criatividade);
        System.out.println("Casa: " + casa);
    }
}
