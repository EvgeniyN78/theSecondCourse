package flowers;

import static checkValue.Validatoin.*;

public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private Double cost;
    private Integer lifeSpan; //срок стояния, указанный в целых днях
    private Integer quantity;

    public Flower(String name, String flowerColor, String country, Double cost, Integer lifeSpan, Integer quantity) {
        this.name = name;
        this.flowerColor = validateColor(flowerColor);
        this.country = validateCountry(country);
        this.cost = validateCost(cost);
        this.lifeSpan = validateLifeSpan(lifeSpan);
        this.quantity = validateQuantity(quantity);
    }


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = validateColor(flowerColor);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = validateCountry(country);
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = validateCost(cost);
    }

    public Integer getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(Integer lifeSpan) {
        this.lifeSpan = validateLifeSpan(lifeSpan);
    }

    @Override
    public String toString() {
        return "Цветок: " + name +
                ", цвет " + flowerColor +
                ", страна происхождения " + country +
                ", стоимость " + cost +
                " руб., срок стояния " + lifeSpan +
                " дн.";
    }
}


