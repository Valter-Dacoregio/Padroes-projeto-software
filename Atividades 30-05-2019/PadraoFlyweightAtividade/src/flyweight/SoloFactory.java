package flyweight;

import java.util.HashMap;
import java.util.Map;

public class SoloFactory {
    
    private Map<String,ISolo> solos;

    public SoloFactory() {
        this.solos = new HashMap<>();
        this.criarTodosSolos();
    }
    
    private void criarTodosSolos() {
        this.solos.put("TERRA", new SoloTerra());
        this.solos.put("PEDRA", new SoloPedra());
        this.solos.put("GRAMA", new SoloGrama());
    }
    
    public ISolo retornarSolo(String chave) {
        return this.solos.get(chave);
    }
}
