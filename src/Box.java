import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        System.out.println("name\tdate");
        int i = 0;
        while (i < 3) {
            i++;
            int plus = 0;
            while (plus < 3) {
                plus++;
                int str = 0;
                while (str < 20) {
                    str++;
                    System.out.print("+");
                }
                System.out.print("\n");
            }

            int a = 0;
            while (a < 2) {
                a++;
                int str = 0;
                while (str < 20) {
                    str++;
                    System.out.print("A");
                }
                System.out.print("\n");
            }
        }
    }
}