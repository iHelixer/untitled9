//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = (int)(Math.random()*41-20);
        System.out.println("Випадкове число = " + a);

        System.out.println();

        double b = 3;
        double c = 4;
        double d = Math.sqrt(b*b+c*c);
        double s = 0.5*b*c;
        double sum = b+c+d;
        System.out.println("Площа трикутника = " + s);
        System.out.println("Периметр трикутника = " + sum);

        System.out.println();

    }
}