package state;

import model.Tarefa;

public class Finalizado implements IEstadoTarefa {
    
    private String nome;

    public Finalizado() {
        this.nome = "Finalizado";
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public void irParaEmEspera(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Finalizada, não pode ir para Em Espera.");
    }

    @Override
    public void irParaEmDesenvolvimento(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Finalizada, não pode ir para Em Desenvolvimento.");
    }

    @Override
    public void irParaProntoParaTestar(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Finalizada, não pode ir para Pronto para Testar.");
    }

    @Override
    public void irParaTestando(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Finalizada, não pode ir para Testando.");
    }

    @Override
    public void irParaFinalizado(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Finalizada, não pode ir para Finalizado.");
    }
    
}
