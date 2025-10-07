import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci: " + a);
        while(b <= n) {
            System.out.print(", " + b);
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println();
        sc.close();
    }
}
