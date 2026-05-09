package algo;


//Le fonctionnement de l'algorithme du tri fusion consiste à :
//  I - diviser la liste en deux parts égales ;
// II - trier chacune des deux parts ;
// III - fusionner les deux parts triées. 
// D'apres le cours fabuleux de monsieur Zanotti : 
// https://zanotti.univ-tln.fr/ALGO/II/TriFusion.html


//Exercice 1 : Écrivez un algorithme Copier(X,i,Y,j,n) 
// qui copie n valeurs consécutives du tableau X en partant 
// de i dans le tableau à partir de j. 
// Faites la preuve de justesse et la preuve d'arrêt. 

public class Copier {
    public void copy(int[] X, int i, int[] Y, int j, int n) {
            for (int k = 0; k < n; k++) {
                Y(j+k)=X(i+k);
            }
    }
}

public class Fusionner{
    public void merge(int[] L, int p, int q, int r) {
        int ng = q-p+1;
        int nd = r-q;

        int[] L = new int[n1];
        int[] R = new int[n2];

        

    }

}



public class FusionSort implements Sorter{

}
