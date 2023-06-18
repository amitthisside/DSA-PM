//https://leetcode.com/problems/set-mismatch/

static int[] findErrorNums(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[i] != a[correct])
                swap(a,i,correct);
            else
                i++;
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] != j + 1)
                return new int[]{a[j], j + 1};
        }

        return new int[] {-1, -1};
    }
