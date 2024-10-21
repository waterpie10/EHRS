
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MedicalAid extends Patient 
{
    //Fields of MedicalAid as per UML diagram
    private String medAid;
    private String medAidNum;
    
    /**
     * Receives initial values for a MedicalAid object and initialises a MedicalAid object 
     * @param IDNum - the ID number of the patient
     * @param fName - the patient's first name
     * @param sName - the patient's surname 
     * @param medHis - the patient's medical history
     * @param medAid - the name of the patient's medical aid provider
     * @param medAidNum  - the patient's medical aid membership number
     */
    public MedicalAid(String IDNum, String fName, String sName, String medHis, String medAid, String medAidNum)
    {
        super(IDNum, fName, sName, medHis);
        this.medAid = medAid;
        this.medAidNum = medAidNum;
    }
    
    /**
     * Adds a new record to tblPatient of a patient who does have medical aid 
     */
    public void addPatient()
    {
        //connecting to database
        dbConnect dbObj = new dbConnect();
        try {
            dbObj.stmt = dbObj.conn.createStatement();
            //creating query and executing query
            String statement = "INSERT INTO tblPatient (IDNumber, FirstName, Surname, MedicalHistory, MedicalAid, MedicalAidNumebr) VALUES ('" + getIDNum() + "', '" + getfName() + "', '"
                    + getsName() + "', '" + getMedHistory() + "', '" + medAid + "', '" + medAidNum + "')";
            dbObj.stmt.executeUpdate(statement);
            dbObj.stmt.close();
            JOptionPane.showMessageDialog(null, "Added Medical Aid Patient Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: Could not add medical aid patient");
        }
    }

    /**
     * Returns the value stored in the medAid field
     * @return 
     */
    public String getMedAid() 
    {
        return medAid;
    }

    /**
     * Sets the medAid field to the parameter “medAid”
     * @param medAid 
     */
    public void setMedAid(String medAid) 
    {
        this.medAid = medAid;
    }

    /**
     * Returns the value stored in the medAidNum field
     * @return 
     */
    public String getMedAidNum() {
        return medAidNum;
    }

    /**
     * Sets the medAidNum field to the parameter “medAidNum”
     * @param medAidNum 
     */
    public void setMedAidNum(String medAidNum) 
    {
        this.medAidNum = medAidNum;
    }
    
    
        
    
    
}
