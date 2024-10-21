import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class UserArray
{
    //An array list to store objects of type User 
    protected ArrayList<User> userArr;
    
    /**
     * rs parameter is the result set of a query to fetch all data from tblLogin,
     * the constructor will work through this result set, creating an object for each record 
     * and storing the object in the field userArr<>
     * @param rs 
     */
    public UserArray(ResultSet rs)
    {
        this.userArr = new ArrayList<>();
        try {
            String username = rs.getString("Username"); 
            String password = rs.getString("Password");
            User obj = new User(username, password);
            userArr.add(obj);
            while (rs.next())
            {
                username = rs.getString("Username"); 
                password = rs.getString("Password");
                obj = new User(username, password);
                userArr.add(obj);
            }
        } catch (SQLException ex) {
            System.out.println("Error, could not get result set");
        }
    }
    
    /**
     * This method will accept the credentials the user has input as parameters, 
     * compare the parameters to each individual username and password field of each object stored in userArr to determine if the input data matches an existing user account. 
     * If a match is found, the method returns true, else false;
     * @param u - input username
     * @param p - input password
     * @return 
     */
    public boolean login(String u, String p)
    {
        boolean output = false;
        for (int i = 0; i < userArr.size(); i++)
        {
           if (userArr.get(i).getUsername().equals(u) && userArr.get(i).getPassword().equals(p))
                   {
                       output = true;
                       return output;
                   }
        }
        return output;
    }
    
    /**
     * Typed toString() method that concatenates all of the fields of each User object stored in userArr into a string
     * @return 
     */
    public String toString()
    {
        String output = "";
        for (int i = 0; i < userArr.size(); i++) 
        {
            output = output + userArr.get(i).toString() + "\n";
        }
        return output;
    }
}
