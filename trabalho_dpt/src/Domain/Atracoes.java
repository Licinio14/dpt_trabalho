package Domain;

public class Atracoes {
    private int id;
    private String name;
    private double priceAdult;
    private double priceChild;
    private int seconds;

    public Atracoes(int id, String name, double priceAdult, double priceChild, int seconds) {
        this.id = id;
        this.name = name;
        this.priceAdult = priceAdult;
        this.priceChild = priceChild;
        this.seconds = seconds;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPriceAdult() {
        return priceAdult;
    }

    public double getPriceChild() {
        return priceChild;
    }

    public int getSeconds() {
        return seconds;
    }
}
