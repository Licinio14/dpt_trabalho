package Controllers;

import Domain.Atracoes;
import Model.AtracoesRepository;
import Model.VendasRepository;
import Tools.Colors;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CustomerController {
    private AtracoesRepository atracoesRepository;
    private VendasRepository vendasRepository;

    public CustomerController() throws FileNotFoundException {
        this.atracoesRepository = new AtracoesRepository();
        this.vendasRepository = new VendasRepository();
    }

    public ArrayList<Atracoes> getAllAtractions(){

        return this.atracoesRepository.getAtracoesList();
    }

    public String calcPlayTime(int secs){
        int minutes = secs / 60;
        int sec = secs % 60;

        return minutes + ":" + sec;
    }
}
