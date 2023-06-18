static int getPeak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int m = s + (e - s) / 2;

            if (arr[m] < arr[m + 1])
                s = m + 1;
            else
                e = m;
        }
        return s;
        //return e
    }
