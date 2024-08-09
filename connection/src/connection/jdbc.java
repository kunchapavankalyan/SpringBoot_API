package connection;
import java.sql.*;
public class jdbc 
{
	public static void main(String[] args)
	{
		String jdbcUrl = "jdbc:mysql://localhost:3306/pavan"; // Replace with your database URL
        String username = "root"; // Replace with your database username
        String password = "P@van@1234"; // Replace with your database password

        
        try 
        {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            
            //***************************************************************
            //insert
            //***************************************************************
            String sql1="INSERT INTO employee (id, name) VALUES (?, ?)";
            PreparedStatement psI= connection.prepareStatement(sql1);
            psI.setInt(1, 5);//(? position,value),
            psI.setString(2, "pavan2");
           int rowsAffected = psI.executeUpdate();
           System.out.println("Rows affected: " + rowsAffected);
            
            /******************************************************************
             * update
             ******************************************************************/
            // Create a PreparedStatement for the UPDATE statement
            String updateSql = "UPDATE employee SET name = ? WHERE id = ?";
            PreparedStatement psU = connection.prepareStatement(updateSql);

            // Set parameters
            psU.setString(1, "updated"); // New name
            psU.setInt(2, 4); // ID of the record to update

            // Execute the update
            int rowsAffected1 = psU.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected1);
            /*************************************************************************
             * delete
             **************************************************************************/
         // Create a PreparedStatement for the DELETE statement
            String deleteSql = "DELETE FROM employee WHERE id = ?";
            PreparedStatement psD = connection.prepareStatement(deleteSql);

            // Set parameters
            psD.setInt(1, 2); // ID of the record to delete

            // Execute the delete
            int rowsAffected2 = psD.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected2);
          //***************************************************************
            //select
            //****************************************************************
            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query
            String sql = "SELECT * FROM employee";
            ResultSet resultSet = statement.executeQuery(sql);
            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
            
         // Close resources
            resultSet.close();
            statement.close();
            connection.close();
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }      
	}
}
