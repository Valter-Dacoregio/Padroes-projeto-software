package principal;

import Composite.Caixa;
import Composite.Celular;
import Composite.IComposite;
import Composite.Marreta;

public class Teste {

    public static void main(String[] args) {
        
        // CRIAMOS ALGUNS COMPONENTES
        IComposite caixa1 = new Caixa("Caixa 1");
        IComposite caixa2 = new Caixa("Caixa 2");
        IComposite caixa3 = new Caixa("Caixa 3");
        IComposite celular = new Celular("Celular");
        IComposite marreta = new Marreta("Marreta");
        
        // ADICIONAMOS O CELULAR DENTRO DA CAIXA 2
        caixa2.adicionar(celular);
        
        // ADICIONAMOS A MARRETA DENTRO DA CAIXA 3
        caixa3.adicionar(marreta);
        
        // ADICIONAMOS A CAIXA 2 E A CAIXA 3 DENTRO DA CAIXA 1
        caixa1.adicionar(caixa2);
        caixa1.adicionar(caixa3);
        
        // COMO A CAIXA 1, É O ELEMENTO QUE TEM TODOS OS DEMAIS DENTRO,
        // EXIBIMOS O CONTEÚDO DA CAIXA 1
        caixa1.exibir(10);
    }
}
