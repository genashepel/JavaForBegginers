package homework2;

public class HW2Part2 {
    public static void main(String[] args) {

        /**
         * Addition,
         * subtraction,
         * multiplication,
         * division
         */

        String line = "__________________________________";

        int k = 5;
        int l = 10;
        int m = 15;

        System.out.println(line);

        System.out.println("" + k + "\n" + l + "\n" + m);
        System.out.println(line);

        System.out.println("" + k + l + m);
        System.out.println(line);

        System.out.println("" + k + "," + l + "," + m);
        System.out.println(line);

        System.out.println("k = " + k + ";\n" + "l = " + l + ";\n" + "m = " + m + ";");
        System.out.println(line);

        System.out.println("Sum of k and l = " + (k + l));
        System.out.println("Mult of k and l = " + (k * m));
        System.out.println("Sub of l and m = " + (l - m));
        System.out.println(line);
        // Task 17

        String rofDiv = "Result of division  ";
        String rem = ", and Remainder of the division = ";

        System.out.println(rofDiv + "k  and l = " + (k / l) + rem + (k % l));
        System.out.println(rofDiv + "k  and m = " + (k / m) + rem + (k % m));
        System.out.println(rofDiv + "l  and m = " + (l / m) + rem + (l % m));
        System.out.println(rofDiv + "m  and k = " + (m / k) + rem + (m % k));
        System.out.println(rofDiv + "l  and k = " + (l / k) + rem + (l % k));
        System.out.println(rofDiv + "m  and l = " + (m / l) + rem + (m % l));
        System.out.println(line);

        // Task 18
        int apple = 40;
        int student = 6;

        System.out.println("If " + apple + " apples div on " + student + " students, every student will give "
                + (apple / student) + " apples, and " + apple % student + " apples  will leave for teacher");

        apple = 100;
        student = 21;

        System.out.println("If " + apple + " apples div on " + student + " students, every student will give "
                + (apple / student) + " apples, and " + apple % student + " apples  will leave for teacher");
        System.out.println(line);

        // Task 19

        int sumKLM = k + l + m;
        int sumLKM = l + k + m;
     //---------------------------
        m++;
        int m1 = m;

        int sumKLMPlusPlus = k + l + m1;
        sumKLM--;
        int sumKLMMinMin = sumKLM--;


       // System.out.println(m1);
        System.out.println(sumKLMPlusPlus + sumKLMMinMin );

        //System.out.println(m1);
        System.out.println(m1 - sumLKM);

//
//
//        int sumLKM = k + l + m;
//        int sumKLM-- = k + l + m--;
//        System.out.println("Sum" + k + ", " + l + ", " +  m++ + " and " + sumKLM-- + " =  "
//                            + ("" + (k + l + m++) + sumKLM--));
        System.out.println(line);

        // Task 20
        System.out.println("48 % 8 = " + (48 % 8));
        System.out.println("48 % 2 = " + (48 % 2));
        System.out.println("8 % 2 = " + (8 % 2));
        System.out.println("47 % 2 = " +(47 % 2));
        System.out.println("49 % 2 = " +(49 % 2));


    }
}
