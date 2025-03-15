package Model;

import Domain.Vendas;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VendasRepository {
    private ArrayList<Vendas> vendasList;

    /**
     * create the sales repository
     * @throws FileNotFoundException
     */
    public VendasRepository() throws FileNotFoundException {
        this.vendasList = CSVReader.readVendasFileToArray("src/Files/Cesaeland_vendas.csv");
    }

    /**
     * return all the sales
     * @return (ArrayList Vendas)
     */
    public ArrayList<Vendas> getVendasList() {
        return vendasList;
    }
}
