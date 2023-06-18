static int bs(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1; //n = sizeof(arr) / sizeof(arr[0])

        while (s <= e) {
            int m = (s + e) / 2;

            if (arr[m] == target)
                return m;
            else if(arr[m] < target)
                s = m + 1;
            else
                e = m - 1;
        }
        return -1;

    }
