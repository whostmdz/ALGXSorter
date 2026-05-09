package main;
import algo.*;
import ui.*;

import javax.swing.JFrame;

import java.util.Arrays;

public class MainAlgo {
    public static void main(String[] args){
        int list[]= {1,5,3,8,23,6,2,};
        Sorter mySort = new InsertionSort();
        System.out.println("Algo used is : "+ mySort.nameAlgo());
        mySort.sort(list);
        
        System.out.println(Arrays.toString(list));
        
        // 1. Créer la fenêtre
        JFrame frame = new JFrame("Mon Visualiseur de Tri");

        // 2. Comportement à la fermeture (IMPORTANT)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // 3. Définir la taille (ex: 800 pixels de large, 600 de haut)
     // À TOI DE CODER : utilise la méthode frame.setSize(largeur, hauteur);
        frame.setSize(100,100);

     // 4. Instancier ton VisualizerPanel et l'ajouter à la fenêtre
     // À TOI DE CODER : 
     // VisualizerPanel panel = new VisualizerPanel();
     // frame.add(panel);
        VisualizerPanel panel = new VisualizerPanel();

     // 5. Rendre la fenêtre visible (TOUJOURS EN DERNIER)
     // À TOI DE CODER : utilise la méthode frame.setVisible(true);
        frame.setVisible(true);
    }
}
