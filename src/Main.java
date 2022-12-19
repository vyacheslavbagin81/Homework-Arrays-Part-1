import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    public static void task1() {
        System.out.println("Задача №1");
        int[] arrayNumber1 = new int[3];
        for (int i = 0; i < arrayNumber1.length; i++) {
            arrayNumber1[i] = i + 1;
        }
        double[] arrayNumber2 = {1.57, 7.654, 9.986};
        String[] arrayNumber3 = {"Миша", "Маша", "Петя", "Ваня"};
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача №2");
        int[] arrays1 = new int[3];
        for (int i = 0; i < arrays1.length; i++) {
            arrays1[i] = i + 1;
        }
        for (int i = 0; i < arrays1.length; i++) {
            if (i == arrays1.length - 1) {
                System.out.print(arrays1[i]);
                break;
            }
            System.out.print(arrays1[i] + ", ");
        }
        System.out.println();
        double[] arrayNumber2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arrayNumber2.length; i++) {
            if (i == arrayNumber2.length - 1) {
                System.out.print(arrayNumber2[i]);
                break;
            }
            System.out.print(arrayNumber2[i] + ", ");
        }
        System.out.println();
        String[] arrayNumber3 = {"Миша", "Маша", "Петя", "Ваня"};
        for (int i = 0; i < arrayNumber3.length; i++) {
            if (i == arrayNumber3.length - 1) {
                System.out.print(arrayNumber3[i]);
                break;
            }
            System.out.print(arrayNumber3[i] + ", ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача №3");
        int[] arrayNumber1 = new int[3];
        for (int i = 0; i < arrayNumber1.length; i++) {
            arrayNumber1[i] = i + 1;
        }
        for (int i = arrayNumber1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayNumber1[i]);
                break;
            }
            System.out.print(arrayNumber1[i] + ", ");
        }
        System.out.println();
        double[] arrayNumber2 = {1.57, 7.654, 9.986};
        for (int i = arrayNumber2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayNumber2[i]);
                break;
            }
            System.out.print(arrayNumber2[i] + ", ");
        }
        System.out.println();
        String[] arrayNumber3 = {"Миша", "Маша", "Петя", "Ваня"};
        for (int i = arrayNumber3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayNumber3[i]);
                break;
            }
            System.out.print(arrayNumber3[i] + ", ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача №4");
        int[] arrayNumber1 = new int[3];
        for (int i = 0; i < arrayNumber1.length; i++) {
            arrayNumber1[i] = i + 1;
        }
        for (int i = 0; i < arrayNumber1.length; i++) {
            if (arrayNumber1[i] % 2 != 0) {
                arrayNumber1[i]++;
            }
        }
        System.out.println(Arrays.toString(arrayNumber1));
    }
}