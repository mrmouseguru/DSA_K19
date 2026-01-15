package dsa_k19.sorting;

/**
 *
 * @author phuoc
 */
public class DemoBubbleSort {
    public static void main(String[] args) {
        int a[] = {50, 25, 5, 20, 10};
        bubbleSort(a);
        for(int i = 0; i < a.length; i++)
        {
             System.out.print(" " + a[i]);
        }
    }
    static void bubbleSort(int a[]) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

}

