package algo;

public class BubbleSort implements Sorter{
        @Override
    public void sort(int[] tab){
        int d = tab.length;
        while d > 0{
            i=0;
            while i < d-1{
                if tab[i] > tab[i+1]{
                    swap(tab, i, i+1);
                }
                i++;
            }
            d--;
        }
    }

        @Override
    public String nameAlgo(){
        return "Bubble sort";
    }
    
}
