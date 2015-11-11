package kata5;

import java.io.*;
import java.sql.*;

public class Kata5 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        
        //Class.forName("org.sqlite.JDBC");
        //Connection conec = DriverManager.getConnection("jdbc:sqlite:mails");
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conec = DriverManager.getConnection("jdbc:oracle:thin:@10.22.143.90:1521:orcl", "system","orcl");
        
        Statement state = conec.createStatement();
        ResultSet rs = state.executeQuery(" SELECT * FROM People");
        
        System.out.println("ID \t NAME");
        System.out.println("-----------------");
        while (rs.next()) {
            System.out.print(rs.getInt("ID"));
            System.out.println(" \t " + rs.getString("Name"));
        }
        
        /*String path = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\kata5\\emailsfilev1.txt"; 
        BufferedReader reader = new BufferedReader(new FileReader (new File (path)));
        
        String mail;
        while((mail = reader.readLine())!=null){
            String query= " INSERT INTO Mail (Mail) VALUES ('"+ mail + "')";
            state.executeUpdate(query);
        }
        
        rs.close();
        state.close();
        conec.close();
        
        */
    }
    
}
