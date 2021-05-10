package facade;

public class Facade {
        
    public Estoque criarEstoque() {
        Estoque estoque = new Estoque();
        return estoque;
    }
    
    public Produto criarProduto(Integer id, String nome, Integer quantidadeAtual) {
        Produto produto = new Produto(id, nome, quantidadeAtual);
        return produto;
    }
    
    public void adicionarProdutoNoEstoque(Estoque estoque, Produto produto) {
        estoque.adicionarProduto(produto);
    }
    
    public Produto retornarProduto(Estoque estoque, String nome) {
        for(Produto p : estoque.produtos)
            if(p.getNome().equals(nome))
                return p;
        return null;
    }

    public Compra registrarCompra(Produto produtoBusca, int quantidade) {
        Compra compra = new Compra(produtoBusca, quantidade);
        return compra;
    }

    public void atualizarEstoque(Estoque estoque, Compra compra) {
        for(Produto p : estoque.produtos)
            if(p.getId().equals(compra.getProduto().getId()))
                p.setQuantidadeAtual(p.getQuantidadeAtual() - compra.getQuantidade());
    }

    public void listarInformacoes(Estoque estoque) {
        System.out.println("****ESTOQUE****");
        for(Produto p : estoque.produtos) {
            System.out.println("-----------------------------------");
            System.out.println("ID..................: " + p.getId());
            System.out.println("NOME................: " + p.getNome());
            System.out.println("QUANTIDADE ATUAL....: " + p.getQuantidadeAtual());
        }
        System.out.println("-----------------------------------\n");
    }
        
}
