package br.exemplo.atividade;

public class CadastroService {
    private final AuthService authService;

    public CadastroService(AuthService authService) {
        this.authService = authService;
    }

    public boolean cadastrar(String email, String senha) {
        if (!authService.isEmailValido(email)) {
            return false;
        }

        try {
            String hash = authService.hashSenha(senha);
            System.out.println("Hash gerado: " + hash);
            return !hash.isEmpty();
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar: " + e.getMessage());
            return false;
        }
    }
}
