package model;

import state.EmEspera;
import state.IEstadoTarefa;

public class Tarefa {
    
    private String numero;
    private IEstadoTarefa estado;

    
    // CONSTRUCTORS
    public Tarefa(String numero) {
        this.numero = numero;
        this.estado = new EmEspera();
    }
    
    
    // MÉTODOS PARA MANIPULAR O ESTADO
    public void irParaEmEspera() {
        this.estado.irParaEmEspera(this);
    }
    
    public void irParaEmDesenvolvimento() {
        this.estado.irParaEmDesenvolvimento(this);
    }
    
    public void irParaProntoParaTestar() {
        this.estado.irParaProntoParaTestar(this);
    }
    
    public void irParaTestando() {
        this.estado.irParaTestando(this);
    }
    
    public void irParaFinalizado() {
        this.estado.irParaFinalizado(this);
    }
    
    
    // GETTERS AND SETTERS

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public IEstadoTarefa getEstado() {
        return estado;
    }

    public void setEstado(IEstadoTarefa estado) {
        this.estado = estado;
    }
}
