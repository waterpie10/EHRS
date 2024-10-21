
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Script 
{
    //Instance variables as per UML diagram
    private String IDNum;
    private String scriptInfo;

    /**
     * Parameterized constructor that initializes the instance variables of class Script with initial values, creates an object of type Script
     * @param IDNum - the ID number of the patient that this script has been issued to  
     * @param scriptInfo - the physical information contained within this script
     */
    public Script(String IDNum, String scriptInfo) 
    {
        this.IDNum = IDNum;
        this.scriptInfo = scriptInfo;
    }
    
    /**
     * Adds a new record to tblScripts
     */
    public void addScript()
    {
        dbConnect dbObj = new dbConnect();
        try {
            dbObj.stmt = dbObj.conn.createStatement();
            String statement = "INSERT INTO tblScripts (PatientID, ScriptInformation) VALUES ('" + IDNum + "', '" + scriptInfo + "')";
            dbObj.stmt.executeUpdate(statement);
            dbObj.stmt.close();
            JOptionPane.showMessageDialog(null, "Script recorded successfully!");
        } catch (SQLException ex) {
            System.out.println("Could not add script");
        }
    }

    /**
     * Returns the string value stored in the instance variable IDNum
     * @return 
     */
    public String getIDNum() {
        return IDNum;
    }

    /**
     * Changes the value stored in the instance variable IDNum to the parameter IDNum
     * @param IDNum 
     */
    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    /**
     * Returns the string value stored in the instance variable scriptInfo
     * @return 
     */
    public String getScriptInfo() {
        return scriptInfo;
    }

    /**
     * Sets the value stored in the instance variable scriptInfo to value stored in the parameter scriptInfo 
     * @param scriptInfo 
     */
    public void setScriptInfo(String scriptInfo) {
        this.scriptInfo = scriptInfo;
    }
    
    
    
    
}
