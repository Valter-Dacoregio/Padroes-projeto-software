package principal;

import java.util.HashMap;
import padraoadapter.Adapter;
import padraoadapter.InterfaceEnviadorSMS;
import padraoadapter.InterfaceOutroEnviadorSMS;
import padraoadapter.OutroEnviador;
import padraoadapter.SMS;

public class Principal {

    public static void main(String[] args) {
        
        // INTERFACE UTILIZADA, PODE SER UM JAR, 
        // APENAS UTILIZAMOS, NÃO PODEMOS ALTERAR
        InterfaceOutroEnviadorSMS outroEnviadorSMS = new OutroEnviador();
        
        SMS sms = new SMS("Valter", "Darlan", "Dae, bichão...");
        InterfaceEnviadorSMS adapter = new Adapter(outroEnviadorSMS);
        adapter.enviaSMS(sms);
        
        HashMap<String, String> map = new HashMap<>();
        map.put ("1", "Valter");
        map.put("1", "Valter");
        map.put("1", "Valter");
        map.put("1", "Valter");
        
        
        
    }
}
