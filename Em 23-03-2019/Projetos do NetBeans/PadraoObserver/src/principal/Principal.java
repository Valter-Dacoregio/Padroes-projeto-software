package principal;

import observer.Amigo;
import observer.Observer;
import observer.Pessoa;

public class Principal {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Valter");
        
        Observer amigo1 = new Amigo("Darlan");
        Observer amigo2 = new Amigo("Ghért");
        Observer amigo3 = new Amigo("Andrey");
        
        
        pessoa.adicionarAmigo(amigo1);
        pessoa.adicionarAmigo(amigo2);
        pessoa.adicionarAmigo(amigo3);
        
        System.out.println("***NOVA PUBLICAÇÃO****");
        pessoa.novaPublicacao("Esta é a publicação 001");
        
        pessoa.removerAmigo(amigo3);
        
        System.out.println("\n\n***NOVA PUBLICAÇÃO****");
        pessoa.novaPublicacao("Esta é a publicação 002");
    }
}
