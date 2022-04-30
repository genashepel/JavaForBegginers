package homework6;

/*
Распечатать последовательность чисел от 0 до 9 включительно.
Распечатать последовательность чисел от 10 исключительно до 0 включительно.
Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
Распечатать последовательность четных чисел от 215 до 237 включительно
Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
Распечатать последовательность которая начинается с минимального значения типа
данных short и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
Числа, кратные 11, должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом.
А ноль необходимо распечатать словом ZERO.
Написать метод, который принимает на вход параметры start,  end, step, и
печатает последовательность десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.

 */

public class HW6 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static int numberOfTask = 0;



    public static void taskLine() {
        String taskLeftLine = "\n***************  Task - ";
        String taskRightLine = " ******************\n";
        String line = "+_______________________________+";
        System.out.println(taskLeftLine + (++numberOfTask) + taskRightLine);
    }

    public static void getStartEndStep(double start, double end, double step) {

        //increasing start < end, step >0
        //decreasing start > end, step < 0

        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(start);
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.println(start);
            }
        } else {
            System.out.println("Invalid date");
        }

    }

    public static void printNumberTask11(int number) {

        for (int i = 0; i < number * 2; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printPowTask12(int n) {
        if (n < 1) {
            n = 1;
        }
        if (Math.pow(2, n) > Integer.MAX_VALUE) {
            System.out.println("This volume is too large");
        }

        for (int i = 1; i <= n; i++) {
            System.out.println((int) Math.pow(2, i));
            //System.out.println((double)Math.pow(2, i));
        }
    }

    public static void printTask16(int n, int m, int l) {
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.println("Vse chisla chetnie, nachnite s drugogo chisla, ili izmenite shag");
        } else {
            while (l > 0) {
                if (n % 2 != 0) {
                    System.out.print(n + " ");
                    l--;
                }
                n = n + m;
            }
        }
    }

    public static void printTask17(int n, int l) {

        int indexN = n;

        while (l > 0) {

            indexN = indexN + 1;
            n = indexN + 2;
            System.out.println(indexN + " ----->  " + n + " ");
            l--;
        }
    }

    public static void printTask18(int n, int l) {

        int indexN = n;
        System.out.println(indexN + " ----->  " + n + " ");
        while (l > 0) {
            n = 2 * indexN;
            indexN = indexN + 1;
            System.out.println(indexN + " ----->  " + n + " ");
            l--;
        }
    }

    public static void printTask19() {
        int a = 0;
        int b = 0;

        for (int i = 10; i <= 99; i++) {
            a = i / 10;
            b = i % 10;
            if (Math.abs(a - b) <= 3) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        //Task_1
        taskLine();

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");

        }
        System.out.println("\n");
        //Task_2
        taskLine();

        for (int i = 9; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        //Task_3
        taskLine();

        for (int i = 50; i <= 55; i = i + 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        //Task_4
        taskLine();

        for (int i = 326; i > 300; i = i - 1) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
        //Task_5
        taskLine();

        for (double i = 12; i < 13; i = i + 0.1) {

            System.out.printf("%.1f ", i);
        }

        System.out.println("\n");


        //Task_6
        taskLine();

        for (int i = 215 + 1; i <= 237; i += 2) {

            System.out.print(i + " ");
        }

        System.out.println("\n");

        //Task_7
        taskLine();

        for (int i = 7 + 1; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println("\n");

        //Task_8
        taskLine();

        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {

            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");


        //Task_9
        taskLine();

        for (int i = -10; i <= 34; i++) {
            if (i == 0) {
                System.out.print(" ZERO ");
            } else if (i % 11 == 0) {
                System.out.print(ANSI_BLUE + i + " " + ANSI_RESET);
            } else if (i % 12 == 0) {
                System.out.print(ANSI_RED + i + " " + ANSI_RESET);
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");


        //Task_10
        taskLine();

        getStartEndStep(30, 80, 0.2);

        System.out.println("\n");


        //Part 2 ____________________________________________


        //Task_11
        taskLine();

        printNumberTask11(10);

        System.out.println("\n");


        //Task_12
        taskLine();

        printPowTask12(45);

        System.out.println("\n");


        //Task_13
        taskLine();

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= 9; j++) {
                //String number = String.valueOf(j);
                //System.out.print(number.repeat(i));
                System.out.print(String.valueOf(j).repeat(i));
            }
        }

        System.out.println("\n");


        //Task_14
        taskLine();

        for (int i = 0, j = 1; i > -6 || j <= 5; i--, j++) {
            if (j < 6) {
                System.out.print(i + ", " + j + ", ");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("\n");
        //Task_15
        taskLine();

        for (int i = 0; i <= 25; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
        //Task_16
        taskLine();

        printTask16(5, 2, 12);

        System.out.println("\n");
        //Task_17
        taskLine();

        printTask17(1, 15);

        System.out.println("\n");
        //Task_18
        taskLine();

        printTask18(1, 7);

        System.out.println("\n");
        //Task_19
        taskLine();

        printTask19();


    }
}
