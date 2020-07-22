
package Locadora.Controller;

import Locadora.DAO.ExceptionDAO;
import Locadora.Model.Ator;
import java.sql.SQLException;
import java.text.ParseException;


public class AtorController 
{
    
    public boolean CadastraAtor(String nome,String nacionalidade) throws ExceptionDAO, SQLException,ParseException
    {
        if(nome != null && nome.length() > 0 && nacionalidade != null && nacionalidade.length() > 0)
        {
            Ator ator = new Ator(nome, nacionalidade);
            ator.CadastraAtor(ator);
            return true;
        }
        
            return false;

    }
    
}
