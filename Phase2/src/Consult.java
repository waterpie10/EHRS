
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Consult
{
    //Instance variables of the class Consult as per the UML diagram
    private String IDNum;
    private LocalDate consultDate;
    
    /**
     * Parameterized constructor of the class Consult, Receives values for the fields and initialises an object of type Consult
     * @param ID - this parameter is the ID number that corresponds to the IDNum instance variable and it is the ID number of a patient with a corresponding booking
     * @param cDate - this parameter is the consultation date that corresponds to the consultDate instance variable and it is the chosen date for a consultation booking with a patient
     */
    public Consult(String ID, LocalDate cDate)
    {
        this.IDNum = ID;
        this.consultDate = cDate;
    }
    
    /**
     * This is a void method that uses the information stored in the instance variables to create a new record in tblConsultations
     */
    public void addConsult()
    {
        dbConnect dbObj = new dbConnect();
        try {
            dbObj.stmt = dbObj.conn.createStatement();
            String statement = "INSERT INTO tblConsultations (IDNumber, consultDate) VALUES ('" + IDNum + "', #" + consultDate + "#)"; 
            dbObj.stmt.executeUpdate(statement);
            dbObj.stmt.close();
            JOptionPane.showMessageDialog(null, "Consult booked successfully!");
        } catch (SQLException ex) {
            System.out.println("Could not book consult.");
        }
    }

    /**
     * Typed getter method which returns the String value stored in the IDNum instance variable
     * @return 
     */
    public String getIDNum() {
        return IDNum;
    }

    /**
     * Void setter method which alters the String ID number value stored in the instance variable IDNum
     * @param IDNum - this parameter represents the new ID Number that the instance variable ID Number must be updated to
     */
    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    /**
     * Typed getter method which returns the LocalDate value stored in the consultDate instance variable
     * @return 
     */
    public LocalDate getConsultDate() {
        return consultDate;
    }

    /**
     * Void setter method which alters the LocalDate value stored in the instance variable consultDate
     * @param consultDate - this parameter represents the new consultation date that the instance variable consultDate must be updated to
     */
    public void setConsultDate(LocalDate consultDate) {
        this.consultDate = consultDate;
    }
    
    /**
     * Typed toString() method which concatenates the values of a Consult object into a String
     * @return 
     */
    public String toString()
    {
        return "Date of consult: " + consultDate + "\tID Number of patient to consult: " + IDNum;
    }
    
    
}
