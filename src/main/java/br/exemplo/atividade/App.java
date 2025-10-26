package main.java.br.exemplo.atividade;

public class App {
    public static void main(String[] args) {
        CadastroService service = new CadastroService();
        System.out.println(">>> Tentando cadastrar com email inválido:");
        service.cadastrar("invalido@", "123");

        System.out.println(">>> Tentando cadastrar com email válido:");
        service.cadastrar("aluna@uni.br", "123456");
    }
}
