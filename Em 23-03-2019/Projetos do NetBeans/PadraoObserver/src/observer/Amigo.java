package observer;

public class Amigo implements Observer{
    
    String nome;

    public Amigo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable o) {
        Pessoa pessoa = (Pessoa) o;
        String retorno = "-------------------------------\n";
        retorno += "Publicação enviada ao amigo " + this.nome + "\n";
        retorno += "A pessoa.......: " + pessoa.getNome() + "\n";
        retorno += "Publicou.......: " + pessoa.getPublicacao();
        System.out.println(retorno);
    }
}
