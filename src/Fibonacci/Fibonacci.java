package Fibonacci;

public class Fibonacci {
    private static int findFibonacciNumber (int n) {
        if (n <= 1) {
            return n;
        }
        int previousFibonacci = 0;
        int currentFibonacci = 1;
        for (int i = 2; i <= n ; i++) {
            int nextFibonacci = previousFibonacci + currentFibonacci;
            previousFibonacci = currentFibonacci;
            currentFibonacci = nextFibonacci;
        }
        return currentFibonacci;
    }

    public static void main(String[] args) {
//        Nhập số thứ N vào trong dãy
        int n = 20;
        int Fib = findFibonacciNumber(n);
        System.out.println("Số thứ " + n + " trong dãy Fibonnacci = " + Fib);
    }
}
