package padraomemento;

public class Posicao {
    
    private String nome;
    private Integer numeroPosicao;

    public Posicao(String nome, Integer numeroPosicao) {
        this.nome = nome;
        this.numeroPosicao = numeroPosicao;
    }

    public String getNome() {
        return nome;
    }
    
    public Integer getNumeroPosicao() {
        return numeroPosicao;
    }
    
    @Override
    public String toString() {
        return "Posicao{" + "nome=" + nome + ", numeroPosicao=" + numeroPosicao + '}';
    }
    
    public Estado salvar() {
        Posicao posicao = new Posicao(this.nome, this.numeroPosicao);
        Estado estado = new Estado(posicao);
        return estado;
    }
    
    public void atualizarDados(Estado estado) {
        this.nome = estado.getPosicao().getNome();
        this.numeroPosicao = estado.getPosicao().getNumeroPosicao();
    }
}