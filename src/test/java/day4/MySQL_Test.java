package day4;

import Utility.ConfigurationReader;
import Utility.DB_Utility;

public class MySQL_Test {
// new stuff
    public static void main(String[] args) {
        String connectionStr = ConfigurationReader.getProperty("library1.database.url");
        String username = ConfigurationReader.getProperty("library1.database.username");
        String password = ConfigurationReader.getProperty("library1.database.password");

        DB_Utility.createConnection(connectionStr ,username, password );

        DB_Utility.runQuery("SELECT * FROM books");
        DB_Utility.displayAllData();

        DB_Utility.destroy();
    }
}