package flyweight;

public class Tela {
    
    private ISolo solo;
    
    public Tela(ISolo solo) {
        this.solo = solo;
    }
    
    public void trocarDeSolo(ISolo solo) {
        this.solo = solo;
    }
    
    public String renderizarSolo() {
        return this.solo.mostrarSolo();
    }
}
