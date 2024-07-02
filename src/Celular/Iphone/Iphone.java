package Celular.Iphone;

import Celular.AparelhoTelefonico.ReprodutorMusical;
import Celular.NavegadorInternet.AparelhoTelefonico;
import Celular.ReprodutorMusica.NavegadorInternet;

public class Iphone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public Iphone(ReprodutorMusical reprodutorMusical, AparelhoTelefonico aparelhoTelefonico,
            NavegadorInternet navegadorInternet) {
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorInternet = navegadorInternet;
    }

    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void pausarMusica() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    public void ligarPara(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void atenderChamada() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioDeVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void exibirPaginaWeb(String url) {
        navegadorInternet.exibirPagina(url);
    }

    public void adicionarAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPaginaWeb() {
        navegadorInternet.atualizarPagina();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }
}
