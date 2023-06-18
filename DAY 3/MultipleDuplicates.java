//https://leetcode.com/problems/find-all-duplicates-in-an-array/

public static List<Integer>  multipleDuplicates(int[] a) {
        List<Integer> ls=new ArrayList<Integer>();
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[i] != a[correct])
                swap(a,i,correct);
            else
                i++;
        }

        for (int index = 0; index < a.length; index++) {
            if (a[index] != index + 1)
                ls.add(a[index]);
        }
        return ls;
    }
