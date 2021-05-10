package principal;

import flyweight.SoloFactory;
import flyweight.Tela;

public class Principal {

    public static void main(String[] args) {
        
        // CRIAMOS UMA FÁBRICA DE SOLOS
        SoloFactory fabricaSolos = new SoloFactory();
        
        // CRIAMOS UMA TELA ADICIONANDO UM TIPO DE SOLO
        Tela tela = new Tela(fabricaSolos.retornarSolo("TERRA"));
        
        // SIMULAMOS QUE O PERSONAGEM ESTÁ CORRENDO LOUCAMENTE NA TELA
        tela.trocarDeSolo(fabricaSolos.retornarSolo("PEDRA"));
        System.out.println(tela.renderizarSolo());
        
        tela.trocarDeSolo(fabricaSolos.retornarSolo("GRAMA"));
        System.out.println(tela.renderizarSolo());
        
        tela.trocarDeSolo(fabricaSolos.retornarSolo("TERRA"));
        System.out.println(tela.renderizarSolo());
    }
}
