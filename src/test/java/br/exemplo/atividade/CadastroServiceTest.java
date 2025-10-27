package br.exemplo.atividade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadastroServiceTest {

    @Test
    void deveFalharComEmailInvalido() {
        AuthService auth = new AuthService();
        CadastroService service = new CadastroService(auth);

        boolean resultado = service.cadastrar("email_invalido", "123456");
        assertFalse(resultado);
    }

    @Test
    void deveCadastrarComEmailValidoESenhaValida() {
        AuthService auth = new AuthService();
        CadastroService service = new CadastroService(auth);

        boolean resultado = service.cadastrar("teste@exemplo.com", "senhaSegura");
        assertTrue(resultado);

        // Testando reuso direto
        String hash = auth.hashSenha("senhaSegura");
        assertTrue(auth.confereSenha("senhaSegura", hash));
    }
}
