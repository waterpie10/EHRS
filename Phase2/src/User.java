import java.sql.SQLException;

public class User 
{
    //Fields of User as per UML diagram
    private String username;
    private String password;
    
    /**
     * Receives values for fields and initialises an object of type User
     * @param u - username 
     * @param p - password 
     */
    public User(String u, String p)
    {
        this.username = u;
        this.password = p;
    }
    
    /**
     * Inserts a new record into tblLogin
     */
    public void addUser()
    {
        //Connects to database
        dbConnect dbObj = new dbConnect();
        try {
            dbObj.stmt = dbObj.conn.createStatement();
            //Creates INSERT INTO query and executes query
            String statement = "INSERT INTO tblLogin VALUES ('" + username + "', '" + password + "')";
            dbObj.stmt.executeUpdate(statement);
            dbObj.stmt.close();
        } catch (SQLException ex) {
            System.out.println("Could not create add user statement");
        }
    }
    
    /**
     * This is a static method because it is a reset password method, hence the user does not have enough information to completely initialise a User object because they do not know their
     * password, thus the method does not need to be bound to each instance of the User class and it can instead be static
     * @param uName - the username of the user who forgot their password 
     * @param newPassword - the new password that will be used to update tblLogin and overwrite the old password
     */
    public static void resetPassword(String uName, String newPassword)
    {
        //Connects to database
        dbConnect dbObj = new dbConnect();
        try {
            dbObj.stmt = dbObj.conn.createStatement();
            //Creates INSERT INTO query and executes query
            String statement = "UPDATE tblLogin SET Password = '" + newPassword + "' WHERE Username = '" + uName + "'";
            dbObj.stmt.executeUpdate(statement);
            dbObj.stmt.close();
        } catch (SQLException ex) {
            System.out.println("Could not create reset password statement");
        }
    }

    /**
     * Returns the value stored in the username field
     * @return 
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the field username to the parameter “username”
     * @param username 
     */
    public void setUsername(String username) 
    {
        this.username = username;
    }

    /**
     * Returns the value stored in the password field
     * @return 
     */
    public String getPassword() 
    {
        return password;
    }

    /**
     * Sets the field password to the parameter "password"
     * @param password 
     */
    public void setPassword(String password) 
    {
        this.password = password;
    }
    
    /**
     * Typed toString() method that concatenates all the fields of User into a single String
     * @return 
     */
    public String toString()
    {
        return "Username: " + username + "; Password: " + password;
    }
    
    
}
