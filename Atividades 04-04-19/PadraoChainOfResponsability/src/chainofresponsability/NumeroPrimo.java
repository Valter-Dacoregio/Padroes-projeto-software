package chainofresponsability;

public class NumeroPrimo {
    
    private Long numero;
    private Long divisorMaximo;

    public NumeroPrimo(Long numero) {
        this.numero = numero;
    }

    public Long getNumero() {
        return numero;
    }

    public Long getDivisorMaximo() {
        return divisorMaximo;
    }

    public void setDivisorMaximo(Long divisor) {
        this.divisorMaximo = divisor;
    }
}
