/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quadras;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.silva
 */
public class Quadra {
    private String nome;
    private String tipoDaQuadra;
    private int valorMinuto;
    
    public void cadastrarQuadra(){
        this.nome = JOptionPane.showInputDialog("Qual o nome da Quadra?");
        this.tipoDaQuadra = JOptionPane.showInputDialog("Qual o tipo da Quadra?");
        this.valorMinuto = Integer.parseInt(JOptionPane.showInputDialog("Valor por Minuto da Quadra:"));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDaQuadra() {
        return tipoDaQuadra;
    }

    public void setTipoDaQuadra(String tipoDaQuadra) {
        this.tipoDaQuadra = tipoDaQuadra;
    }

    public int getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(int valorMinuto) {
        this.valorMinuto = valorMinuto;
    }

    
}
