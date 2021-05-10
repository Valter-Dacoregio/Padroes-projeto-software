package principal;

import adapater.FaixaEtaria;
import adapater.ICalculadoraInformacoesIdade;
import adapater.Pessoa;
import java.sql.Date;

public class Principal {

    public static void main(String[] args) {
        
        // TEMOS UMA PESSOA, ESTÁ É A CLASSE ADAPTEE,
        // ELA JÁ ESTÁ NO SISTEMA A MUITO TEMPO, USADA EM VÁRIOS LUGARES
        // NÃO PODEMOS ALTERÁ-LA, POIS PODEMOS TER PROBLEMAS
        Date dataNascimento = Date.valueOf("1996-03-10");
        Pessoa pessoa1 = new Pessoa("Valter", dataNascimento);
        
        // CRIAMOS UM ADAPTER, A CLASSE FAIXA ETÁRIA VAI ACESSAR A PESSOA
        // E BUSCAR SUAS INFORMAÇÕES, NO CASO BUSCARÁ SUA DATA DE NASC.
        ICalculadoraInformacoesIdade calculadoraInformacoesIdade = new FaixaEtaria(pessoa1);
        
        // MOSTRAMOS AS INFORMAÇÕES NECESSÁRIAS
        System.out.println("Idade..........: " + calculadoraInformacoesIdade.calcularIdade() + " anos");
        System.out.println(calculadoraInformacoesIdade.calcularFaixaEtaria());
    }
}
