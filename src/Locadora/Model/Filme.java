
package Locadora.Model;

import Locadora.DAO.ExceptionDAO;
import Locadora.DAO.FilmeDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class Filme 
{
    private int ID_Filme;
    private String Titulo;
    private String Genero;
    private String Sinopse;
    private int Duracao;
    private ArrayList<Item> Itens = new ArrayList<Item>();
    private ArrayList<Ator> Atores = new ArrayList<Ator>();
    
    public Filme(){};
    public Filme(String Titulo,String Genero, String Sinopse, int Duracao)
    {
        this.Titulo = Titulo;
        this.Genero = Genero;
        this.Sinopse = Sinopse;
        this.Duracao = Duracao;
        
    }

    public int getID_Filme() {
        return ID_Filme;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public String getSinopse() {
        return Sinopse;
    }

    public int getDuracao() {
        return Duracao;
    }

    public ArrayList<Item> getItens() {
        return Itens;
    }

    public ArrayList<Ator> getAtores() {
        return Atores;
    }

    public void setID_Filme(int ID_Filme) {
        this.ID_Filme = ID_Filme;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setSinopse(String Sinopse) {
        this.Sinopse = Sinopse;
    }

    public void setDuracao(int Duracao) {
        this.Duracao = Duracao;
    }

    public void setItens(ArrayList<Item> Itens) {
        this.Itens = Itens;
    }

    public void setAtores(ArrayList<Ator> Atores) {
        this.Atores = Atores;
    }
    
    public void cadastrarFilme(Filme filme) throws ExceptionDAO, SQLException
    {
        new FilmeDAO().CadastraFilme(filme);
        
    }
    
}
