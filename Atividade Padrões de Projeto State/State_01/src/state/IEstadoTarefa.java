package state;

import model.Tarefa;

public interface IEstadoTarefa {
    
    public String getNome();
    public void irParaEmEspera(Tarefa tarefa);
    public void irParaEmDesenvolvimento(Tarefa tarefa);
    public void irParaProntoParaTestar(Tarefa tarefa);
    public void irParaTestando(Tarefa tarefa);
    public void irParaFinalizado(Tarefa tarefa);
}
