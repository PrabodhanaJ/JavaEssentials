package inheritance.bakery;

public class Cake {
    protected String flaver;
    protected double price;

    public Cake() {
        this("vanilla");
    }

    public Cake(String flaver) {
        setFlaver(flaver);
        setPrice(9.99);
    }

    public String getFlaver() {
        return flaver;
    }

    public void setFlaver(String flaver) {
        this.flaver = flaver;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
