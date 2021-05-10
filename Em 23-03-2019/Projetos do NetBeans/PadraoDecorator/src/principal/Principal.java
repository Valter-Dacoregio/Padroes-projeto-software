package principal;

import decorator.Acrescimo;
import decorator.Component;
import decorator.Desconto;
import decorator.Produto;

public class Principal {

    public static void main(String[] args) {
        
        // CRIAMOS UM PRODUTO
        Component produto = new Produto("Brinquedo", 100.0);
        
        // MOSTRAMOS O PREÇO INICIAL DESTE PRODUTO
        System.out.println("Preço Inicial..........: " + produto.getNome() + " - " + produto.getPreco());
        
        // DECORAMOS ESTE PRODUTO COM UM ACRÉSCIMO FIXO DE 5 %
        Component decorador = new Acrescimo(produto);
        System.out.println("Preço com desconto.....: " + decorador.getNome() + " - " + decorador.getPreco());
        
        // DECORAMOS O PRODUTO COM UM DESCONTO FIXO DE 10 %
        decorador = new Desconto(decorador);
        System.out.println("Preço com Acréscimo....: " + decorador.getNome() + " - " + decorador.getPreco());
    }
}
