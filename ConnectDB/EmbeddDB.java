
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 


public class EmbeddDB {
    Connection conn;
    
    public Connection getConnection(){
        
        
        try {
            conn = DriverManager.getConnection("jdbc:h2:~/usersDB", "test", "test");
            return conn;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        
    }
    
   
}