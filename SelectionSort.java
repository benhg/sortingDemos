import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = { 5, 2, 131, 13, 11, 1 };

        SelectionSort sort = new SelectionSort();

        sort.selectionSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public int[] selectionSort(int[] a) {

        int min;
        for (int out = 0; out < a.length - 1; out++) {
            min = out;
            for (int in = out + 1; in < a.length; in++) {
                if (a[in] < a[min]) {
                    min = in;

                }
            }
            int tempValue = a[out];
            a[out] = a[min];
            a[min] = tempValue;

        }

        return a;

    }

}
