package principal;

import facade.Compra;
import facade.Estoque;
import facade.Facade;
import facade.Produto;

public class Principal {

    public static void main(String[] args) {
        
        // CRIAMOS A FACHADA
        Facade fachada = new Facade();
        
        // A FACHADA CRIA UM ESTOQUE
        Estoque estoque = fachada.criarEstoque();
        
        // A FACHADA CRIA ALGUNS PRODUTOS
        Produto produto1 = fachada.criarProduto(1, "Banana", 10);
        Produto produto2 = fachada.criarProduto(2, "Laranja", 20);
        
        // A FACHADA ADICIONA OS PRODUTOS AO ESTOQUE
        fachada.adicionarProdutoNoEstoque(estoque, produto1);
        fachada.adicionarProdutoNoEstoque(estoque, produto2);
        
        // LISTANDO AS INFORMAÇÕES DO ESTOQUE
        fachada.listarInformacoes(estoque);
        
        // VAMOS REALIZAR UMA COMOPRA, PARA ISSO PRECISAMOS QUE A FACHADA RETORNE
        // O PRODUTO QUE IREMOS COMPRAR
        Produto produtoBusca = fachada.retornarProduto(estoque, "Laranja");
        
        // A FACHADA REALIZA A COMPRA
        Compra compra = fachada.registrarCompra(produtoBusca, 4); 
        
        // A FACHADA ATUALIZA O ESTOQUE
        fachada.atualizarEstoque(estoque, compra);
        
        // LISTANDO AS INFORMAÇÕES DO ESTOQUE
        fachada.listarInformacoes(estoque);
        
    }
    
}
