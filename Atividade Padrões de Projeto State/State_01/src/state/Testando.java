package state;

import model.Tarefa;

public class Testando implements IEstadoTarefa {
    
    private String nome;

    public Testando() {
        this.nome = "Testando";
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public void irParaEmEspera(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está em Teste, não pode ir para Em Espera.");
    }

    @Override
    public void irParaEmDesenvolvimento(Tarefa tarefa) {
        // IR PARA EM DESENVOLVIMENTO
        tarefa.setEstado(new EmDesenvolvimento());
    }

    @Override
    public void irParaProntoParaTestar(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está em Teste, não pode ir para Pronto para Testar.");
    }

    @Override
    public void irParaTestando(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está em Teste, não pode ir para Testando.");
    }

    @Override
    public void irParaFinalizado(Tarefa tarefa) {
        // IR PARA FINALIZADO
        tarefa.setEstado(new Finalizado());
    }
    
}
