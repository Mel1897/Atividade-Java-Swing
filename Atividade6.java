/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade6;
import javax.swing.*;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Atividade6 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        JOptionPane.showMessageDialog(null,
                "Antecessor: " + antecessor + "\nSucessor: " + sucessor);
    }
}
