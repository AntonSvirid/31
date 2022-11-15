package by.itstep.antonsvirid.model.entity;

import java.util.Objects;

public class Bread extends Product {

    private String color;
    private String flour;


    public Bread() {
    }

    public Bread(String color, String flour, double price) {
       super(price);
        setColor(color);    //  так можно без копипаста оставить проверку адекватности
        //this.color = color;
        this.flour = flour;
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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bread bread = (Bread) o;
        return color.equals(bread.color) && Objects.equals(color, bread.color) && Objects.equals(flour, bread.flour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, flour, getPrice());
    }

    @Override
    public String toString() {
        return "Bread{" +
                "color='" + color + '\'' +
                ", flour='" + flour + '\'' +
              //  ", price=" + price +
                '}';
    }
}



