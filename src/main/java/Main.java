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
                if(i == j) {
                    System.out.print("x ");
                } else
                    System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i == 0 || i == 9) {
                    System.out.print("0 ");
                } else if(j != 9) {
                    System.out.print(j + " ");
                } else
                    System.out.print("0 ");
            }
            System.out.println();
        }

    }
}
