package chainofresponsability;

public class DividePor5 implements ICalculoPrimo {

    private ICalculoPrimo proximo;
    
    @Override
    public void setProximo(ICalculoPrimo c) {
        this.proximo = c;
    }
    
    @Override
    public boolean getResultado(NumeroPrimo np) {
        
        if(np.getNumero() % 5 == 0) {
            System.out.println("Número divisível por 5");
            return false;
        }
        
        if(this.proximo != null) {
            return this.proximo.getResultado(np);
        } else {
            return this.isPrimo(np);
        }
    }
    
    @Override
    public boolean isPrimo (NumeroPrimo numeroPrimo) {
        
        long cont;
        
        numeroPrimo.setDivisorMaximo(numeroPrimo.getNumero() / 5);
        System.out.println("Dividido por 5 forçado, arredondado. Valor do divisor.......: " + numeroPrimo.getDivisorMaximo());
        
        for(cont = 5; cont < numeroPrimo.getDivisorMaximo(); cont++) {
            if(numeroPrimo.getNumero() % cont == 0) {
                System.out.println("Numero que divide....: " + cont);
                return false;
            }
        }
        return true;
    }
}
