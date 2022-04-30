package homework4;

public class HW4_Part3 {

    public static int numberOfTask = 15;

    public static void taskLine() {
        String taskLeftLine = "\n***************  Task - ";
        String taskRightLine = " ******************\n";
        String line = "+_______________________________+";

        System.out.println(taskLeftLine + (++numberOfTask) + taskRightLine);
    }

    public static void appledivision(int apple, int student){
        if(apple >= student) {
            System.out.println("If " + apple + " apples div on " + student + " students, every student will give "
                    + (apple / student) + " apples, and " + apple % student + " apples  will leave for teacher");
        } else {
            System.out.println("I am sorry. You need " + (student - apple) + " apples more!");
        }
    }
    public static void converterTemperature(double celsius){
        double fahrenheit = (celsius  * (9.0 / 5)) + celsius;
        System.out.println("Temperature in Celsius is  --->  " + celsius);
        System.out.println("Temperature in Fahrenheit  is  --->  " + fahrenheit);
    }

    public static void printTableTask18(int i){
        String lineTopAndBottom = "+___________________________+";
        System.out.println(lineTopAndBottom);
        System.out.println("| int min\t|\t" + i + " \t\t\t|" );
        System.out.println(lineTopAndBottom);
        System.out.println("| int max\t|\t" + i + " \t\t\t|" );
        System.out.println(lineTopAndBottom);
        System.out.println("| i^2\t\t|\t" + (i * i) + " \t\t\t|" );
        System.out.println(lineTopAndBottom);
    }

    public static int testOfTask10(int numberOfTask10){


        if (numberOfTask10 % 2 == 0){
            numberOfTask10 = numberOfTask10 * 2;
        } else {
            numberOfTask10 = numberOfTask10 * numberOfTask10;
        }
        return numberOfTask10;

    }
    public static String testOfTask11(int ageTask11){
        if(ageTask11 >= 18) {
            return "Голосовать можно";
        } else if (ageTask11 >= 16 ){
            return "Машину можно водить, a Голосовать nelzya";
        } else if (ageTask11 >= 5){
            return"В школу можно, иди";
        }else {
            return "\u001B[31m Stay at Home";

        }

    }

    public static void testTask20(int age, String str){
        if(str.equals(testOfTask11(age))){
            System.out.println("\u001B[32m" +"Pass");
        } else {
            System.out.println("\u001B[31m" +"Fail");
        }
        System.out.println("\u001B[0m");
    }

    public static void main(String[] args) {

        //Task 16
        taskLine();
        appledivision(42, 42);
        appledivision(55, 5);
        appledivision(1, 2);


        //Task 17
        taskLine();

        converterTemperature(32);

        //Task 18
        taskLine();
        printTableTask18(6);

        printTableTask18(345);


        //Task 19
        taskLine();
        int a1 = 2;
        int a2 = 5;
        int a3 = 0;

        String lineTask19 = "________________________________________________";
        System.out.println(lineTask19);
        System.out.println("| dannoe\t| expectedResult\t|  poluchenniy\t|");
        System.out.println(lineTask19);
        System.out.println("| " + a1 + "\t\t\t| 4 \t\t\t\t|" + (testOfTask10(a1)) + "\t\t\t\t|");
        System.out.println(lineTask19);
        System.out.println("| " + a2 + "\t\t\t| 25\t\t\t\t|" + (testOfTask10(a2)) + "\t\t\t\t|");
        System.out.println(lineTask19);
        System.out.println("| " + a3 + "\t\t\t| 0 \t\t\t\t|" + (testOfTask10(a3)) + "\t\t\t\t|");
        System.out.println(lineTask19);


        //Task 20
//        Напишите тест, который валидирует ваш код из задания №11.
//        Придумайте тестовые данные.
//        Выведите результат проверки на печать.
        taskLine();

        testTask20(18, "Голосовать можно");
        testTask20(16, "Машину можно водить, a Голосовать nelzya");
        testTask20(5, "В школу можно, иди");
        testTask20(1, "Stay at Home");


        //Task 21
        taskLine();

        short shortVariable = 345;
        String stringFromShortVariable = String.valueOf(shortVariable);
        if(shortVariable >= 0 ){
            System.out.println("it is a " + stringFromShortVariable.length() + " digit number");
        }else{
            System.out.println("it is a " + (stringFromShortVariable.length() - 1) + " digit number");
        }


    }
}
