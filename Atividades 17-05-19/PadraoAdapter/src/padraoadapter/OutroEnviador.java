package padraoadapter;

public class OutroEnviador implements InterfaceOutroEnviadorSMS {

    @Override
    public void enviar(String origem, String destinatario, String[] mensagem) {
        System.out.println("Origem.....: " + origem);
        System.out.println("Destino....: " + destinatario);
        System.out.println("Mensagem...: " + mensagem[0]);
    }
}
