package Model;

import Domain.Atracoes;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AtracoesRepository {
    private ArrayList<Atracoes> atracoesList;

    public AtracoesRepository() throws FileNotFoundException {
        this.atracoesList = CSVReader.readAtracoesFileToArray("src/Files/Cesaeland_atracoes.csv");
    }

    public ArrayList<Atracoes> getAtracoesList() {
        return atracoesList;
    }
}
