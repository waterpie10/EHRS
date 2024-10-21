
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Patient 
{
    //fields of Patient class as per UML diagram
    private String IDNum;
    private String fName;
    private String sName;
    private String medHistory;

    /**
     * Paramaterized constructor that receives values for fields and initializes an object of type Patient 
     * @param IDNum - the patient's ID number
     * @param fName - the patient's first name
     * @param sName - the patient's surname 
     * @param medHis - the patient's medical history
     */
    public Patient(String IDNum, String fName, String sName, String medHis) 
    {
        this.IDNum = IDNum;
        this.fName = fName;
        this.sName = sName;
        this.medHistory = medHis;
    }
    
    /**
     * Inserts a new record into tblPatient using the data stored in the fields of Patient
     */
    public void addPatient()
    {
        dbConnect dbObj = new dbConnect();
        try {
            dbObj.stmt = dbObj.conn.createStatement();
            String statement = "INSERT INTO tblPatient (IDNumber, FirstName, Surname, MedicalHistory) VALUES ('" + IDNum + "', '" + fName + "', '"  + sName + "', '" + medHistory + "')";
            dbObj.stmt.executeUpdate(statement);
            dbObj.stmt.close();
            JOptionPane.showMessageDialog(null, "Added Patient Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: Could not add patient");
        }
    }
    
    /**
     * Updates either the ID number, first name or surname of a patient record in tblPatient
     * This method is static because it does not use any of the data stored in the fields of patient so it does not need to be initialized for each instance of Patient created, all the data it needs comes from its parameters or other methods
     * However since it is related to patients it makes sense to put it in the Patient class
     * @param column - the specific colum of tblPatient that must be updated
     * @param newData- the new data that tblPatient must be updated to
     * @param condition - the condition for the SQL query that will restrict which record gets updated in tblPatient
     */
    public static void updatePatient(String column, String newData, String condition)
    {
        dbConnect dbObj = new dbConnect();
        try {
            dbObj.stmt = dbObj.conn.createStatement();
            String statement = createQuery.updateData("tblPatient", column, newData, condition);
            dbObj.stmt.executeUpdate(statement);
            dbObj.stmt.close();
        } catch (SQLException ex) {
            System.out.println("Could not add patient");
        }
    }

    /**
     * Returns the value stored in the IDNum field
     * @return IDNum 
     */
    public String getIDNum() 
    {
        return IDNum;
    }

    /**
     * Sets the IDNum field to the parameter “IDNum”
     * @param IDNum 
     */
    public void setIDNum(String IDNum) 
    {
        this.IDNum = IDNum;
    }

    /**
     * Returns the value stored in the fName field
     * @return 
     */
    public String getfName() {
        return fName;
    }

    /**
     * Sets the fName field to the parameter “fName”
     * @param fName 
     */
    public void setfName(String fName) 
    {
        this.fName = fName;
    }

    /**
     * Returns the value stored in the sName field
     * @return 
     */
    public String getsName() {
        return sName;
    }

    /**
     * Sets the sName field to the parameter “sName”
     * @param sName 
     */
    public void setsName(String sName) 
    {
        this.sName = sName;
    }

    /**
     * Returns the value stored in the medHistory field
     * @return 
     */
    public String getMedHistory() 
    {
        return medHistory;
    }

    /**
     * Sets the medHistory field to the parameter “medHistory”
     * @param medHistory 
     */
    public void setMedHistory(String medHistory) 
    {
        this.medHistory = medHistory;
    }

    
    
    
    
}
