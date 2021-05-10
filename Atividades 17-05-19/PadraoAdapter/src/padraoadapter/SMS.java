package padraoadapter;

public class SMS {
    
    private String remetente;
    private String destino;
    private String mensagem;

    public SMS(String remetente, String destino, String mensagem) {
        this.remetente = remetente;
        this.destino = destino;
        this.mensagem = mensagem;
    }

    public String getRemetente() {
        return remetente;
    }

    public String getDestino() {
        return destino;
    }

    public String getMensagem() {
        return mensagem;
    }
}
