package observer;

import java.util.ArrayList;
import java.util.List;

public class Pessoa implements Observable{
    
    private String nome;
    private String publicacao;
    private List<Observer> amigos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getPublicacao() {
        return publicacao;
    }
    
    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }
    
    public void novaPublicacao(String publicacao) {
        this.publicacao = publicacao;
        this.notifacar();
    }

    @Override
    public void adicionarAmigo(Observer o) {
        this.amigos.add(o);
    }

    @Override
    public void removerAmigo(Observer o) {
        this.amigos.remove(o);
    }

    @Override
    public void notifacar() {
        for(Observer observador : this.amigos) {
            observador.update(this);
        }
    }
}
