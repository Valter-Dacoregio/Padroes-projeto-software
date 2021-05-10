package padraomemento;

public class Estado {
    
    Posicao posicao;

    public Estado(Posicao originator) {
        this.posicao = originator;
    }

    public Posicao getPosicao() {
        return this.posicao;
    }

    @Override
    public String toString() {
        return "Estado{" + "posicao=" + posicao + '}';
    }
}
