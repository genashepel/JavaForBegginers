package homework2;

public class HW2Part3 {
    public static void main(String[] args){

        int k = 5;
        int l = 7;
        int m = 9;

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y-x;
        int result21 = (x + 3) * (x + 3);

        int result22 = (((3 + 4 * x) / 5)) - ((10 * (y - 5) * (a + b + c)) / x)
                                + (9 * (4 / x + ((9 + x) / y)));

        int result23 = ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y))
                          / (a + b + (c / d) + ((a + b) / (c + d)) + (a * b));

        String line = "__________________________________";

        System.out.println(line);
        System.out.println("| task\t| result\t\t\t\t |");
        System.out.println(line);
        System.out.println("| 21\t| " + result21 + "\t\t\t\t\t |");
        System.out.println(line);
        System.out.println("| 22\t| " + result22 + "\t\t\t\t\t |");
        System.out.println(line);
        System.out.println("| 23\t| " + result23 + "\t\t\t\t\t |");
        System.out.println(line);

        System.out.println(3d / 5);

    }
}
