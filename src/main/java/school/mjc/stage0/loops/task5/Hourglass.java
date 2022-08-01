package school.mjc.stage0.loops.task5;

import java.util.Scanner;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height>0){
            for (int i = 0; i < height; i++) {
                if (i< height/2){
                    for (int j = 0; j < height; j++) {
                        if (j>=i && j <= height-(i+1)){
                            System.out.print("8");
                        }
                        else System.out.print(" ");
                    }
                }
                //half
                else {
                    for (int j = height; j > 0; j--) {
                        if (j<=i+1 && j > height-(i+1)){
                            System.out.print("8");
                        }
                        else System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        new Hourglass().printHourglassOfGivenSize(a);
    }
}
