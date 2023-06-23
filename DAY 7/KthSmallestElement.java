public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] mat : matrix)
            for(int m : mat)
                pq.offer(m);
        while(--k != 0)
            pq.poll();
        return pq.peek();
    }
