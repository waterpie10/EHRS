import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PatientArray 
{
    //An arraylist of type patient
    protected ArrayList<Patient> patArr;
    
    /**
     * rs parameter is the result set of a query to fetch all data from tblPatient, the constructor will work through 
     * this result set, creating a Patient object or MedicalAid object for each record depending on whether that patient 
     * has medical aid or not, and stores the object in the field patArr<>
     * @param rs 
     */
    public PatientArray(ResultSet rs)
    {
        this.patArr = new ArrayList<>();
        try {
            String IDNum = rs.getString("IDNumber");
            String fName = rs.getString("FirstName");
            String sName = rs.getString("Surname");
            String medHis = rs.getString("MedicalHistory");
            String medAid = rs.getString("MedicalAid");
            String medAidNum = rs.getString("MedicalAidNumber");
            if (medAid == null)
                {
                    //Creating a Patient object and adding it to the array 
                    Patient patObj = new Patient(IDNum, fName, sName, medHis);
                    patArr.add(patObj);
                }
                else
                {
                    //Creating a MedicalAid object and adding it to the array
                    MedicalAid medAidPatObj = new MedicalAid(IDNum, fName, sName, medHis, medAid, medAidNum);
                    patArr.add(medAidPatObj);
                }
            
            while (rs.next())
            {
                //Extracting the data from ResultSet rs
                IDNum = rs.getString("IDNumber");
                fName = rs.getString("FirstName");
                sName = rs.getString("Surname");
                medHis = rs.getString("MedicalHistory");
                medAid = rs.getString("MedicalAid");
                medAidNum = rs.getString("MedicalAidNumber");
                //Determining if the record has medical aid information or not
                if (medAid == null)
                {
                    //Creating a Patient object and adding it to the array 
                    Patient patObj = new Patient(IDNum, fName, sName, medHis);
                    patArr.add(patObj);
                }
                else
                {
                    //Creating a MedicalAid object and adding it to the array
                    MedicalAid medAidPatObj = new MedicalAid(IDNum, fName, sName, medHis, medAid, medAidNum);
                    patArr.add(medAidPatObj);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error, could not get result set");
        }
    }
    
    /**
     * Returns a string array. Each index in the array is made up of a patients first name, surname and ID number
     * @return 
     */
    public String[] getNameAndID()
    {
        String[] optionsArr = new String[patArr.size()];
        for (int i = 0; i < patArr.size(); i++) 
        {
            String identifier = patArr.get(i).getfName() + " " + patArr.get(i).getsName() + " " + patArr.get(i).getIDNum();
            optionsArr[i] = identifier;
        }
        return optionsArr;
    }
}
