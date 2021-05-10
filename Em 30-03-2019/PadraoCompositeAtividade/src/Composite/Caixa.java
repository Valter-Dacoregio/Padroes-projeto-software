package Composite;

import java.util.ArrayList;
import java.util.List;

public class Caixa implements IComposite {
    
    private String nome;
    private List<IComposite> componentes;

    public Caixa(String nome) {
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }

    @Override
    public void adicionar(IComposite composite) {
        this.componentes.add(composite);
    }

    @Override
    public void exibir(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("  ");
        }
        System.out.println(this.nome);
        for (IComposite c : this.componentes) {
            c.exibir(x + 1);
        }
    }
}
