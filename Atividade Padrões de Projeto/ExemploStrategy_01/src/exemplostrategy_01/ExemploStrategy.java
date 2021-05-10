package exemplostrategy_01;

public class ExemploStrategy {

    public static void main(String[] args) {
        
        // CRIANDO UM FUNCIONÁRIO QUE É MOTORISTA
        IFuncionario funcionario1 = new Motorista("João");
        funcionario1.trabalhar();
        
        // CRIANDO UM FUNCIONÁRIO QUE É ADMINISTRADOR
        IFuncionario funcionario2 = new Administrador("Alberto");
        funcionario2.trabalhar();
        
    }
    
}
