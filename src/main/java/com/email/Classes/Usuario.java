package com.email.Classes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class Usuario {
    private String nome;
    private String email;
    private ArrayList<Email> caixaDeEmail;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.caixaDeEmail = new ArrayList<>();
    }

    public String toString() {
        return Usuario.this.nome;
    }

    public void enviarEmail(Usuario destinatario, String assunto, String mensagem) {
        Email email = new Email(this.nome, assunto, mensagem);
        destinatario.receberEmail(email);
    }

    public void receberEmail(Email email) {
        caixaDeEmail.add(email);
    }

    public void verificarCaixaDeEmail() {
        if (caixaDeEmail.isEmpty()) {
            System.out.println("Nenhum email");
        } else {
            for (Email email : caixaDeEmail) {
                System.out.printf("""
                                
                                Email recebido de: %s
                                Assunto: %s
                                Mensagem: %s
                                ------------------------
                                """,
                        email.getDestinatario(),
                        email.getAssunto(),
                        email.getMensagem()
                );
            }
            caixaDeEmail.clear();
        }

    }
}
