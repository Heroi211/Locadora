package Locadora.Model;

import Locadora.DAO.ExceptionDAO;
import Locadora.DAO.ItemDAO;
import java.sql.SQLException;
import java.util.Date;

public class Item
{
    private int ID_Item;
    private double Preco;
    private String Tipo;
    private Date Locacao;
    private Date Devolucao;
    private Filme filme;
    private Cliente cliente;

    public int getID_Item() {
        return ID_Item;
    }

    public double getPreco() {
        return Preco;
    }

    public String getTipo() {
        return Tipo;
    }

    public Date getLocacao() {
        return Locacao;
    }

    public Date getDevolucao() {
        return Devolucao;
    }

    public Filme getFilme() {
        return filme;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setID_Item(int ID_Item) {
        this.ID_Item = ID_Item;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setLocacao(Date Locacao) {
        this.Locacao = Locacao;
    }

    public void setDevolucao(Date Devolucao) {
        this.Devolucao = Devolucao;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void CadastraItem(Item item) throws SQLException,ExceptionDAO
    {
        new ItemDAO().CadastraItem(item);
    }
}
