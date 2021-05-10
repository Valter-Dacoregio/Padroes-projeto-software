package state;

import model.Tarefa;

public class EmEspera implements IEstadoTarefa {
    
    private String nome;

    public EmEspera() {
        this.nome = "Em espera";
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public void irParaEmEspera(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Em Espera, não pode ir para Em Espera.");
    }

    @Override
    public void irParaEmDesenvolvimento(Tarefa tarefa) {
        // IR PARA EM DESENVOLVIMENTO
        tarefa.setEstado(new EmDesenvolvimento());
    }

    @Override
    public void irParaProntoParaTestar(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Em Espera, não pode ir para Pronto para Testar.");
    }

    @Override
    public void irParaTestando(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Em Espera, não pode ir para Pronto para Testando.");
    }

    @Override
    public void irParaFinalizado(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Em Espera, não pode ir para Pronto para Finalizado.");
    }
    
}
