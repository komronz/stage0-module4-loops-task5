package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength %2== 0){
            System.out.println(0);
        }
        else {
            for (int i = 0; i < sideLength; i++) {
                if(i!=sideLength/2 ) {
                    for (int j = 0; j < sideLength/2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("8");
                }
                else {
                for(int c = 0; c < sideLength; c++){
                    System.out.print("8");
                }
                }
                System.out.println();
            }
        }
    }
}
