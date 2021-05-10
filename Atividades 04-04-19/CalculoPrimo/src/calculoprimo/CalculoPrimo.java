package calculoprimo;

import java.time.LocalDateTime;

public class CalculoPrimo {

    public static void main(String[] args) {
        LocalDateTime antes = LocalDateTime.now();

//        long numeroBaita =   15230122499L;
        
//        long numeroBaita =   47055833479L;
//        long numeroBaita =    33333331L;
//        long numeroBaita =  7777769L;
        long numeroBaita =   99999999977L;

        if(isPrimo(numeroBaita))
            System.out.println("o numero " + numeroBaita + " é primo");
        else
            System.out.println("o numero " + numeroBaita + " não é primo");
        
        LocalDateTime depois = LocalDateTime.now();
        System.out.println(antes);
        System.out.println(depois);
    }
    
    static boolean isPrimo (long numeroBaita) {
        long cont;
        for(cont = 2; cont < numeroBaita; cont++) {
            if(numeroBaita % cont == 0) {
                System.out.println("Numero que divide....: " + cont);
                return false;
            }
        }
        return true;
    }
}
