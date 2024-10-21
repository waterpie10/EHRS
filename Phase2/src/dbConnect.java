import java.sql.*;
import javax.swing.JOptionPane;

public class dbConnect 
{
    //Fields of dbConnect as per UML diagram, they are protected because they need to be edited in other classes and it is more efficient to use protected than a setter method
    protected Connection conn = null;
    protected Statement stmt = null;
    
    /**
     * Creates a connection to a database, initialises an object of type dbConnect
     */
    public dbConnect()
    {
        String driver = "jdbc:ucanaccess://" + "MedicalPractice.accdb";
        
        try 
        {
            conn = DriverManager.getConnection(driver);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error. Could not connect to database");
        }
    }
    
    
    /**
     * Executes a query and returns the result as a ResultSet
     * @param statement
     * @return 
     */
    public ResultSet executeQry(String statement)
    {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(statement);
            
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        return rs;
    }
    
    
}
