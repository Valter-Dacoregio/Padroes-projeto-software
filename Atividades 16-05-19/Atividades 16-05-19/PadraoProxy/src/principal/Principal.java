package principal;

import Proxy.InformacaoRestrita;
import Proxy.Proxy;

public class Principal {

    public static void main(String[] args) {
        
        InformacaoRestrita informacaoRestrita1 = new InformacaoRestrita("Informação 1", "<isto aqui é confidencial. shhhhh...>", "senha123");
        
        Proxy proxy = new Proxy(informacaoRestrita1);
        
        String senhaInformada;
        
        System.out.println("-----------------------");
        System.out.println("--PRIMEIRA TENTATIVA---");
        System.out.println("-----------------------");
        senhaInformada = "senha1234";
        proxy.solicitarAcesso(senhaInformada);
        
        System.out.println("");
        
        System.out.println("-----------------------");
        System.out.println("---SEGUNDA TENTATIVA---");
        System.out.println("-----------------------");        
        senhaInformada = "senha123";
        proxy.solicitarAcesso(senhaInformada);
        
        System.out.println("");
    }
}
