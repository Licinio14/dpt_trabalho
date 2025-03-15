package Domain;

public class Vendas {
    private int id;
    private String date;
    private String Type;

    public Vendas(int id, String date, String type) {
        this.id = id;
        this.date = date;
        Type = type;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return Type;
    }
}
