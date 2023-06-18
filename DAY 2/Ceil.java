public static int ceiling(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ceil = -1;

        while (s <= e) {
            int m = (s + e) / 2;

            if (arr[m] == target)
                return m;
            else if(arr[m] > target) {
                e = m - 1;
                ceil = m;
            }

            else
                s = m + 1;
        }
        return ceil;
    }
