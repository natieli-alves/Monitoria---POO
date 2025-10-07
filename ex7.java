import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado = 0;
        switch(op) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': 
                if(num2 != 0) resultado = num1 / num2;
                else System.out.println("Divisão por zero não é permitida.");
                break;
            default: System.out.println("Operação inválida.");
        }

        if(op == '+' || op == '-' || op == '*' || (op == '/' && num2 != 0))
            System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
