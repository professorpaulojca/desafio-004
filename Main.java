public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Reprodutor Musical
        iphone.selecionarMusica("Bohemian Rhapsody");
        iphone.tocar();
        iphone.pausar();

        // Aparelho Telefônico
        iphone.ligar("11912345678");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador na Internet
        iphone.exibirPagina("https://www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}