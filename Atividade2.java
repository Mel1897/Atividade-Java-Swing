/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;
import javax.swing.*;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Atividade2 {

    public static void main(String[] args) {
        // Cálculo das médias
        double media1 = (8 + 9 + 7) / 3.0;
        double media2 = (4 + 5 + 6) / 3.0;
        double somaDasMedias = media1 + media2;
        double mediaDasMedias = somaDasMedias / 2;

        // Exibição dos resultados
        JOptionPane.showMessageDialog(null,
                "Média 1: " + media1 + "\nMédia 2: " + media2 +
                        "\nSoma das médias: " + somaDasMedias +
                        "\nMédia das médias: " + mediaDasMedias);
    }
}
