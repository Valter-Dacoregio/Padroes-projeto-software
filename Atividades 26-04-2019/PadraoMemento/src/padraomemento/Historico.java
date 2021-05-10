package padraomemento;

import java.util.Stack;

public class Historico {
    
    private Stack<Estado> pilhaUndo;
    private Stack<Estado> pilhaRedo;

    public Historico() {
        this.pilhaUndo = new Stack<>();
        this.pilhaRedo = new Stack<>();
    }
    
    public Estado undo() {
        return this.pilhaUndo.pop();
    }
    
    public Estado undo(Estado estado) {
        // ANTES DE RETORNAMOS A CHAMADA DE REFAZER, ADICIONAMOS O ESTADO QUE ESTAVA EM USO À PILHA DE REDO
        this.pilhaRedo.push(estado);
        return this.pilhaUndo.pop();
    }
    
    public Estado redo() {
        return this.pilhaRedo.pop();
    }

    public Estado redo(Estado estado) {
        this.pilhaUndo.push(estado);
        return this.pilhaRedo.pop();
    }
    
    public void adicionar(Estado estado) {
        // FAZ COM QUE A CADA ELEMENTO ADICIONADO, A PILHA DO REFAZER SEJA LIMPA POR COMPLETO,
        // POIS AO ADICIONAR UM NOVO ELEMENTO NÃO TEREMOS MAIS A OPIÇÃO DE REFAZER
        this.pilhaRedo.clear();
        
        this.pilhaUndo.push(estado);
    }

    @Override
    public String toString() {
        return "Historico{" + "pilhaUndo=" + pilhaUndo + ", pilhaRedo=" + pilhaRedo + '}';
    }
}
