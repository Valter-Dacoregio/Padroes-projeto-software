package padraoadapter;

public class Adapter implements InterfaceEnviadorSMS {
    
    InterfaceOutroEnviadorSMS outroEnviadorSMS;

    public Adapter(InterfaceOutroEnviadorSMS outroEnviadorSMS) {
        this.outroEnviadorSMS = outroEnviadorSMS;
    }

    @Override
    public void enviaSMS(SMS sms) {
        
//        String[] mensagem = null;
//        mensagem[0] = sms.getMensagem();
        
        String[] mensagem = {sms.getMensagem()};
        
        outroEnviadorSMS.enviar(sms.getRemetente(), sms.getDestino(), mensagem);
    }
    
    
    
}
