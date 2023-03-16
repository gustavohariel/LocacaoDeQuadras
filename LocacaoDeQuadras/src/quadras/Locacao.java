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
public class Locacao {
    
    private Locatario Locatario = new Locatario();
    private Quadra Quadra = new Quadra();
    private int tempoMinuto;
    private char necessitaEquipamento;

    public double calcularLocacao(){
        
        double calc;
        
        calc = tempoMinuto * Quadra.getValorMinuto();
        
        if (calc > 120){
            calc = calc - calc * 0.1;
        }
        
        if(necessitaEquipamento == 'S'){
            calc = calc + 50;
        }
        
        return calc;

    }
    
    public void mostrarResumoLocacao(){
        
        StringBuilder mensagem = new StringBuilder();

        mensagem.append("Locatário").append("\n");
        mensagem.append("Nome: ").append(Locatario.getNome()).append("\n");
        mensagem.append("CPF: ").append(Locatario.getCpf()).append("\n");
        mensagem.append("Telefone: ").append(Locatario.getTelefone()).append("\n");
        mensagem.append("Ano de Nascimento: ").append(Locatario.getAnoNascimento()).append("\n");
        mensagem.append("Quadra").append("\n");
        mensagem.append("Nome da Quadra: ").append(Quadra.getNome()).append("\n");
        mensagem.append("Locação").append("\n");
        mensagem.append("Tempo em Minutos: ").append(this.tempoMinuto).append("\n");
        mensagem.append("Necessita Equipamento: ").append(this.necessitaEquipamento).append("\n");
        mensagem.append("Valor Calculado: ").append(calcularLocacao()).append("\n");
        JOptionPane.showMessageDialog(null, mensagem);
        
        
    }
    
    public void cadastrarLocacao(){

        
        Locatario.cadastrarLocatario();
        
        
        if(Locatario.verificarMaioridade()){
                
            Quadra.cadastrarQuadra();
        
            tempoMinuto = Integer.parseInt(JOptionPane.showInputDialog("Quanto tempo de Locação?"));
        
            necessitaEquipamento = JOptionPane.showInputDialog("Necessita Equipamento? S - sim / N - não ").charAt(0);
        
            mostrarResumoLocacao();
        }else{
            JOptionPane.showMessageDialog(null, "Necessário ser maior de 18 anos para Locar uma Quadra!");
        }
        
        
    }

    public int getTempoMinuto() {
        return tempoMinuto;
    }

    public void setTempoMinuto(int tempoMinuto) {
        this.tempoMinuto = tempoMinuto;
    }

    public char getNecessitaEquipamento() {
        return necessitaEquipamento;
    }

    public void setNecessitaEquipamento(char necessitaEquipamento) {
        this.necessitaEquipamento = necessitaEquipamento;
    }

    public Locatario getLocatario() {
        return Locatario;
    }

    public void setLocatario(Locatario Locatario) {
        this.Locatario = Locatario;
    }

    public Quadra getQuadra() {
        return Quadra;
    }

    public void setQuadra(Quadra Quadra) {
        this.Quadra = Quadra;
    }
    
    
    
    
    
}
