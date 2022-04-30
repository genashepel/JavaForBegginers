package homework3;

import java.lang.reflect.Type;

public class HW3_Part_1 {

    public static void main(String[] args) {

        String taskLeftLine = "\n***************  Task - ";
        String taskRightLine = " ******************\n";
        int nunberOfTask = 0;
        String line = "+_______________________________+";
        //Task 1
        System.out.println(taskLeftLine + (++nunberOfTask) + taskRightLine);
        byte a = 127;
        byte b = 1;
        short s = -27500; // s = Short.MAX_VALUE;
        short t = 32500;  // t = s - 60000;

        // Task_4
        nunberOfTask = 4;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        int iMin = -2_147_483_648;
        int iMax = 2_147_483_647;
        System.out.println(line);
        System.out.println("| int min\t|\t" + iMin + "\t\t|");
        System.out.println(line);
        System.out.println("| int max\t|\t" + iMax + "\t\t|");
        System.out.println(line);

        //Task_5
        nunberOfTask++;
        long phoneNumber = 1_718_500_2233L;

        //Task_6
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);
        float f = 100.101101F;
        double d = 100.101101;

        String lineTask6 = "+___________________________________________+";

        System.out.println(lineTask6);
        System.out.println("| float f = 100.101101\t|\t" + f + "\t\t|");
        System.out.println("| double d = 100.101101\t|\t" + d + "\t\t|");
        System.out.println(lineTask6);

        //Task_7
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        String lineTask7 = "+_______________________________________________________+";

        Double dd = 10.09999 + 20.099999;
        Float ff = 10.09999F + 20.099999F;

        System.out.println(lineTask7);
        System.out.println("| float ff\t\t\t\t\t|\t" + ff + "\t\t\t\t|");
        System.out.println(lineTask7);
        System.out.println("| double dd\t\t\t\t\t|\t" + dd + "\t\t|");
        System.out.println(lineTask7);
        System.out.println("| Float ff + dd \t\t\t|\t" + ff + "\t\t\t\t|");
        System.out.println(lineTask7);
        System.out.println("| Double dd + ff\t|\t" + dd + "\t\t\t\t|");
        System.out.println(lineTask7);

        //Task_8
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        double result = 10.0 / 3;
        System.out.println(result);


        //Task_9
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;

        //Task_10
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        System.out.println(".    .    ....    .        .           ...   ");
        System.out.println(".    .    .       .        .        .      . ");
        System.out.println("......    ....    .        .       .        .");
        System.out.println(".    .    .       .        .        .      . ");
        System.out.println(".    .    ....    .....    .....       ...   ");

        //Task_11
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        float t4 = -505.505F;
        int t5 = 100100;
        long t6 = 100_010_001_000L;
        double t7 = 2.66666666666666;
        double t8 = -1000000.001;
        short t9 = 1010;

        System.out.println("byte t1 = " + t1);
        System.out.println("short t2 = " + t2);
        System.out.println("byte t3 = " + t3);
        System.out.println("float t4 = " + t4);
        System.out.println("int t5 = " + t5);
        System.out.println("long t6 = " + t6);
        System.out.println("double t7 = " + t7);
        System.out.println("double t8 = " + t8);
        System.out.println("short t9 = " + t9);

        //Task_12
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);
        String lineTask12 = "+_____________________________________________________________________________________"
                + "___+";
        String tab = "\t\t\t";
        String tab2 = "\t\t\t\t\t";
        String leftLine = "| ";
        String rightLine = " |";

        System.out.println(lineTask12);
        System.out.println("| Type" + tab + leftLine + "Syze in bits\t" + leftLine + "min" + tab2 + "\t"
                + leftLine + "max" + tab2 + "\t" + rightLine);
        System.out.println(lineTask12);
        System.out.println("| byte" + tab + leftLine + (Byte.SIZE) + " " + tab + leftLine + (Byte.MIN_VALUE)
                + tab2 + "\t" + leftLine + (Byte.MAX_VALUE) + tab2 + "\t" + rightLine);
        System.out.println(lineTask12);
        System.out.println("| short" + tab + leftLine + (Short.SIZE) + tab + leftLine + (Short.MIN_VALUE) + tab2
                + leftLine + (Short.MAX_VALUE) + tab + tab + rightLine);
        System.out.println(lineTask12);
        System.out.println("| int" + tab + leftLine + Integer.SIZE + tab + leftLine + (Integer.MIN_VALUE) + tab + "\t"
                + leftLine + Integer.MAX_VALUE + tab + "\t" + rightLine);
        System.out.println(lineTask12);
        System.out.println("| long" + tab + leftLine + (Long.SIZE) + tab + leftLine + Long.MIN_VALUE + "\t\t"
                + leftLine + Long.MAX_VALUE + "   " + "\t" + rightLine);
        System.out.println(lineTask12);
        System.out.println("| float" + tab + leftLine + Float.SIZE + tab + leftLine + Float.MIN_VALUE + tab2
                + leftLine + Float.MAX_VALUE + "\t\t\t\t" + rightLine);
        System.out.println(lineTask12);
        System.out.println("| double\t\t" + leftLine + Double.SIZE + tab + leftLine + Double.MIN_VALUE + tab2
                + leftLine + Double.MAX_VALUE + "\t" + rightLine);
        System.out.println(lineTask12);

        //Task_13
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        Integer num1 = 130;
        Integer num2 = 130;
        System.out.println("If num1 = num2, then result of num1.equal(num2) = " + (num1.equals(num2)));

        num1 = 1345;
        num2 = 1670;
        System.out.println("If num1 != num2, then the result of num1.equal(num2) = " + (num1.equals(num2)));

        //Task_14
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);
        // a)
        int number1 = 23;
        int number2 = 23;

        System.out.println("If number1 = number2, then result of number1 = number2 = "
                            + (Integer.compare(number1, number2)));

        // b)
        number1 = 35;
        number2 = 56;

        System.out.println("If number1 < number2, then result of number1 > number2 = "
                            + (Integer.compare(number1, number2)));

        // c
        number1 = 78;
        number2 = 51;

        System.out.println("If number1 < number2, then result of number1 > number2 = "
                            + (Integer.compare(number1, number2)));

        //Task_15
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        Float flot1 = 234.9999F;
        System.out.println(flot1.intValue());
        System.out.println(flot1.doubleValue());
        System.out.println(flot1.shortValue());
        System.out.println(flot1.byteValue());
        System.out.println(flot1.TYPE);

        //Task_16
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        double task16_1 = 456.56;
        double task16_2 = 578.6;



        System.out.println(Double.sum(task16_1, task16_2));

        //Task_17
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        Float task16_3 = 456.567F;
        Float task16_4 = 578.746F;

        System.out.println(Integer.sum(task16_3.intValue(), task16_4.intValue())); //it doesn't work!
        System.out.println("it doesn't work!");

        //Task_18
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        Short short1 = 12000;
        Short short2 = 12300;

        System.out.println("12000 - 123000 = " + Short.compare(short1, short2));

        //Task_19
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println("doub1 - doub2 = " + (doub1 - doub2));
        System.out.println("str - str1 = " + Double.valueOf(str1) + Double.valueOf(str2));

        //Task_20
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        //double temperatureCat = 0;
        double temperatureCatMin = 37.2;
        double temperatureCatMax = 39.2;

        System.out.println("Middle temperature of Cat = "
                + Math.addExact((int) temperatureCatMin, (int) temperatureCatMax) / 2);

        //Task_21
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        Number n = Double.MAX_VALUE;
        n = 10;
        n = 10.999999999;

        System.out.println();


        //Task_22
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);

        Integer numberInteger = 100;
        String  numberIntegerString = numberInteger.toString();

        System.out.println("numberInteger is " + numberInteger.TYPE + " type\n");
        System.out.println(numberIntegerString + 1);


        //Task_23
        nunberOfTask++;
        System.out.println(taskLeftLine + nunberOfTask + taskRightLine);




    }
}
