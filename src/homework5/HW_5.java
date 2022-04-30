package homework5;

import java.util.Random;

public class HW_5 {
    public static int numberOfTask = 0;

    public static void taskLine() {
        String taskLeftLine = "\n***************  Task - ";
        String taskRightLine = " ******************\n";
        String line = "+_______________________________+";
        System.out.println(taskLeftLine + (++numberOfTask) + taskRightLine);
    }

    // Method For Test Result
    public static void verifeEquales(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifeEquales(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifeEquales(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static String dayOfWeek(int day) {
        if (day > 0 && day < 8) {
            String daysOfWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            return daysOfWeek[day];
        }
        return "\u001B[31m" + "Wrong Day of Week";

    }

    //Task 3
    public static int largestValue(int x, int y, int z) {
        int largest = x;
        if (x < y) {
            largest = y;
        }
        if (y < z) {
            largest = z;
        }
        return largest;
    }

    //Task 4
    public static int smallestValue(int a, int b, int c) {
        int smallest = a;
        if (smallest > b) {
            smallest = b;
        } else if (smallest > c) {
            smallest = c;
        }
        return smallest;
    }

    public static void verifeSmallest(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println(actualResult + "\u001B[32m" + " -----> " + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    // Task 5
    public static double temperatureOfCat(double a[]) {

        double temperatureOfCat[] = a;
        //double temperatureOfCat[]  = {34.5, 34.7, 33, 32, 31};
        double middleOfTemperatureOfCat = 0;
        for (int i = 0; i < temperatureOfCat.length; i++) {
            middleOfTemperatureOfCat = middleOfTemperatureOfCat + temperatureOfCat[i];
        }
        middleOfTemperatureOfCat = middleOfTemperatureOfCat / temperatureOfCat.length;

        return middleOfTemperatureOfCat;
    }

    //Task 6
    public static String convertDecimalToMoney(double a) {

        String ofDecimal = String.format("%,.2f", a);

        ofDecimal = ofDecimal.replace(".", " rub ");

        return ofDecimal + " kop";
    }

    //Task 7
    public static String convertDecimalToWaight(double a) {

        //String ofDecimal = String.valueOf(a);
        String ofDecimal = String.format("%,.3f", a);
        ofDecimal = ofDecimal.replace(".", " kg ");
        //System.out.println(ofDecimal + " kop");
        return ofDecimal + " gr";
    }

    //Task 8
    public static double sumOfPokupki(double price, double quantityOfGoods) {

        return price * quantityOfGoods;
    }

    //Task 9
    public static void printResit(String tovar, double pricePerKg, double quantityOfGoods) {

        System.out.println(tovar + "\t\t\t\t");
        System.out.println("Price per kg\t\t\t" + convertDecimalToMoney(pricePerKg));
        System.out.println("Quantity of goods\t\t" + convertDecimalToWaight(quantityOfGoods));
        System.out.println("_______________________________________");
        System.out.println("Total\t\t\t\t\t"
                + convertDecimalToMoney(sumOfPokupki(pricePerKg, quantityOfGoods)));

    }

    // Task 10
    public static double countSalary(int hoursPerDay, double salaryPerHour) {
        double salaryPerMonth = hoursPerDay * salaryPerHour * 20;
        return salaryPerMonth;
    }

    public static void printVedomost(String person, double salary) {
        System.out.println(person + "\t\t\t" + convertDecimalToMoney(salary));
    }

    //Task 13

    public static int getHappyNumber(int year) {
        int happyNumber = 0;
        char[] year1 = String.valueOf(year).toCharArray();
        int sumOfNumbersFromYear = 0;

        do {
            sumOfNumbersFromYear = 0;
            // obnulit na kajdom shagu
            for (int i = 0; i < year1.length; i++) {
                sumOfNumbersFromYear = sumOfNumbersFromYear + Character.getNumericValue(year1[i]);
            }
            year1 = String.valueOf(sumOfNumbersFromYear).toCharArray();
        } while (sumOfNumbersFromYear > 9);

        happyNumber = sumOfNumbersFromYear;

        return happyNumber;
    }

    //Task14
    public static void raznicaMedanaAndMiddleValue(int a, int b, int c) {

        double middleValue = (a + b + c) / 3.0;

        int mediana = 0;
        int min = 0;
        int max = 0;
        if (a < c && a < b) {
            min = a;
            if (b < c) {
                mediana = b;
            }else {
                mediana = c;
            }
        } else if (b < a && b < c) {
            min = b;
            if (a < c) {
                mediana = a;
            }else {
                mediana = c;
            }
        } else if (c < a && c < b) {
            min = c;
            if (b < a) {
                mediana = b;
            } else {
                mediana = c;
            }

        }

        // a b c
        // a < b and a < c then if (b < c) b = middle else c = middle
        // b < a and b < c then b = min
        // c < a and c < b then c = min

        int medianaVariant1 = Math.min(Math.max(a, b), c);

        System.out.println(medianaVariant1);



        double raznica = middleValue - mediana;
        if (raznica > 2) {
            System.out.println("MiddleValue " + middleValue +" otlichaetsya ot mediany " + mediana + " na " + raznica);
        } else {
            System.out.print("Middle ----> " + middleValue + "\t");
            System.out.println("Mediana ---> " + mediana);

        }
        System.out.println("\n");
//Variant 1

         raznica = middleValue - medianaVariant1;
        if (raznica > 2) {
            System.out.println("MiddleValue " + middleValue +" otlichaetsya ot mediany " + medianaVariant1 + " na " + raznica);
        } else {
            System.out.print("Middle ----> " + middleValue + "\t");
            System.out.println("Mediana ---> " + medianaVariant1);

        }
        System.out.println("\n");
    }

    //Task 15

    public static String returnPriceTask15(double price){

        return "сумма к оплате " + convertDecimalToMoney(Math.floor(price));
    }

//Task16
    public static double task16(double a, double b, double c){
       double result = 0;

       result = Math.sqrt((a * b + c) * Math.pow(a, b));
       result = result / Math.PI;

        return Math.ceil(result);
    }

    //Task 18

    public static double getPowOfNumber(){
        int max = 10;
        int min = 1;

        Random random = new Random();
        double first = Math.random();
        int second = random.nextInt(10 + 1) + 1;
        return Math.pow(first, second);
    }


    //*****************************************************************************************************

    public static void main(String[] args) {

        String pass = "\u001B[32m" + "Pass" + "\u001B[0m";
        String fail = "\u001B[31m" + "Fail" + "\u001B[0m";


        //Task_1
        taskLine();


        //Task_2
        taskLine();
        System.out.println(dayOfWeek(5));
        verifeEquales("Friday", dayOfWeek(5));

        //Task_3
        taskLine();
        largestValue(-4, -7, -12);
        int expectedResult = -4;

        verifeEquales(expectedResult, largestValue(-4, -7, -12));


        //Task_4
        taskLine();

        //System.out.println(smallestValue(5, 45, 67));

        int a = 3;
        int b = 23;
        int c = 1456;
        expectedResult = 3;
        verifeSmallest(3, smallestValue(a, b, c));


        //Task_5
        taskLine();

        double temperatura[] = {34.5, 34.7, 33, 32.1, 31.8};
        System.out.println("Middle Temperature of Cat = " + temperatureOfCat(temperatura));

        double expectedResultTask5 = 33.22;

       verifeEquales(expectedResultTask5, temperatureOfCat(temperatura) );


        //Task_6
        taskLine();

        System.out.println(convertDecimalToMoney(10.00));


        //Task_7
        taskLine();

        System.out.println(convertDecimalToWaight(4.00));

        //Task_8
        taskLine();
        double quantityOfGoods = 2.400;
        double price = 3.50;
        System.out.println(quantityOfGoods + " kg po cene " + price + " stoit " + sumOfPokupki(price, quantityOfGoods));

        //Task_9
        taskLine();
        String tovar = "Apples";
        printResit(tovar, price, quantityOfGoods);

        //Task_10
        taskLine();
        int hoursPerDay = 8;
        double salaryPerHour = 23;

        System.out.println(String.format("%,.2f", countSalary(hoursPerDay, salaryPerHour)));


        //Task_11
        taskLine();
        String month = "March";
        int year = 2022;
        String personSMI = "Smirnova Mariya Ivanovna";
        double salarySMI = 70000.05;

        String personSIP = "Smirnova Irina Petrovna  ";
        double salarySIP = 734000.00;

        String personSBS = "Smirnov Boris Sergeevich";
        double salarySBS = 42000.40;

        String personPSV = "Petrov Stepan Vasileevich";
        double salaryPSV = 50570.02;


        System.out.println(month + " " + year);
        printVedomost(personSMI, salarySMI);
        printVedomost(personSIP, salarySIP);
        printVedomost(personSBS, salarySBS);
        printVedomost(personPSV, salaryPSV);


        //Task_12
        taskLine();
        int x = 0;
        if (x < 0) {
            System.out.println("X is Negative");
        } else if (x > 0) {
            System.out.println("X is Positive");
        } else {
            System.out.println("X is Zerro");
        }
        System.out.println();

//Part 2 ***************************************************************

        //Task_13
        taskLine();

        System.out.println(getHappyNumber(Integer.MAX_VALUE));


        //Task_14
        taskLine();
/*
а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать

*Медиана - это серединное число в отсортированном наборе чисел.
1, 3, 9 → медиана 3
12, 13, 101 → медиана 13
14, 2, 12 → медиана 12

 */
        raznicaMedanaAndMiddleValue(1, 3, 9);
        raznicaMedanaAndMiddleValue(12, 13, 101);
        raznicaMedanaAndMiddleValue(14, 2, 12);

        //Task_15
        taskLine();

        System.out.println(returnPriceTask15(10.75));


        //Task_16
        taskLine();

        System.out.println(task16(3, 4, 20));

        //Task_17
        taskLine();


        //Task_18
        taskLine();
/*
Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного случайного числа.
Метод возвращает математически округленное целое значение и выводит на экран:
“Число … в степени … = …”

Число может быть в пределах от 0 до 1 исключительно.
Степень числа может быть от 0 до 10 включительно

 */

        System.out.println(getPowOfNumber());

        //Task_19
        taskLine();


        //Task_20
        taskLine();

    }
}
