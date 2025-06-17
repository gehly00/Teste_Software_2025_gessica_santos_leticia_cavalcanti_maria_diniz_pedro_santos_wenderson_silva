package com.email.Classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Email {
    private String destinatario;
    private String assunto;
    private String mensagem;
}
