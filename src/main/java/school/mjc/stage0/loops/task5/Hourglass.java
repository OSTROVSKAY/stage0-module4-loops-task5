package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        if (height % 2 != 0) {

            int half = ((height - 1) / 2) + 1;

            for (int i = 1; i <= height; i++) {

                for (int j = 1; j <= height; j++) {

                    if (i < half && (j >= i && j <= (height - i + 1))) {

                        System.out.print("8");

                    } else if (i < half && (j < i || j > (height - i + 1))) {

                        System.out.print(" ");

                    } else if (i == half && i == j) {

                        System.out.print("8");

                    } else if (i == half && i != j) {

                        System.out.print(" ");

                    } else if (i > half && j > (height - i) && j <= i) {

                        System.out.print("8");

                    } else if (i > half && (j <= (height - i) || j > i)) {

                        System.out.print(" ");

                    }

                }

                System.out.println("");

            }

        } else {

            int half = height/2;

            for(int i = 1; i <= height; i++) {

                for(int j = 1; j <= height; j++) {

                    if(i <= half && j >= i && j <= height - i + 1 ) {

                        System.out.print("8");

                    } else if(i <= half && (j < i || j > height - i + 1) ) {

                        System.out.print(" ");

                    } else if( i > half && j > (height - i) && j <= i ) {

                        System.out.print("8");

                    } else if ( i > half && (j > (height - i) || j <= i )) {

                        System.out.print(" ");

                    }

                }

                System.out.println("");

            }

        }

    }
}
