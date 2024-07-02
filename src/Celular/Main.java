// src/Celular/Main.java
package Celular;

import Celular.AparelhoTelefonico.FunReprodutorMusical;
import Celular.AparelhoTelefonico.ReprodutorMusical;
import Celular.Iphone.Iphone;
import Celular.NavegadorInternet.AparelhoTelefonico;
import Celular.NavegadorInternet.FunAparelhoTelefonico;
import Celular.ReprodutorMusica.FunNavegadorInternet;
import Celular.ReprodutorMusica.NavegadorInternet;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new FunReprodutorMusical();
        AparelhoTelefonico telefone = new FunAparelhoTelefonico();
        NavegadorInternet navegador = new FunNavegadorInternet();

        Iphone iphone = new Iphone(reprodutor, telefone, navegador);

        // Testando ReprodutorMusical
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica("Imagine - John Lennon");

        // Testando AparelhoTelefonico
        iphone.ligarPara("123-456-7890");
        iphone.atenderChamada();
        iphone.iniciarCorreioDeVoz();

        // Testando NavegadorInternet
        iphone.exibirPaginaWeb("www.example.com");
        iphone.adicionarAba();
        iphone.atualizarPaginaWeb();
    }
}
