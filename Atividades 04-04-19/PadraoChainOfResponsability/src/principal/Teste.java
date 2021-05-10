package principal;

import chainofresponsability.DividePor11;
import chainofresponsability.DividePor13;
import chainofresponsability.DividePor17;
import chainofresponsability.DividePor2;
import chainofresponsability.DividePor3;
import chainofresponsability.DividePor5;
import chainofresponsability.DividePor7;
import chainofresponsability.ICalculoPrimo;
import chainofresponsability.NumeroPrimo;
import java.time.LocalDateTime;

public class Teste {

    public static void main(String[] args) {
        
        LocalDateTime antes = LocalDateTime.now();
        
        // SELECIONAMOS UM NÚMERO BEM ALTO PARA O PROGRAMA FAZER A VERIFICAÇÃO
        // (ESTE É UM NÚMERO PRIMO REALMENTE)
//        NumeroPrimo numeroPrimo = new NumeroPrimo(47055833479L);
//        NumeroPrimo numeroPrimo = new NumeroPrimo(333333331L);
        NumeroPrimo numeroPrimo = new NumeroPrimo(99999999977L);
        
        // CRIAMOS OS ELEMENTOS DA CADEIA DE RESPONSABILIDADE
        ICalculoPrimo dividePor2 = new DividePor2();
        ICalculoPrimo dividePor3 = new DividePor3();
        ICalculoPrimo dividePor5 = new DividePor5();
        ICalculoPrimo dividePor7 = new DividePor7();
        ICalculoPrimo dividePor11 = new DividePor11();
        ICalculoPrimo dividePor13 = new DividePor13();
        ICalculoPrimo dividePor17 = new DividePor17();
        
        // ENCADEAMOS OS ELEMENTOS DA CADEIA DE RESPONSABILIDADE
        dividePor2.setProximo(dividePor3);
        dividePor3.setProximo(dividePor5);
        dividePor5.setProximo(dividePor7);
        dividePor7.setProximo(dividePor11);
        dividePor11.setProximo(dividePor13);
        dividePor13.setProximo(dividePor17);
        
        // CHAMAMOS O PRIMEIRO ELEMENTO DA CADEIA DE RESPONSABILIDADE
        // PARA QUE ELE REALIZE A OPERAÇÃO O REPASSE PARA UM PRÓXIMO ELEMENTO
        // DA CADEIA
        boolean primo = dividePor2.getResultado(numeroPrimo);
        
        // MOSTRAMOS O RESULTADO DA OPERAÇÃO, DIZENDO SE O NÚMERO INICIAL É
        // PRIMO OU NÃO
        System.out.println("O número....: " + numeroPrimo.getNumero() + " => "
                + (primo ? " EEEÉ PRIMO!" : "NÃOOOOOO É PRIMO!"));
        
        LocalDateTime depois = LocalDateTime.now();
        System.out.println(antes);
        System.out.println(depois);
        
    }
}
