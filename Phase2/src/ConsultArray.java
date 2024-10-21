
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConsultArray 
{
    //An array list to store objects of type Consult
    private ArrayList<Consult> consultArr;
    
    /**
     * The paramaterized constructor of the ConsultArray class, it receives the resultSet of a query to get data from the tblConsultations table, and then extracts and manipulates
     * that data to store it as an object of type Consult in the instance variable consultArr
     * @param rs - this is the ResultSet of a query to retrieve all records stored in tblConsultations
     */
    public ConsultArray(ResultSet rs)
    {
        //initializing the ArrayList consultArr
        this.consultArr = new ArrayList<>();
        try {
            //For some reason, if i just used a while loop to create and add object to the array, it would always skip the first record. so i am adding the first record to the array as an object
            //and then using a while loop to loop through the rest of the resultset to add record to the array
            
            //data extraction from ResultSet rs
            String IDNumber = rs.getString("IDNumber");
            LocalDate consultDate = rs.getDate("consultDate").toLocalDate();
            
            //creating an object of type Consult and storing the object in the ArrayList consultArr
            Consult consObj = new Consult(IDNumber, consultDate);
            consultArr.add(consObj);
            
            //using a while loop to repeat this process for every other record in the ResultSet rs
            while (rs.next())
            {
                IDNumber = rs.getString("IDNumber");
                consultDate = rs.getDate("consultDate").toLocalDate();
                consObj = new Consult(IDNumber, consultDate);
                consultArr.add(consObj);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultArray.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * Typed toString() method which concatenates the objects stored in the consultArr ArrayList into a String
     * @return 
     */
    public String toString()
    {
        String output = "";
        for (int i = 0; i < consultArr.size(); i++)
        {
            output = output + consultArr.get(i).toString() + "\n";
        }
        return output;
    }
}
