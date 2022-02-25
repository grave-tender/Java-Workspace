package test;

import java.util.Map;
import java.util.HashMap;

public class TEST {
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        
        names.put("ChatDeJhon","Garfield");
        names.put("MonChat", "Daisy");
        names.put("ChatDeMaBlonde", "Livi");
        
        for(Map.Entry chat: names.entrySet()) {
            System.out.println("k: "+ chat.getKey() +"\tv:"+ chat.getValue());
        }

        System.out.println("valeur de MonChat: "+ names.get("MonChat")); //si la cle existe pas, il va retourner null
    }
}
