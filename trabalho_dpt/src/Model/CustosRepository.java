package Model;

import Domain.Custos;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CustosRepository {
    private ArrayList<Custos> CustosList;

    public CustosRepository() throws FileNotFoundException {
        this.CustosList = CSVReader.readCustosFileToArray("src/Files/Cesaeland_custos.csv");
    }

    public ArrayList<Custos> getCustosList() {
        return CustosList;
    }
}
