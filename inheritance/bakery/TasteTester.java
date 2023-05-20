package inheritance.bakery;

public class TasteTester {

    public static void main(String[] args){
        Cake cake = new Cake();
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlaver());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlaver());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlaver("pina colada");
        weddingCake.setPrice(350.0);
        System.out.println("Wedding cake flavor: " + weddingCake.getFlaver());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
    }
}

