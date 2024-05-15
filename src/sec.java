import java.util.Scanner;

public class sec {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 3) + 1;
        int b = (int) (Math.random() * 3) + 1;
        int c = (int) (Math.random() * 3) + 1;
        Scanner sc = new Scanner(System.in);
        int j = 2;
        System.out.println("Комп'ютер загадав три числа в проміжку [1;3], спробуй відгадати за " + j + " спроби");
        for (int attempt = 1; attempt <= 2; attempt++) {
            System.out.println("Спроба " + attempt + ":");
            System.out.println("Введіть перше число : ");
            if (sc.hasNextInt()) {
                int n1 = sc.nextInt();
                System.out.println("Введіть друге число : ");
                if (sc.hasNextInt()) {
                    int n2 = sc.nextInt();
                    System.out.println("Введіть третє число : ");
                    if (sc.hasNextInt()) {
                        int n3 = sc.nextInt();
                        if (a == n1 && b == n2 && c == n3) {
                            System.out.println("Ви вгадали всі числа!");
                            break;
                        } else {
                            System.out.println("Неправильно! Спробуйте ще!");
                        }
                    } else {
                        System.out.println("Ви ввели не число!");
                    }
                } else {
                    System.out.println("Ви ввели не число!");
                }
            } else {
                System.out.println("Ви ввели не число!");
            }
        }
        sc.close();
    }
}
