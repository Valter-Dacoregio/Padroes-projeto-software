package state;

import model.Tarefa;

public class EmDesenvolvimento implements IEstadoTarefa {
    
    private String nome;

    public EmDesenvolvimento() {
        this.nome = "Em desenvolvimento";
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void irParaEmEspera(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Em Desenvolvimento, não pode ir para Em Espera.");
    }

    @Override
    public void irParaEmDesenvolvimento(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Em Desenvolvimento, não pode ir para Em Desenvolvimento.");
    }

    @Override
    public void irParaProntoParaTestar(Tarefa tarefa) {
        // IR PARA PRONTO PARA TESTAR
        tarefa.setEstado(new ProntoParaTestar());
    }

    @Override
    public void irParaTestando(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Em Desenvolvimento, não pode ir para Pronto para Testando.");
    }

    @Override
    public void irParaFinalizado(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Em Desenvolvimento, não pode ir para Pronto para Finalizado.");
    }
}
