public static void reverse() {
        if (stk.size() > 0) {
            int temp = stk.peek();
            stk.pop();
            reverse();

            insertAtBottom(temp);
        }
    }

    public static void insertAtBottom(int x) {
        if (stk.isEmpty())
            stk.push(x);
        else {
            int a = stk.peek();
            stk.pop();
            insertAtBottom(x);

            stk.push(a);
        }
    }
