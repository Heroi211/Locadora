
package Locadora.DAO;

import Locadora.Model.Item;
import java.sql.*;
/**
 *
 * @author Gabriel
 */
public class ItemDAO 
{
    public void CadastraItem(Item item) throws SQLException,ExceptionDAO
    {
        String SQL = "INSERT INTO ITEM VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        
        try
        {
            connection = new ConnectionMVC().getConnection();
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setDouble(1, item.getPreco());
            preparedStatement.setString(2, item.getTipo());
            preparedStatement.setDate(3, new Date(item.getLocacao().getTime()));
            preparedStatement.setDate(4, new Date(item.getDevolucao().getTime()));
            preparedStatement.execute();
        }
        catch(SQLException E)
        {
            throw new ExceptionDAO("Ocorreu um erro ao tentar cadastrar o item: " + E);
        }
        finally
        {
            try
            {
                if (preparedStatement != null)
                {
                    preparedStatement.close();
                }
            }
            catch(SQLException E)
            {
                throw new ExceptionDAO("Ocorreu um erro ao tentar fechar o objeto STATEMENT" + E);
            }
            try
            {
                if (connection != null)
                {
                    connection.close();
                }
            }
            catch(SQLException E)
            {
                throw new ExceptionDAO("Ocorreu um erro ao tentar fechar o objeto CONNECTION" + E);
            }
        }
    }
    
}
