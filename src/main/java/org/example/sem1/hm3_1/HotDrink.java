package org.example.sem1.hm3_1;

public abstract class HotDrink {
    private String name;
    private Double volume;
    private Integer price;

    public HotDrink(String name, Double volume, Integer price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
