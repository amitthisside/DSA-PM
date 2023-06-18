public static int floor(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int floor = -1;

        while (s <= e) {
            int m = (s + e) / 2;

            if (arr[m] == target)
                return m;
            else if(arr[m] < target) {
                s = m + 1;
                floor = m;
            }

            else
                e = m - 1;
        }
        return floor;
    }
