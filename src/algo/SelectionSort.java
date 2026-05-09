package algo;

public class SelectionSort {
    @Override
    public void sort(int[] tab) {
        int n = tab.length;
        for (int i = 0; i < n - 1; i++) {
            int imin = i;
            
            for (int j = i + 1; j < n; j++) {
                if (tab[j] < tab[imin]) {
                    imin = j;
                }
            }
            if (imin != i) {
                swap(tab, i, imin);
            }
        }
    }

    private void swap(int[] tab, int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }

    @Override
    public String nameAlgo(){
        return "Selection sort";
    }
}
