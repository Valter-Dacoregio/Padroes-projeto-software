package decorator;

public class Acrescimo extends BaseDecorator{
    
    private Double acrescimo;

    public Acrescimo(Component componente) {
        super(componente);
        this.acrescimo = 5.0;
    }

    @Override
    public Double getPreco() {
        return this.componente.getPreco() * (1 + (this.acrescimo/100));
    }
}
