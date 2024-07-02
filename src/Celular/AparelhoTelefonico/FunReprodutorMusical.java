package Celular.AparelhoTelefonico;

public class FunReprodutorMusical implements ReprodutorMusical {

    public void tocar() {
        System.out.println("Música tocando.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}