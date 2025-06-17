package com.email.Classes;

public class Principal {
    public static void main(String[] args) {

        Usuario maria = new Usuario("Maria Silva", "maria.silva@hotmail.com");

        Usuario joao = new Usuario("João Souza", "joao.souza@gmail.com");

        maria.enviarEmail(joao,"Marcar reunião","Olá João, podemos marcar a reunião para as 25/10 as 09:00h?");
        joao.verificarCaixaDeEmail();
        joao.enviarEmail(maria,"Resposta: Marcar reunião","Podemos sim!");
        maria.verificarCaixaDeEmail();
        maria.enviarEmail(joao,"Resposta: Marcar reunião","Marcado então! Adicionarei a agenda");
        joao.verificarCaixaDeEmail();


    }
}