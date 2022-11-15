package by.itstep.antonsvirid.model.logic;

import by.itstep.antonsvirid.model.entity.Basket;
import by.itstep.antonsvirid.model.entity.Container;
import by.itstep.antonsvirid.model.entity.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopAssistanceTest {
    @Test
    public void testEmptyContainer() {
        Container container = new Basket();

        int expected = 0;

        double actual = ShopAssistance.calculateTotalPrise(container);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testNull() {
        Container container = null;
        double expected = -1;

        double actual = ShopAssistance.calculateTotalPrise(container);

        assertEquals(expected, actual, 0.001);

    }

    @Test
    public void testContainerHasOneProduct(){
        Container container = new Basket();
        Product product = new Product();
        container.add(product);
        
        double expected = product.getPrice();

        double actual = ShopAssistance.calculateTotalPrise(container);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalPrise(){
        Container container = new Basket();
        container.add(new Product(10.5));
        container.add(new Product(20.11));
        container.add(new Product(30.3));

        double expected = 60.19;

        double actual = ShopAssistance.calculateTotalPrise(container);

        assertEquals(expected, actual, 0.001);
    }

}
