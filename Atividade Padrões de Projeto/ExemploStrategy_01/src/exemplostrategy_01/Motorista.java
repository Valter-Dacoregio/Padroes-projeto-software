package exemplostrategy_01;

public class Motorista implements IFuncionario {
    
    private String nome;

    public Motorista(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void trabalhar() {
        System.out.println("O Motorista " + this.nome + " está dirigindo...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
