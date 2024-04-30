class MyStack {
    int[] arr;
    private int point;
    MyStack() {
        arr = new int[100];
        point = 0;
    }

    void push(int n) {
        arr[point] = n;
        point++;
    }

    int pop() {
        point--;
        return arr[point];
    }

    void print() {
        for (int i = 0; i < point; i++) {
            if (point == 0) break;
            System.out.print(arr[i] + " ");
        }
    }
}