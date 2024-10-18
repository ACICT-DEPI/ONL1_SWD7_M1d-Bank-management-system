/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management;

/*import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.sql.DriverManager
import java.sql.SQLException
import java.sql.Connection
import java.sql.Statement
/**
 *
 * @author NOTEBOOK
 */
public class LogFile {
  /*  public static void createFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (file.createNewFile()) {
            System.out.println("File  created: " + file.getName());
        } else {
            System.out.println("File already exists.");   

        }
    }

    public static Connection connectToDatabase(String url, String username, String password) throws SQLException {
        Connection connection;
        connection = (Connection) DriverManager.getConnection(url, username, password);
        System.out.println("Connected   to database successfully.");
        return connection;
    }

    public static void writeToFile(String fileName, String data) throws IOException {
        FileWriter writer = new FileWriter(fileName, true); // Append mode
        writer.write(data);
        writer.close();
        System.out.println("Data written to file successfully.");
    }

    public static void readFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

    }

    /**
     *
     * @param connection
     * @param tableName
     * @param data
     * @throws SQLException
     */
    /*public static void writeToDatabase(Connection connection, String tableName, String data)  throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO " + tableName + " VALUES ('" + data + "')";
        statement.executeUpdate(sql);
  
        System.out.println("Data written to database successfully.");
    }

    public static void readFromDatabase(Connection connection, String tableName) throws SQLException  {
        Statement statement =connection.createStatement();
        ResultSet resultSet = statement.execute("SELECT   * FROM " + tableName);
         String data;
        while (resultSet.next()) {
            data = resultSet.getString(1);
            System.out.println(data);
        }
        resultSet.close();
       statement.close();
    }*/
}
