/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade4;
import javax.swing.*;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Atividade4 {

    public static void main(String[] args) {
        // Entradas
        double ipi = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do IPI (%):"));
        int cod1 = Integer.parseInt(JOptionPane.showInputDialog("Código da peça 1:"));
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor unitário da peça 1:"));
        int quant1 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade da peça 1:"));

        int cod2 = Integer.parseInt(JOptionPane.showInputDialog("Código da peça 2:"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor unitário da peça 2:"));
        int quant2 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade da peça 2:"));

        // Cálculo do valor total
        double total = (valor1 * quant1 + valor2 * quant2) * (1 + ipi / 100);

        JOptionPane.showMessageDialog(null, "Valor total a pagar com IPI: R$ " + total);
    }
}
