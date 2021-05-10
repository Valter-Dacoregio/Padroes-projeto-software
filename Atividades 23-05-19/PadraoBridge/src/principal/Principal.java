package principal;

import padraobridge.Ape;
import padraobridge.Baiuca;
import padraobridge.Bangalo;
import padraobridge.IHabitacao;
import padraobridge.IPorta;
import padraobridge.PortaCorrer;
import padraobridge.PortaPivotante;
import padraobridge.PortaVeneziana;

public class Principal {

    public static void main(String[] args) {
        
        // CRIANDO ALGUMAS HABITAÇÕES
        IHabitacao ape = new Ape();
        IHabitacao baiuca = new Baiuca();
        IHabitacao bangalo = new Bangalo();
        
        // CRIANDO AS PORTAS
        IPorta portaCorrer = new PortaCorrer();
        IPorta portaPivotante = new PortaPivotante();
        IPorta portaVeneziana = new PortaVeneziana();
        
        // ADICIONANDO AS PORTAS NAS HABITAÇÕES
        ape.instalarPorta(portaCorrer);
        baiuca.instalarPorta(portaPivotante);
        bangalo.instalarPorta(portaVeneziana);
        
        // ABRINDO AS PORTAS
        System.out.println("**** ABRIR ****");
        ape.abrirPorta();
        baiuca.abrirPorta();
        bangalo.abrirPorta();
        
        // FECHANDO AS PORTAS
        System.out.println("\n**** FECHAR ****");
        ape.fecharPorta();
        baiuca.fecharPorta();
        bangalo.fecharPorta();
    }
}
