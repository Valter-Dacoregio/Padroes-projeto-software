package principal;

import padraomemento.Historico;
import padraomemento.Posicao;

public class Teste {

    public static void main(String[] args) {
        
        Historico historico = new Historico();
        
        Posicao posicaoJogador1;
        
        System.out.println("****INSERINDO TODOS*******");
        
        posicaoJogador1 = new Posicao("Jogador 1", 0);
        System.out.println(posicaoJogador1);
        
        historico.adicionar(posicaoJogador1.salvar());
        posicaoJogador1 = new Posicao("Jogador 1", 8);
        System.out.println(posicaoJogador1);
        
        historico.adicionar(posicaoJogador1.salvar());
        posicaoJogador1 = new Posicao("Jogador 1", 14);
        System.out.println(posicaoJogador1);
        
        historico.adicionar(posicaoJogador1.salvar());
        posicaoJogador1 = new Posicao("Jogador 1", 20);
        System.out.println(posicaoJogador1);
        
        System.out.println("-------------------");
        
        // UNDO
//        historico.adicionarRedo(posicaoJogador1.salvar());
//        posicaoJogador1.atualizarDados(historico.undo());
        posicaoJogador1.atualizarDados(historico.undo(posicaoJogador1.salvar()));
        System.out.println("\nUNDO\n" + posicaoJogador1);
        
        // UNDO
        posicaoJogador1.atualizarDados(historico.undo(posicaoJogador1.salvar()));
        System.out.println("\nUNDO\n" + posicaoJogador1);
        
        // UNDO
        posicaoJogador1.atualizarDados(historico.undo(posicaoJogador1.salvar()));
        System.out.println("\nUNDO\n" + posicaoJogador1);

        // REDO
        posicaoJogador1.atualizarDados(historico.redo(posicaoJogador1.salvar()));
        System.out.println("\nREDO\n" + posicaoJogador1);
        
        // REDO
        posicaoJogador1.atualizarDados(historico.redo(posicaoJogador1.salvar()));
        System.out.println("\nREDO\n" + posicaoJogador1);    
        
        // UNDO
        posicaoJogador1.atualizarDados(historico.undo(posicaoJogador1.salvar()));
        System.out.println("\nUNDO\n" + posicaoJogador1);
        
        // APÓS VOLTARMOS, INSERIMOS UM NOVO VALOR
        historico.adicionar(posicaoJogador1.salvar());
        posicaoJogador1 = new Posicao("Jogador 1", 99);
        System.out.println("\nINSERINDO NOVO\n" + posicaoJogador1);
        
        historico.adicionar(posicaoJogador1.salvar());
        posicaoJogador1 = new Posicao("Jogador 1", 150);
        System.out.println("\nINSERINDO NOVO\n" + posicaoJogador1);
        System.out.println("");
        
        historico.adicionar(posicaoJogador1.salvar());
    }
}
