package Locadora.DAO;

/**
 *
 * @author Gabriel
 */

import java.sql.*;
import Locadora.Model.Filme;
public class FilmeDAO 
{
     public void CadastraFilme(Filme filme) throws ExceptionDAO, SQLException
     {
         String SQL = "INSERT INTO FILME VALUES (?,?,?,?)";
         PreparedStatement  preparedStatement = null;
         Connection connection = null;
         
         try
         {
             connection = new ConnectionMVC().getConnection();
             preparedStatement = connection.prepareStatement(SQL);
             preparedStatement.setString(1, filme.getTitulo());
             preparedStatement.setString(2, filme.getGenero());
             preparedStatement.setString(3, filme.getSinopse());
             preparedStatement.setInt(4, filme.getDuracao());
             preparedStatement.execute();
         }
         catch (SQLException E)
         {
             throw new ExceptionDAO("Erro ao cadastrar o filme: " + E);
         }
         finally
         {
             try
             {
                 if(preparedStatement != null)
                 {
                     preparedStatement.close();
                 }
             }
             catch(SQLException E)
                {
                    throw new ExceptionDAO("Erro ao fechar o objeto STATEMENT " + E);
                }
            
             try
             {
                 if(connection != null)
                 {
                     connection.close();
                 }
             }
             catch (SQLException E)
                     {
                         throw new ExceptionDAO("Erro ao fechar o objeto CONNECTION" + E);
                     }
         }
         
         
     }
    
}
