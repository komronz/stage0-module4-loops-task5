package school.mjc.stage0.loops.task5;

import java.util.Scanner;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++){
                if(i==0||j==0||i==height-1||j==length-1)
                    System.out.print("8");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        new Rectangle().printRectangleFrom8s(a,b);
    }
}
