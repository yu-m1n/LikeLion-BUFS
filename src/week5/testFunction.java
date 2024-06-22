package week5;

public class testFunction {
    static int sum(int a, int b){
        return a+b;
    }
    static int min(int a, int b){
        return a - b;
    }
    static int mul(int a, int b){
        return a * b;
    }
    static float sub(float a, float b){
        return a / b;
    }
    public static void main(String[] args) {
        int n = 10;
        int m = 20;

        int sum = sum(n, m);
        System.out.println(sum);
        int min = min(n, m);
        System.out.println(min);

        int mul = mul(n, m);            // 이렇게 두 문장으로 표현하는것과
        System.out.println(mul);

        System.out.println(sub(n, m)); // 이렇게 한 문장으로 표현하는 것이 동일
    }
}
