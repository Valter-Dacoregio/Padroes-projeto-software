package Composite;

public class Marreta implements IComposite {
    
    private String nome;

    public Marreta(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionar(IComposite composite) {
        throw new UnsupportedOperationException("Uma Marreta não pode ser composta de outro componente.");
    }

    @Override
    public void exibir(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("  ");
        }
        System.out.println(this.nome);
    }
}
