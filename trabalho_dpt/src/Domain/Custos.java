package Domain;

public class Custos {
    private int id;
    private double ticketCost;
    private int monthlyCost;

    public Custos(int id, double ticketCost, int monthlyCost) {
        this.id = id;
        this.ticketCost = ticketCost;
        this.monthlyCost = monthlyCost;
    }

    public int getId() {
        return id;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public int getMonthlyCost() {
        return monthlyCost;
    }
}
