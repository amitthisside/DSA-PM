public static int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();

        for (int num : nums) {
            hs.add(num);
        }

        int longestStreak = 0;

        for (int num : hs) {
            if (!hs.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;

                while (hs.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }

                longestStreak = Math.max(currStreak, longestStreak);
            }
        }

        return longestStreak;
    }

    public static int longestConsecutive2(int[] nums) {
        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                if (nums[i] == nums[i-1]+1) {
                    currentStreak += 1;
                }
                else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        return Math.max(longestStreak, currentStreak);
    }
