/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1;
import javax.swing.*;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Atividade1 {

    public static void main(String[] args) {
         // Entrada dos dados
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite os anos:"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Digite os meses:"));
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite os dias:"));

        // Cálculo da idade em dias (1 ano = 365 dias, 1 mês = 30 dias)
        int totalDias = (anos * 365) + (meses * 30) + dias;

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "Idade em dias: " + totalDias);
    }
}
