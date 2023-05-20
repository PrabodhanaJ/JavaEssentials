package inheritance.bakery;

public class BirthdayCake extends Cake {
    protected String candles;

    public BirthdayCake() {
        super("chocolate");
    }

    public String getCandles() {
        return candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }
}
