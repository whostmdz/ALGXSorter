package algo;

public class InsertionSort implements Sorter{
    @Override
    public void sort(int[] tab){
        for(int j=1; j<tab.length;j++){
            int key = tab[j];
            int i = j-1;
            while(i>=0 && tab[i]>key){
                tab[i+1] = tab[i];
                i=i-1;
            }
            tab[i+1]=key;
        }
    }

    @Override
    public String nameAlgo(){
        return "Insertion sort";
    }
}