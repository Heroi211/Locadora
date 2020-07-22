package Locadora.Controller;

import Locadora.DAO.ExceptionDAO;
import Locadora.Model.Cliente;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gabriel
 */

public class ClienteController 
{
    public boolean CadastraCliente(String Nome, String CPF, String Email, String Endereco, String Bairro, String Cidade, String Estado, String Nascimento) throws ParseException, SQLException, ExceptionDAO 
    {
        if(Nome != null && Nome.length()>0 && validarCPF(CPF) && Email != null & Email.length() > 0 &&
           Endereco != null && Endereco.length() > 0 && Bairro != null && Bairro.length() > 0 &&
           Cidade != null && Cidade.length() > 0 && Estado != null && Estado.length() > 0 &&
                validarData(Nascimento))
        {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(Nascimento);
            Cliente cliente = new Cliente(Nome,CPF,Email,Endereco,Bairro,Cidade,Estado,data);
            cliente.CadastraCliente(cliente);
            return true;
            
        }
        return false;
        
    }
    
    public boolean validarCPF(String CPF)
    {
        for (int i = 0 ; i < CPF.length(); i++)
        {
            if (!Character.isDigit(CPF.charAt(i)))
            {
                if(!(i==3||i==7||i==11))
                {
                    return false;
                }    
            }
        }
        
        return true;
    }
        
   
    public boolean validarData(String Data)
    {
        for (int i = 0 ; i < Data.length(); i++)
        {
            if (!Character.isDigit(Data.charAt(i)))
            {
                if(!(i==2||i==5))
                {
                    return false;
                }    
            }
        }
        
        return true;
    }
}

      
  
