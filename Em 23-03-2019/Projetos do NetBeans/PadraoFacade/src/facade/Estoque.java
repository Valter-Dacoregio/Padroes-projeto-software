package facade;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    
    List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }
    
    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
}
