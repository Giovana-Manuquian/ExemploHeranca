package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Jogador extends Pessoas {
    String posicao;
    int numeroCamisa;
    Scanner scanner = new Scanner(System.in);

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public void cadastrarJogador(){
        System.out.print("Informe o nome: ");
        super.nome = scanner.nextLine();
        System.out.print("Informe a idade: ");
        super.idade = scanner.nextInt();
        System.out.print("Informe o CPF: ");
        super.cpf = scanner.nextLong();
        System.out.print("Informe o RG: ");
        super.rg = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Informe a posição: ");
        posicao = scanner.nextLine();
        System.out.print("Informe o número da camisa: ");
        numeroCamisa = scanner.nextInt();
        scanner.nextLine();


    }

}
