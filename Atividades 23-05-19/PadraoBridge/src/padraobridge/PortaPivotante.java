package padraobridge;

public class PortaPivotante implements IPorta {
    
    private String nome;

    public PortaPivotante() {
        this.nome = "Porta Pivotante";
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
