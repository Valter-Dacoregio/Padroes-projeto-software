package facade;

public class Compra {
    
    private Produto produto;
    private Integer quantidade;

    public Compra(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    
}
