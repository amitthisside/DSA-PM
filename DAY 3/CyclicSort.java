static void sort(int[] arr) {
        int n = arr.length;

        int i = 0;
        while (i < n) {
            int correct_idx = arr[i] - 1;
            if (arr[i] != arr[correct_idx])
                swap(arr, i, correct_idx);
            else
                i++;
        }
    }
