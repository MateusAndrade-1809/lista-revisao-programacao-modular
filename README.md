# Lista de Revisao - Programacao Modular

Repositorio para organizar as 10 atividades da lista de revisao em Java.

Cada exercicio deve ser feito em uma branch separada:

- `questao-01-fatorial`
- `questao-02-vetores-condicoes`
- `questao-03-intersecao-vetores`
- `questao-04-intersecao-vetores`
- `questao-04-uniao-vetores`
- `questao-05-pesquisa-habitantes`
- `questao-06-correcao-provas`
- `questao-07-temperaturas`
- `questao-08-loja-artesanato`
- `questao-09-pares-impares`
- `questao-10-matriz-vendas`

As 10 questoes da lista acima ainda nao foram implementadas neste repositorio.

## Pratica 01 - Criando classes e objetos basicos

Esta pratica contem dois exercicios:

- Exercicio 1: cadastro de uma pessoa, calculo do IMC e exibicao da classificacao corporal.
- Exercicio 2: cadastro de alunos de Hogwarts e classificacao automatica pelo Chapeu Seletor.

### Como compilar a Pratica 01

```bash
javac -encoding UTF-8 -d out src/pratica01/exercicio1/*.java src/pratica01/exercicio2/*.java
```

### Como executar a Pratica 01

Exercicio 1:

```bash
java -cp out pratica01.exercicio1.PrincipalIMC
```

Exercicio 2:

```bash
java -cp out pratica01.exercicio2.PrincipalHogwarts
```

Observacao: o enunciado do segundo exercicio usa `estrategia` e `criatividade` nas formulas de selecao, entao esses dois campos foram incluidos no cadastro do aluno.
