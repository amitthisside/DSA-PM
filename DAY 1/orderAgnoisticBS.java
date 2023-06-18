static int orderAgnoisticBs(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        boolean isAsc = arr[s] < arr[e];

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target)
                return m;
            if (isAsc) {
                if (arr[m] < target)
                    s = m + 1;
                else
                    e = m - 1;
            }
            else {
                if (arr[m] > target)
                    s = m + 1;
                else
                    e = m - 1;
            }
        }
        return -1;
    }
