package Proxy;

public class Proxy implements InterfaceProxy {
    
    InterfaceProxy interfaceProxy;

    public Proxy(InterfaceProxy interfaceProxy) {
        this.interfaceProxy = interfaceProxy;
    }
    
    public void solicitarAcesso(String senhaInformada) {
        
        // FAZENDO CAST PARA DEFINIR O TIPO CONCRETO DO OBJETO,
        // PODERIA TER ADICIONADO A ASSINATURA DESTE MÉTODO NA INTERFACE
        //
        InformacaoRestrita ir = (InformacaoRestrita) interfaceProxy;
        
        if(senhaInformada.equals(ir.getSenha())) {
            this.operacao();
        } else {
            System.out.println("A senha está inválida. Sem Acesso!!!");
        }
    }
    
    @Override
    public void operacao() {
        this.interfaceProxy.operacao();
    }
}
