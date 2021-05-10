package state;

import model.Tarefa;

public class Novo implements IEstadoTarefa {
    
    private String nome;

    public Novo() {
        this.nome = "Novo";
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public void irParaEmEspera(Tarefa tarefa) {
        // IR PARA EM ESPERA
        tarefa.setEstado(new EmEspera());
    }

    @Override
    public void irParaEmDesenvolvimento(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está em Novo, não pode ir para Em Desenvolvimento.");
    }

    @Override
    public void irParaProntoParaTestar(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está em Novo, não pode ir para Pronto para Testar.");
    }

    @Override
    public void irParaTestando(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está em Novo, não pode ir para Pronto para Testando.");
    }

    @Override
    public void irParaFinalizado(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está em Novo, não pode ir para Pronto para Finalizado.");
    }
    
}
