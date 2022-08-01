package school.mjc.stage0.loops.task5;

import java.util.Scanner;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int a = cathetusLength;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j<=i){
                    System.out.print("8");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        new Triangle().printTriangle(a);
    }
}
