package lessons;

import java.util.Arrays;

public class Lesson10 {
    public static int[] returnPeakElementArray(int[] arr) {

        int[] result = new int[]{};

        if (arr.length != 0 || arr != null) {

            int countArray = 0;

            if (arr[0] > arr[1]) {
                countArray++;
            }
            if (arr[arr.length - 1] > arr[arr.length - 2]) {
                countArray++;
            }

            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    countArray++;
                }
            }
            System.out.println(countArray);

            result = new int[countArray];
            countArray = 0;
            if (arr[0] > arr[1]) {
                result[0] = arr[0];
                countArray++;
            }
            if (arr[arr.length - 1] > arr[arr.length - 2]) {
                result[result.length - 1] = arr[arr.length - 1];
            }

            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    result[countArray] = arr[i];
                    countArray++;
                }
            }

        }
        return result;
    }


    public static void main(String[] args) {

//        {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        int[] arr = {7, 3, 3, 3, 3, 3, 3, 6};

        System.out.println(Arrays.toString(returnPeakElementArray(arr)));

    }
}
