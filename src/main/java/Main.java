import java.util.Arrays;

public static void main(String[] args) {

    int[] data = {7, 3, 9, 1, 4, 9, 2, 6};
    System.out.println("Before sorting: " + Arrays.toString(data));
    countingSort(data);
    System.out.println("After sorting: " + Arrays.toString(data));

}

private static void countingSort(int[] arr) {
    if (arr.length == 0) return;

    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    int[] count = new int[max + 1];

    for (int i = 0; i < arr.length; i++) {
        count[arr[i]]++;
    }

    int index = 0;
    for (int value = max; value >= 0; value--) {
        while (count[value] > 0) {
            arr[index] = value;
            index++;
            count[value]--;
        }
    }
}
