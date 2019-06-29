import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // 1. for

        for (int i = 100; i > 0; i = i - 10) {
            System.out.println(i);
        }

        // 2. while do

        int a = 100;
        while (a < 100) {
            System.out.println(a);
            a++;
        }

        // 3. do while
        int b = 100;
        do {
            System.out.println(b);
            b++;
        } while (a < 100);


        // Вложенные цыклы

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print("x ");
                } else
                    System.out.print(j + " ");
            }
            System.out.println();
        }

//region Квадрат

        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || i == 9) {
                    System.out.print("0 ");
                } else if (j == 0 || j == 9) {
                    System.out.print("0 ");
                } else
                    System.out.print(j + " ");
            }
            System.out.println();
        }

//endregion

//region Квадрат2

        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || (i == 2 && (j > 1 && j < 8)) || (i == 7 && (j > 1 && j < 8)) || i == 9) {
                    System.out.print("0 ");
                } else if (j == 0 || (j == 2 && (i > 1 && i < 8)) || (j == 7 && (i > 1 && i < 8)) || j == 9) {
                    System.out.print("0 ");
                } else
                    System.out.print("* ");
            }
            System.out.println();
        }

//endregion

//region Квадрат3

        System.out.println();

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (i == 0 || (i == 2 && (j > 1 && j < 98)) || (i == 97 && (j > 1 && j < 98)) || i == 99) {
                    System.out.print("0 ");
                } else if (j == 0 || (j == 2 && (i > 1 && i < 98)) || (j == 97 && (i > 1 && i < 98)) || j == 99) {
                    System.out.print("0 ");
                } else
                    System.out.print("* ");
            }
            System.out.println();
        }

//endregion


/*        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                    System.out.print(j + " ");
            }
            System.out.println();
        }*/


  /*      Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
        in.close();
   */


        //region Массивы

/*        int ten = 10;
        int twenty = 20;
        int thirty = 30;
        int forty = 40;
        int fifty = 50;

        System.out.println(ten);
        System.out.println(twenty);
        System.out.println(thirty);
        System.out.println(forty);
        System.out.println(fifty);*/


        System.out.println();

//        int massiv[];
//        massiv = new int[5];
//        massiv[0] = 10;
//        massiv[1] = 20;
//        massiv[2] = 30;
//        massiv[3] = 40;
//        massiv[4] = 50;

//        System.out.println(massiv[3]);

//        massiv[3] = 100;

//        System.out.println(massiv[3]);


        int massiv[] = new int[] {0, -2, 30, 45, 526, 17, 70, 80, 90, -2147483647};

        for(int i = 0; i < 10; i++) {
            System.out.print(massiv[i] + " ");
        }


        int matrix[][] = new int[][] {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println();
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(matrix[1][1]);

        Random random = new Random();
        int bigMatrix[][] = new int[100][100];
        for(int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                bigMatrix[i][j] = random.nextInt(9);
            }
        }

        System.out.println();
        for(int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(bigMatrix[i][j] + " ");
            }
            System.out.println();
        }


        String bigMatrixString[][] = new String[100][100];
        for(int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                bigMatrixString[i][j] = "java";
            }
        }

        System.out.println();
        for(int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(bigMatrixString[i][j] + " ");
            }
            System.out.println();
        }



        //endregion


    }


}
