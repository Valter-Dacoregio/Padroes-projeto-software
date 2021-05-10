package exemplostrategy_01;

public class Administrador implements IFuncionario {
    
    private String nome;

    public Administrador(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void trabalhar() {
        System.out.println("O Administrador " + this.nome + " está administrando...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
