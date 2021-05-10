package decorator;

public abstract class BaseDecorator implements Component{
    
    Component componente;

    public BaseDecorator(Component componente) {
        this.componente = componente;
    }

    @Override
    public String getNome() {
        return this.componente.getNome();
    }
        
    @Override
    public abstract Double getPreco();
}
