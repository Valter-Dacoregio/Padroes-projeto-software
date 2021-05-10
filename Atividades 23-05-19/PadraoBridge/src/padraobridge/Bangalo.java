package padraobridge;

public class Bangalo implements IHabitacao {
    
    private String nome = "Bangalô";
    private IPorta porta;
    
    @Override
    public void instalarPorta(IPorta porta) {
        this.porta = porta;
    }

    @Override
    public void abrirPorta() {
        this.porta.abrirSe();
    }

    @Override
    public void fecharPorta() {
        this.porta.fecharSe();
    }
}
