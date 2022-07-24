package dynamicprog;

public class FiboTD {
    static int[] F = new int[50]; //array to store fibonacci terms

    public static void initF() {
        for(int i=0; i<50; i++) {
            F[i] = -1;
        }
    }

    public static int dynamicFibonacci(int n) {
        if (F[n] < 0) {
            if (n==0) {
                F[n] = 0;
            }
            else if (n == 1) {
                F[n] = 1;
            }
            else {
                F[n] = dynamicFibonacci(n-1) + dynamicFibonacci(n-2);
            }
        }
        return F[n];
    }

    public static void main(String[] args) {
        initF();
        System.out.println(dynamicFibonacci(46));
    }
}
