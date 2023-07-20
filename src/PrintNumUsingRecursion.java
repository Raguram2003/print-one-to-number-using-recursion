import java.util.Scanner;

public class PrintNumUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        doingPrintNumUsingRecursion(N);
    }
    public static int doingPrintNumUsingRecursion(int n)
    {
        if (n == 1) {
            System.out.print(n+" ");
            return n;
        }
        doingPrintNumUsingRecursion(n - 1);
        System.out.print(n+" ");
        return 1;
    }
}
