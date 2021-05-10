package state;

import model.Tarefa;

public class ProntoParaTestar implements IEstadoTarefa {
    
    private String nome;

    public ProntoParaTestar() {
        this.nome = "Pronto para Testar";
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public void irParaEmEspera(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está em Pronto para Testar, não pode ir para Em Espera.");
    }

    @Override
    public void irParaEmDesenvolvimento(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Pronta para Testar, não pode ir para Em Desenvolvimento.");
    }

    @Override
    public void irParaProntoParaTestar(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Pronta para Testar, não pode ir para Pronto para Testar.");
    }

    @Override
    public void irParaTestando(Tarefa tarefa) {
        // IR PARA TESTANDO
        tarefa.setEstado(new Testando());
    }

    @Override
    public void irParaFinalizado(Tarefa tarefa) {
        throw new RuntimeException("A tarefa está Pronta para Testar, não pode ir para Finalizado.");
    }
    
}
