package padraobridge;

public class PortaVeneziana implements IPorta {
    
    private String nome;

    public PortaVeneziana() {
        this.nome = "Porta Veneziana";
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
