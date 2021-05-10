package observer;

public interface Observable {
    
    public void adicionarAmigo(Observer o);
    public void removerAmigo(Observer o);
    public void notifacar();
}
