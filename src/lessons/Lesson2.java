package lessons;

public class Lesson2 {

    public static void main(String[] args) {

        String line = "__________________________________________";
        int a = 5;
        int b = 13;
        int c = 113;
        int d = -5;
        int sumAB = a + b;
        int sumABC = a + b + c;
        int subBA = b - a;
        int multAB = a * b;
        int devBA = b / a;
        int devAB = a / b;

        System.out.println("a =   " + a);
        System.out.println("b =  " + b);
        System.out.println("c = " + c);

        System.out.println(line);
        System.out.println("sum a + b = " + (a + b));
        System.out.println("sum a + b = " + sumAB);
        System.out.println(sumABC);

        System.out.println(line);

        System.out.println("subBA = " + (b - a));
        System.out.println("" + b + " - " + a + " = " + subBA);

        System.out.println(line);

        System.out.println("" + a + " " + b + " " + c);

        System.out.println(line);

        System.out.print(a);
        System.out.print(b);
        System.out.println(c);

        System.out.println(line);

        System.out.print(" to day is \n");
        System.out.println(" saterday ");

        System.out.println(line);

        System.out.println(d);
        System.out.println(a - d);
        System.out.println(a + d);
        System.out.println(a + b + " " + (c + c));

        System.out.println(line);

        System.out.println(a * b);
        System.out.println(multAB);
        System.out.println(5 * 13);

        System.out.println(line);

        System.out.println(b / a);
        System.out.println(devBA);
        System.out.println(13.0 / 5);
        System.out.println(devAB);

        System.out.println(line);

        System.out.println(a % b);
        System.out.println(b % a);

        System.out.println(line);

        a++;
        System.out.println(a);
        System.out.println(a + 1);

        System.out.println(line);

        b--;
        System.out.println(b);
        System.out.println(b - 1);
    }
}
