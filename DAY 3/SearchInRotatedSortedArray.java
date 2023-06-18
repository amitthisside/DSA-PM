static int search(int[] arr, int target) {
        int firstTry = bs(arr, target, 0, getPivot(arr));
        if (firstTry != -1)
            return firstTry;
        return bs(arr, target, getPivot(arr) + 1, arr.length - 1);
    }

    static int bs(int[] arr, int target, int s, int e) {

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

    static int getPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m < e && arr[m] > arr[m + 1])
                return m;
            if (m > s && arr[m] < arr[m - 1])
                return m - 1;
            if (arr[m] <= arr[s])
                e = m - 1;
            else
                s = m + 1;
        }

        return -1;
    }
