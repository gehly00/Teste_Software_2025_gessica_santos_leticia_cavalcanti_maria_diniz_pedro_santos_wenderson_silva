package com.email;

import com.email.Classes.Usuario;
import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

public class TestandoMetodosComMockito {

    Usuario remetenteTeste = mock(Usuario.class);
    Usuario destinatarioTeste = new Usuario("usuario teste","usuario@teste.com");

    @Test
    public void usuarioCorreto() {

        doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                Object[] args = invocation.getArguments();
                Usuario destinatario = (Usuario) args[0];
                String assunto = (String) args[1];
                String mensagem = (String) args[2];

                System.out.println("Chamado com nome "+ destinatario + "| assunto: "+ assunto + "| mensagem: "+ mensagem);

                return null;
            }

        }).when(remetenteTeste).enviarEmail(any(Usuario.class), anyString(), anyString());

        remetenteTeste.enviarEmail(destinatarioTeste,"assunto teste","mensagem teste");
    }
}
