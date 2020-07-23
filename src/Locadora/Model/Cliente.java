
package Locadora.Model;

import Locadora.DAO.ClienteDAO;
import Locadora.DAO.ExceptionDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Cliente 
{
    private int ID_Cliente;
    private String Nome;
    private String CPF;
    private String Email;
    private String Endereco;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private Date Nascimento;
    private ArrayList<Item> Itens = new ArrayList<Item>();
    
    public Cliente(){};
    
    public Cliente(String Nome, String CPF, String Email, String Endereco, String Bairro, String Cidade, String Estado, Date Nascimento)
    {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Email = Email;
        this.Endereco = Endereco;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Nascimento = Nascimento;
    }
 
    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setNascimento(Date Nascimento) {
        this.Nascimento = Nascimento;
    }

    public void setItens(ArrayList<Item> Itens) {
        this.Itens = Itens;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public String getNome() {
        return Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return Email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public ArrayList<Item> getItens() {
        return Itens;
    }
    
    public void CadastraCliente(Cliente cliente) throws SQLException,ExceptionDAO
    {
        new ClienteDAO().CadastraCliente(cliente);//Chamo o método CadastraCliente da classe DAO que efetivamente vai executar a conexão com o banco de dados
    }
    
}
