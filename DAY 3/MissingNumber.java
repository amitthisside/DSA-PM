//https://leetcode.com/problems/missing-number/

static int find(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]])
                swap(arr, i, arr[i]);
            else
                i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j)
                return j;
        }

        //{0, 3, 2, 1}
        return arr.length;
    }
