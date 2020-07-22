package Locadora.DAO;
import java.sql.*;

/**
 *
 * @author Gabriel
 */
public class ConnectionMVC 
{
       String userBD = "root";
       String PWD = "280387ga21";
       String UrlConnection = "jdbc:mysql://localhost:3306/locadora?useSSL=false";
    public Connection getConnection()
    {
        Connection conexao = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException E)
        {
            E.printStackTrace();
        }
        
        try
        {
            conexao = DriverManager.getConnection(UrlConnection,userBD,PWD);
        }
        catch(SQLException E)
        {
            E.printStackTrace();
        }
        return conexao;
    }
    
    
}
