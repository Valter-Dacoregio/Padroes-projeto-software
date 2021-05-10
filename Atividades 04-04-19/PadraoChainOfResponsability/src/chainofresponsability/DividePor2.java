package chainofresponsability;

public class DividePor2 implements ICalculoPrimo {
    
    ICalculoPrimo proximo;
    
    /**
     * 
     * ESTE MÉTODO DEFINE O PRÓXIMO ELEMENTO DA CADEIA DE RESPONSABILIDADE
     * @param c
     */
    @Override
    public void setProximo(ICalculoPrimo c) {
        this.proximo = c;
    }

    @Override
    public boolean getResultado(NumeroPrimo np) {
        
        // VERIFICAMOS SE O NÚMERO É DIVISÍVEL POR 2
        // CASO ELE SEJA, RETORNA FALSE, DIZENDO QUE O NÚMERO
        // EM QUESTÃO NÃO É PRIMO
        if(np.getNumero() % 2 == 0) {
            System.out.println("Número divisível por 2");
            return false;
        }
        
        // A SEGUIR VERIFICAMOS SE O PRÓXIMO ELEMENTO DA CADEIA FOI DEFINIDO
        // CASO ELE TENHA SIDO DEFINIDO ESTARÁ DIFERENTE DE NULL,
        // SE TEMOS UM PRÓXIMO, CHAMAMOS O MÉTODO DO PRÓXIMO ELEMENTO
        // PASSANDO A CLASSE QUE CONTEM O NÚMERO A SER VERIFICADO,
        // CASO CONTRÁRIO CHAMAMOS O MÉTODO ISPRIMO DA PRÓPRIA CLASSE PARA FAZER
        // A VERIFICAÇÃO
        
        // COM A VERIFICAÇÃO A SERGUIR TAMBÉM GARANTIMOS O O.C.P. DA NOSSA APLICAÇÃO
        // PODENDO VIR A ADICIONAR NOVAS CLASSES NO PROGRAMA SEM TER QUE REALIZAR NENHUMA
        // ALTERAÇÃO NAS CLASSES JÁ EXISTENTES
        if(this.proximo != null) {
            return this.proximo.getResultado(np);
        } else {
            return this.isPrimo(np);
        }
    }
    
    /**
     * 
     * 
     * ESTE MÉTODO FAZ O CÁLCULO VERIFICANDO SE O NÚMERO EM QUESTÃO É OU NÃO PRIMO
     * 
     * PERCEBA QUE DIVIMOS O NÚMERO EM QUESTÃO POR 2 PARA TERMOS UM DIVISOR
     * FAZENDO COM QUE O CONTADOR SÓ PRECISE IR ATÉ A METADE DO NÚMERO EM QUESTÃO
     * PARA FAZER A VERIFICAÇÃO, DEIXANDO O MÉTODO MAIS EFICIENTE,
     * 
     * ESSE PROCESSO ACONTECE EM TODAS AS CLASSES QUE ESTÃO ENCADEADAS,
     * SEMPRE DIVIDINDO O NÚMERO EM QUESTÃO POR UM NÚMERO CADA VEZ MAIOR,
     * PARA ASSIM TERMOS UM DIVISOR MÁXIMO MENOR, ASSIM
     * TORNANDO O PROGRAMA MUITO MAIS EFICIENTE E RÁPIDO
     *
     * 
     * UMA OBSERVAÇÃO IMPORTANTE: ESTE MÉTODO SÓ SERÁ CHAMADO PELO ÚLTIMO ELEMENTO
     * DA CADEIA DE RESPONSABILIDADE
     * 
     * OUTRA OBSERVAÇÃO: ESTE COMENTÁRIO SE APLICA A TODOS OS MÉTODOS ISPRIMO()
     * DAS CLASSES DA CADEIA DE RESPONSABILIDADE
     * 
     * 
     * @param numeroPrimo
     * @return 
     */
    @Override
    public boolean isPrimo (NumeroPrimo numeroPrimo) {
        
        long cont;
        
        numeroPrimo.setDivisorMaximo(numeroPrimo.getNumero() / 2);
        System.out.println("Dividido por 2 forçado, arredondado. Valor do divisor.......: " + numeroPrimo.getDivisorMaximo());
        
        for(cont = 2; cont < numeroPrimo.getDivisorMaximo(); cont++) {
            if(numeroPrimo.getNumero() % cont == 0) {
                System.out.println("Numero que divide....: " + cont);
                return false;
            }
        }
        return true;
    }
}
