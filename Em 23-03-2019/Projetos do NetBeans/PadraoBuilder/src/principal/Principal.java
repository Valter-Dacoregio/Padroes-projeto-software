package principal;

import builder.Builder;
import builder.Director;
import builder.OurivesBuilder;
import builder.Casa;
import builder.MadeireiroBuilder;
import builder.PedreiroBuilder;

public class Principal {

    public static void main(String[] args) {
        
        // CRIAMOS UM BUILDER
        Builder builder = new MadeireiroBuilder();
        
        // CRIAMOS UM DIRECTOR QUE RECEBE ESTE BUILDER COMO PARÂMETRO NO CONSTRUTOR
        Director diretor = new Director(builder);
        
        // INVOCAMOS QUE O DIRETOR USE O BUILDER PARA CONSTRUIR UMA CASA
        diretor.makeCasaSimples();
        
        // OBTEMOS O RESULTADO FINAL, A CASA CONSTRUÍDA
        Casa casa = builder.getResult();
        
        // MOSTRAMOS O RESULTADO FINAL
        String resultado = casa.getDescricao();
        System.out.println(resultado);
        
        // CASA DE PEDRA
        builder = new PedreiroBuilder();
        diretor.mudarBuilder(builder);
        diretor.makeCasaCompleta();
        casa = builder.getResult();
        System.out.println(casa.getDescricao());
        
        // CASA PRECIOSA
        builder = new OurivesBuilder();
        diretor.mudarBuilder(builder);
        diretor.makeCasaSuperCompleta();
        casa = builder.getResult();
        System.out.println(casa.getDescricao());
    }
}
