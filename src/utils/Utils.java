package utils;

public class Utils {

    public static final String ANSI_RESET =     "\u001B[0m";
    public static final String ANSI_BLACK =     "\u001B[30m";
    public static final String ANSI_RED =       "\u001B[31m";
    public static final String ANSI_GREEN =     "\u001B[32m";
    public static final String ANSI_YELLOW =    "\u001B[33m";
    public static final String ANSI_BLUE =      "\u001B[34m";
    public static final String ANSI_PURPLE =    "\u001B[35m";
    public static final String ANSI_CYAN =      "\u001B[36m";
    public static final String ANSI_WHITE =     "\u001B[37m";

    public static int numberOfTask = 0;
    public static String lineOfStars = "\n************************************\n";


    public static void taskLine() {
        String taskLeftLine = "\n***************  Task - ";
        String taskRightLine = " ******************\n";
        String line = "+_______________________________+";
        System.out.println(taskLeftLine + (++numberOfTask) + taskRightLine);

    }

    public static String verify(int a, int b) {
        if (a == b) {
            System.out.println(ANSI_GREEN + "Pass" + ANSI_RESET);
            return "Pass";
        } else {
            System.out.println(ANSI_RED + "Fail" + ANSI_RESET);
            return "Fail";
        }
    }

    public static String verify(double a, double b) {
        if (a == b) {
            System.out.println(ANSI_GREEN + "Pass" + ANSI_RESET);
            return "Pass";
        } else {
            System.out.println(ANSI_RED + "Fail" + ANSI_RESET);
            return "Fail";
        }
    }

    public static String verify(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println(ANSI_GREEN + "Pass" + ANSI_RESET);
            return "Pass";
        } else {
            System.out.println(ANSI_RED + "Fail" + ANSI_RESET);
            return "Fail";
        }
    }

    public static double formatDouble(double number, int d){
        int num = (int) Math.round(number * Math.pow(10, d));
        number = num / Math.pow(10, d);
        return number;


    }

}
