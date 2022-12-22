import java.util.Scanner;

public class Calculyator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scanner.nextInt();
        System.out.println("Введите операцию");
        char operator = scanner.next().charAt(0);
        System.out.println("Введите число");
        int y = scanner.nextInt();
        System.out.println("Введите операцию");
        char operator1 = scanner.next().charAt(0);
        System.out.println("Введите число");
        int z = scanner.nextInt();
        int ans;
        switch (operator) {
            case '+':
                ans = x + y;
                break;
            case '-':
                ans = x - y;
                break;
            case '*':
                ans = x * y;
                break;
            case '/':
                ans = x / y;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        int result;
        switch (operator1) {
            case '+':
                result = ans + z;
                break;
            case '-':
                result = ans - z;
                break;
            case '*':
                result = ans * z;
                break;
            case '/':
                result = ans / z;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + operator1);

        }
        System.out.println(result);
    }

}


