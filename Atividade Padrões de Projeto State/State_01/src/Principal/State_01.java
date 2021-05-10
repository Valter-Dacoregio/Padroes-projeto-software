package Principal;

import model.Tarefa;

public class State_01 {

    public static void main(String[] args) {
        
        /**
         * 
         * ESTADOS DE TAREFAS NA PROGRAMAÇÃO DE SOFTWARE, DESCRITAS DE FORMA BEM SIMPLES
         * 
         * 1- Novo
         * 2- Em espera
         * 3- Em desenvolvimento
         * 4- Pronto para testar
         * 5- Testando
         * 6- Finalizado
         * 
         */
        
        Tarefa tarefa = new Tarefa("(#0001)");
        System.out.println("Estado atual...: " + tarefa.getEstado().getNome());
        
        tarefa.irParaEmDesenvolvimento();
        System.out.println("Estado atual...: " + tarefa.getEstado().getNome());
        
        tarefa.irParaProntoParaTestar();
        System.out.println("Estado atual...: " + tarefa.getEstado().getNome());
        
        tarefa.irParaTestando();
        System.out.println("Estado atual...: " + tarefa.getEstado().getNome());
        
        tarefa.irParaEmDesenvolvimento();
        System.out.println("Estado atual...: " + tarefa.getEstado().getNome());
        
        tarefa.irParaProntoParaTestar();
        System.out.println("Estado atual...: " + tarefa.getEstado().getNome());
        
        tarefa.irParaTestando();
        System.out.println("Estado atual...: " + tarefa.getEstado().getNome());

        tarefa.irParaFinalizado();
        System.out.println("Estado atual...: " + tarefa.getEstado().getNome());
        
    }
}
