package Model;

import Domain.Custos;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CustosRepository {
    private ArrayList<Custos> CustosList;

    /**
     * create the costs repository
     * @throws FileNotFoundException
     */
    public CustosRepository() throws FileNotFoundException {
        this.CustosList = CSVReader.readCustosFileToArray("src/Files/Cesaeland_custos.csv");
    }

    /**
     * return all the costs per attraction
     * @return (ArrayList Custos)
     */
    public ArrayList<Custos> getCustosList() {
        return CustosList;
    }
}
