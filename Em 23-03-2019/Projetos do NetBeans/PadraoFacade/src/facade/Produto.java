package facade;

public class Produto {
    
    private Integer id;
    private String nome;
    private Integer quantidadeAtual;

    public Produto(Integer id, String nome, Integer quantidadeAtual) {
        this.id = id;
        this.nome = nome;
        this.quantidadeAtual = quantidadeAtual;
    }

    public Integer getId() {
        return id;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setQuantidadeAtual(Integer quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }
    
    public Integer getQuantidadeAtual() {
        return quantidadeAtual;
    }
    
}
