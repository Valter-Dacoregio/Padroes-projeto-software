package chainofresponsability;

public interface ICalculoPrimo {
    
    boolean getResultado(NumeroPrimo np);
    void setProximo(ICalculoPrimo c);
    boolean isPrimo(NumeroPrimo np);
}
