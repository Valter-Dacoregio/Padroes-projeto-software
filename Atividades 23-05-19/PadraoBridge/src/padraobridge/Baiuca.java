package padraobridge;

public class Baiuca implements IHabitacao {
    
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
