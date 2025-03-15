package Model;

import Domain.Vendas;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VendasRepository {
    private ArrayList<Vendas> vendasList;

    public VendasRepository() throws FileNotFoundException {
        this.vendasList = CSVReader.readVendasFileToArray("src/Files/Cesaeland_vendas.csv");
    }

    public ArrayList<Vendas> getVendasList() {
        return vendasList;
    }
}
