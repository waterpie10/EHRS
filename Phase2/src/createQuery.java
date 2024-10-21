public class createQuery
{
    /**
     * Creates an INSERT INTO SQL query using the parameters to complete the query, returns the query as a string  
     * this method is static because it does not need an object to function
     * @param table
     * @param values
     * @return 
     */
    public static String addData(String table, String values)
    {
        String query = "INSERT INTO " + table + " VALUES (" + values + ")";
        return query;
    }
    
    /**
     * Creates an UPDATE SQL query using the parameters to complete the query, returns the query as a string
     * this method is static because it does not need an object to function
     * @param table
     * @param column
     * @param newData
     * @param condition
     * @return 
     */
    public static String updateData(String table, String column, String newData, String condition)
    {
        String query = "UPDATE " + table + " SET " + column + " = '" + newData + "' WHERE " + condition;
        return query;
    }
    
    /**
     * Creates a SELECT * SQL query using the parameter to complete the query, returns the query a string
     * this method is static because it does not need an object to function
     * @param table
     * @return 
     */
    public static String getData(String table)
    {
        String query = "SELECT * FROM " + table;
        return query;
    }
    
    
}
