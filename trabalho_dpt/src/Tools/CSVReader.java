package Tools;


import Domain.Atracoes;
import Domain.Custos;
import Domain.User;
import Domain.Vendas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {
    public static ArrayList<User> readUserFileToArray(String filePath) throws FileNotFoundException {
        // Initialize the User array (empty)
        ArrayList<User> usersArrayRead = new ArrayList<User>();

        //instantiate scanner to read the file (path passed by parameter)
        Scanner sc = new Scanner(new File(filePath));

        //cycle that will iterate for each row of the file
        while (sc.hasNextLine()) {

            //We store the entire line in the variable:line
            String line = sc.nextLine();

            // We create an array of strings, where each position will have a row column
            String[] separatedLine = line.split(",");

            // Create user object
            User newUser = new User(separatedLine[0],separatedLine[1],separatedLine[2]);

            //Add the new User to the Array
            usersArrayRead.add(newUser);
        }

        // close the scanner
        sc.close();

        return usersArrayRead;
    }

    public static ArrayList<Vendas> readVendasFileToArray(String filePath) throws FileNotFoundException {
        // Initialize the Vendas array (empty)
        ArrayList<Vendas> VendasArrayRead = new ArrayList<Vendas>();

        //instantiate scanner to read the file (path passed by parameter)
        Scanner sc = new Scanner(new File(filePath));

        //skip the first line
        sc.nextLine();

        //cycle that will iterate for each row of the file
        while (sc.hasNextLine()) {

            //We store the entire line in the variable:line
            String line = sc.nextLine();

            // We create an array of strings, where each position will have a row column
            String[] separatedLine = line.split(";");

            // Create Vendas object
            Vendas newVendas = new Vendas(Integer.parseInt(separatedLine[0]),separatedLine[1],separatedLine[2]);

            //Add the new Vendas to the Array
            VendasArrayRead.add(newVendas);
        }

        // close the scanner
        sc.close();

        return VendasArrayRead;
    }

    public static ArrayList<Atracoes> readAtracoesFileToArray(String filePath) throws FileNotFoundException {
        // Initialize the Atracoes array (empty)
        ArrayList<Atracoes> AtracoesArrayRead = new ArrayList<Atracoes>();

        //instantiate scanner to read the file (path passed by parameter)
        Scanner sc = new Scanner(new File(filePath));

        //skip the first line
        sc.nextLine();

        //cycle that will iterate for each row of the file
        while (sc.hasNextLine()) {

            //We store the entire line in the variable:line
            String line = sc.nextLine();

            // We create an array of strings, where each position will have a row column
            String[] separatedLine = line.split(";");

            // Create Atracoes object
            Atracoes newAtracoes = new Atracoes(Integer.parseInt(separatedLine[0]),separatedLine[1],Double.parseDouble(separatedLine[2]),Double.parseDouble(separatedLine[3]),Integer.parseInt(separatedLine[4]));

            //Add the new Atracoes to the Array
            AtracoesArrayRead.add(newAtracoes);
        }

        // close the scanner
        sc.close();

        return AtracoesArrayRead;
    }

    public static ArrayList<Custos> readCustosFileToArray(String filePath) throws FileNotFoundException {
        // Initialize the Custos array (empty)
        ArrayList<Custos> CustosArrayRead = new ArrayList<Custos>();

        //instantiate scanner to read the file (path passed by parameter)
        Scanner sc = new Scanner(new File(filePath));

        //skip the first line
        sc.nextLine();

        //cycle that will iterate for each row of the file
        while (sc.hasNextLine()) {

            //We store the entire line in the variable:line
            String line = sc.nextLine();

            // We create an array of strings, where each position will have a row column
            String[] separatedLine = line.split(";");

            // Create Custos object
            Custos newCustos = new Custos(Integer.parseInt(separatedLine[0]),Double.parseDouble(separatedLine[1]),Integer.parseInt(separatedLine[2]));

            //Add the new Atracoes to the Array
            CustosArrayRead.add(newCustos);
        }

        // close the scanner
        sc.close();

        return CustosArrayRead;
    }


}

