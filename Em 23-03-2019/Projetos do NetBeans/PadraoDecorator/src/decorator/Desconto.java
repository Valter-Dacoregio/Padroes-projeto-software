package decorator;

public class Desconto extends BaseDecorator{
    
    private Double desconto;

    public Desconto(Component componente) {
        super(componente);
        this.desconto = 10.0;
    }

    @Override
    public Double getPreco() {
        return this.componente.getPreco() * (1 - (this.desconto/100));
    }
}
