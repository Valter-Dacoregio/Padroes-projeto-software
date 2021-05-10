package chainofresponsability;

public class DividePor7 implements ICalculoPrimo {
    
    ICalculoPrimo proximo;
    
    @Override
    public void setProximo(ICalculoPrimo c) {
        this.proximo = c;
    }

    @Override
    public boolean getResultado(NumeroPrimo np) {
        
        if(np.getNumero() % 7 == 0) {
            System.out.println("Número divisível por 7");
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
        
        numeroPrimo.setDivisorMaximo(numeroPrimo.getNumero() / 7);
        System.out.println("Dividido por 7 forçado, arredondado. Valor do divisor.......: " + numeroPrimo.getDivisorMaximo());
        
        for(cont = 7; cont < numeroPrimo.getDivisorMaximo(); cont++) {
            if(numeroPrimo.getNumero() % cont == 0) {
                System.out.println("Numero que divide....: " + cont);
                return false;
            }
        }
        return true;
    }
}
