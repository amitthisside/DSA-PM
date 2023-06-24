public static Stack<Integer> sort(Stack<Integer> input) {
        Stack<Integer> tmpStk = new Stack<>();
        while (!input.isEmpty()) {
            int temp = input.pop();
            while (!tmpStk.isEmpty() && tmpStk.peek() < temp)
                input.push(tmpStk.pop());
            tmpStk.push(temp);
        }
        return tmpStk;
    }
