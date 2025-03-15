package Model;

import Domain.User;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UserRepository {
    private ArrayList<User> userList;

    /**
     * create the users repository
     * @throws FileNotFoundException
     */
    public UserRepository() throws FileNotFoundException {
        this.userList = CSVReader.readUserFileToArray("src/Files/Cesaeland_logins.csv");
    }

    /**
     * return all the users and types
     * @return (ArrayList USer)
     */
    public  ArrayList<User> getUserList(){
        return userList;
    }
}
