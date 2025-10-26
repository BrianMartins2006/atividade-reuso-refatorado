package main.java.br.exemplo.atividade;

/**
 * Código LEGADO (pré-refatoração).
 * Objetivo: refatorar para reuso com AuthService + bibliotecas adequadas.
 */
public class CadastroService {
    public boolean cadastrar(String email, String senha) {
        // validação manual frágil
        if (email == null || !email.contains("@") || !email.contains(".")) {
            System.out.println("E-mail inválido");
            return false;
        }
        // "hash" caseiro (inseguro!)
        String hash = "HASH-" + senha + "-FIXO";

        // salvar(email, hash) ...
        System.out.println("Usuário salvo com " + hash);
        return true;
    }
}
