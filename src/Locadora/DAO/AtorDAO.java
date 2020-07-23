package Locadora.DAO;

import Locadora.Model.Ator;
import java.sql.*;

/**
 *
 * @author Gabriel
 */
public class AtorDAO 
{
    public void CadastraAtor(Ator ator) throws ExceptionDAO, SQLException
    {
        String SQL = "INSERT INTO ATOR (NOME,NACIONALIDADE) VALUES (?,?)";
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        
        try
        {
            connection = new ConnectionMVC().getConnection();
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, ator.getNome());
            preparedStatement.setString(2, ator.getNacionalidade());
            preparedStatement.execute();
        }
        catch(SQLException E)
        {
            throw new ExceptionDAO("Ocorreu um erro ao cadastrar o ator: " + E);
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
                
                throw new ExceptionDAO("Ocorreu um erro ao tentar fechar o objeto STATEMENT " + E);
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
