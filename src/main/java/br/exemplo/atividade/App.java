package br.exemplo.atividade;

public class App {
    public static void main(String[] args) {
        AuthService auth = new AuthService();
        CadastroService service = new CadastroService(auth);

        System.out.println(">>> Tentando cadastrar com email inválido:");
        service.cadastrar("invalido@", "123");

        System.out.println(">>> Tentando cadastrar com email válido:");
        service.cadastrar("aluna@uni.br", "123456");
    }
}
