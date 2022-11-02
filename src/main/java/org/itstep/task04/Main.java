package org.itstep.task04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws SortArrayException {
        // TODO: проверяйте ваш код здесь
        int[] arr = {1, 8, 5, 6, 3, 9};

        // Закоментувати наступний рядок для перевірки викиду SortArrayException у методуі searchArray
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        searchArray(arr, 8);
    }

    public static void searchArray(int[] arr, int search) throws SortArrayException {
        if (!isSorted(arr)) throw new SortArrayException("Array is not sorted");
        System.out.println("Search index of: " + search + " is: " + Arrays.binarySearch(arr, search));

//       Перший варіант коду з власною реалізацією
//        int left = 0;
//        int right = arr.length - 1;
//        int mid;
//        int found = -1;
//
//        do {
//            mid = (left + right) / 2;
//            if (arr[mid] == search) {
//                found = arr[mid];
//                break;
//            } else if (arr[mid] < search) {
//                left = mid;
//            } else {
//                right = mid;
//            }
//        } while (true);
//        System.out.println("arr[" + mid + "] = " + found);
    }

    public static boolean isSorted(int[] a) {
        if (a == null || a.length <= 1) {
            return true;
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
