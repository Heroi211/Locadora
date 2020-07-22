package Locadora.DAO;

/**
 *
 * @author Gabriel
 */

import Locadora.Model.Cliente;
import java.sql.*;

public class ClienteDAO 
{
    public void CadastraCliente(Cliente cliente) throws SQLException, ExceptionDAO
    {
        String SQL = "INSERT INTO CLIENTE VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        
        try
        {
            connection = new ConnectionMVC().getConnection();
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCPF());
            preparedStatement.setString(3, cliente.getEmail());
            preparedStatement.setString(4, cliente.getEndereco());
            preparedStatement.setString(5, cliente.getBairro());
            preparedStatement.setString(6, cliente.getCidade());
            preparedStatement.setString(7, cliente.getEstado());
            preparedStatement.setDate(8, new Date (cliente.getNascimento().getTime()));
            preparedStatement.execute();
        }
        catch(SQLException E)
        {   
            throw new ExceptionDAO("Ocorreu um erro ao tentar cadastrar o cliente: " + E);
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
            catch (SQLException E)
            {
                throw new ExceptionDAO("Ocorre um erro aot tentar fechar o objeto CONNECTION" + E);
            }
                
        }
    }
    
}
