package info.deepidea.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, CoffeeFlavour> flavours = new HashMap<String, CoffeeFlavour>();

    CoffeeFlavour lookup(String flavorName) {
        if (!flavours.containsKey(flavorName))
            flavours.put(flavorName, new CoffeeFlavour(flavorName));
        return flavours.get(flavorName);
    }

    int totalCoffeeFlavoursMade() {
        return flavours.size();
    }
}
