package info.deepidea.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private final List<Order> orders = new ArrayList<Order>();
    private final Menu menu = new Menu();

    void takeOrder(String flavourName, int table) {
        CoffeeFlavour flavour = menu.lookup(flavourName);
        Order order = new Order(table, flavour);
        orders.add(order);
    }

    void service() {
        for (Order order : orders)
            order.serve();
    }

    String report() {
        return "\ntotal CoffeeFlavour objects made: "
                + menu.totalCoffeeFlavoursMade();
    }
}
