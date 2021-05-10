package chainofresponsability;

public class DividePor13 implements ICalculoPrimo {
    
    ICalculoPrimo proximo;
    
    @Override
    public void setProximo(ICalculoPrimo c) {
        this.proximo = c;
    }

    @Override
    public boolean getResultado(NumeroPrimo np) {
        
        if(np.getNumero() % 13 == 0) {
            System.out.println("Número divisível por 13");
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
        
        numeroPrimo.setDivisorMaximo(numeroPrimo.getNumero() / 13);
        System.out.println("Dividido por 13 forçado, arredondado. Valor do divisor.......: " + numeroPrimo.getDivisorMaximo());
        
        for(cont = 13; cont < numeroPrimo.getDivisorMaximo(); cont++) {
            if(numeroPrimo.getNumero() % cont == 0) {
                System.out.println("Numero que divide....: " + cont);
                return false;
            }
        }
        return true;
    }
}
