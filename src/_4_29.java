class _4_29 {
    int[] arr;
    private int point; //외부에서 건들지 못함

    _4_29(){
        arr = new int[100];
        point = 0;
    }
    void push(int n){
        arr[point] = n;
        point ++;
    }
    int pop(){
        return arr[point--];
    }
    //void
}
