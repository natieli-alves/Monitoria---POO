import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];

        for(int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            nums[i] = sc.nextInt();
        }

        int soma = nums[0] + nums[1] + nums[2];
        double media = soma / 3.0;
        System.out.println("Média: " + media);

        int maior = nums[0];
        int menor = nums[0];

        for(int n : nums) {
            if(n % 2 == 0) System.out.println(n + " é par");
            else System.out.println(n + " é ímpar");

            if(n > maior) maior = n;
            if(n < menor) menor = n;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        sc.close();
    }
}
