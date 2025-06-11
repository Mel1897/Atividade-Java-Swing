/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade5;
import javax.swing.*;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Atividade5 {

    public static void main(String[] args) {
        double salarioMin = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário mínimo:"));
        double salarioUsuario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do usuário:"));

        double quantidade = salarioUsuario / salarioMin;

        JOptionPane.showMessageDialog(null, "O usuário ganha " + quantidade + " salários mínimos.");
    }
}
