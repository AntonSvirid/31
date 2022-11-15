package by.itstep.antonsvirid.model.entity;

import java.util.Objects;

public class BreadEntity {
    //состояние
    private String color;
    private String flour;
    private double price;

    public BreadEntity() {
    }

    public BreadEntity(String color, String flour, double price) {
        setColor(color);    //  так можно без копипаста оставить проверку адекватности
        //this.color = color;
        this.flour = flour;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if (price > 0) {
            this.price = price;
        } else {
            throw new Exception();
        }
    }

//    @Override     // что-то не работает...
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Bread bread = (Bread) o;
//        return Double.compare(bread.price, price) == 0 && Objects.equals(color, bread.color) && Objects.equals(flour, bread.flour);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(color, flour, price);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "color='" + color + '\'' +
                ", flour='" + flour + '\'' +
                ", price=" + price +
                '}';
    }
}



