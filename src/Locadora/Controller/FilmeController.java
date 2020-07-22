package Locadora.Controller;

import Locadora.DAO.ExceptionDAO;
import Locadora.Model.Filme;
import java.sql.SQLException;
import java.text.ParseException;


public class FilmeController 
{
    public boolean cadastrarFilme(String titulo,String genero,String sinopse,int duracao)throws ParseException, SQLException, ExceptionDAO 
    {
        if (titulo != null && titulo.length() > 0 && genero != null && genero.length() > 0 && sinopse != null && sinopse.length() > 0 && duracao > 0 ) 
        {
            Filme filme = new Filme(titulo,genero,sinopse,duracao);
            filme.cadastrarFilme(filme);
            return true;
        }
        
        return false;
    }
    
}
