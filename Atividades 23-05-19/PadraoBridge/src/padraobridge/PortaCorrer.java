package padraobridge;

public class PortaCorrer implements IPorta {
    
    private String nome;

    public PortaCorrer() {
        this.nome = "Porta de correr";
    }

    @Override
    public void abrirSe() {
        System.out.println(this.nome + " abriu!");
    }

    @Override
    public void fecharSe() {
        System.out.println(this.nome + " fechou!");
    }
}
