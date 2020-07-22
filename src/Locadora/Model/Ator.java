package Locadora.Model;

import Locadora.DAO.AtorDAO;
import Locadora.DAO.ExceptionDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class Ator 
{
    private int ID_Ator;
    private String Nome;
    private String Nacionalidade;
    private ArrayList<Filme> Filmes =  new ArrayList<Filme>();
    
    public Ator(){};
    
    public Ator(String Nome, String Nacionalidade)
    {
        this.Nome = Nome;
        this.Nacionalidade = Nacionalidade;
    }

    public int getID_Ator() {
        return ID_Ator;
    }

    public String getNome() {
        return Nome;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public ArrayList<Filme> getFilmes() {
        return Filmes;
    }

    public void setID_Ator(int ID_Ator) {
        this.ID_Ator = ID_Ator;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    public void setFilmes(ArrayList<Filme> Filmes) {
        this.Filmes = Filmes;
    }
    
    public void CadastraAtor(Ator ator) throws ExceptionDAO, SQLException 
    {   
       new AtorDAO().CadastraAtor(ator);
    }
}
