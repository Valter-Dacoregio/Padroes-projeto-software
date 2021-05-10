package Proxy;

public class InformacaoRestrita implements InterfaceProxy {
    
    private String nome;
    private String informacaoPrivada;
    private String senha;

    public InformacaoRestrita(String nome, String informacaoPrivada, String credencial) {
        this.nome = nome;
        this.informacaoPrivada = informacaoPrivada;
        this.senha = credencial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInformacaoPrivada() {
        return informacaoPrivada;
    }

    public void setInformacaoPrivada(String informacaoPrivada) {
        this.informacaoPrivada = informacaoPrivada;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "InformacaoRestrita{" + "nome=" + nome + ", informacaoPrivada=" + informacaoPrivada + ", credencial=" + senha + '}';
    }
    
    @Override
    public void operacao() {
        System.out.println("Acesso a área restrita concedido!!!");
        System.out.println(this.toString());
    }
}
