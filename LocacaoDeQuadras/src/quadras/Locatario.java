/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quadras;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.silva
 */
public class Locatario {
    
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;

    public boolean verificarMaioridade(){
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return (anoAtual - anoNascimento) >= 18;
        
    }
    
    public void cadastrarLocatario(){  
        this.nome = JOptionPane.showInputDialog("Qual o nome do Locatário?");
        this.cpf = JOptionPane.showInputDialog("Qual o CPF do Locatário?");
        this.telefone = JOptionPane.showInputDialog("Qual o telefone do Locatário?");
        this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Qual o Ano de Nascimento do Locatário?"));   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    
    
    
}
