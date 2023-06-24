public static void main(String[] args) {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
        System.out.println("Original Stack : ");
        System.out.println(input);

        System.out.println("Ascending sorted stack : ");
        System.out.println(sort(input, true));

        System.out.println("Descending sorted stack : ");
        System.out.println(sort(input, false));
    }

    public static Stack<Integer> sort(Stack<Integer> input, boolean isAsc) {
        Stack<Integer> tmpStk = new Stack<>();
        while (!input.isEmpty()) {
            int temp = input.pop();
            while (!tmpStk.isEmpty() && tmpStk.peek() < temp)
                input.push(tmpStk.pop());
            tmpStk.push(temp);
        }
        if (isAsc)
            return tmpStk;
        reverse(tmpStk);
        return tmpStk;
    }

    public static void reverse(Stack<Integer> stk) {
        if (stk.size() > 0) {
            int temp = stk.peek();
            stk.pop();
            reverse(stk);

            insertAtBottom(stk, temp);
        }
    }

    public static void insertAtBottom(Stack<Integer> stk, int x) {
        if (stk.isEmpty())
            stk.push(x);
        else {
            int a = stk.peek();
            stk.pop();
            insertAtBottom(stk, x);

            stk.push(a);
        }
    }
