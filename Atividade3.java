/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade3;
import javax.swing.*;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Atividade3 {

    public static void main(String[] args) {
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo:"));

        // Reajuste de 1%
        double saldoReajustado = saldo * 1.01;

        JOptionPane.showMessageDialog(null, "Saldo com reajuste de 1%: R$ " + saldoReajustado);
    }
}
