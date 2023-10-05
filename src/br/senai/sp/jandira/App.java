package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Jogador;

public class App {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();

        jogador.cadastrarJogador();
        System.out.println(jogador.getNome());
        System.out.println(jogador.getIdade());
        System.out.println(jogador.getNumeroCamisa());
    }
}
