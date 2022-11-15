package by.itstep.antonsvirid.model.logic;

import by.itstep.antonsvirid.model.entity.Container;
import by.itstep.antonsvirid.model.entity.Product;

public class ShopAssistance {
    public static double calculateTotalPrise(Container container) {
       if (container == null){
           return -1;
       }

        double total = 0;

        for (int i = 0; i < container.size(); i++) {
            Product product = container.get(i);
            total += product.getPrice();
        }

        return total;
    }
}
