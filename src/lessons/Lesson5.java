package lessons;

public class Lesson5 {

    public static int returnMinOfThree(int a, int b, int c){

        int minOfThree = a;

        if(a > b){
            minOfThree = b;
        } //else {
          //  minOfThree = a;
       // }
        if (minOfThree > c){
            minOfThree = c;
        }

        return minOfThree;
    }

    public static double returnAverage(int a, int b, int c){
        return ((double) a + b + c) / 3;
    }

    public static double countDifferenceBetweenMinAndAverage(int a, int b, int c){


        return Math.abs((returnMinOfThree(a, b, c) - returnAverage(a, b, c)));

    }

    public  static String returnMessage(int a, int b, int c){

        if(countDifferenceBetweenMinAndAverage(a, b, c) > 3.51){
            String stringMessage;
        }

        return "";
    }

    public static void main(String[] args){

        int a = 5;
        int b = 2;
        int c = 10;

        System.out.println(returnMinOfThree(a, b, c));
        System.out.println(returnAverage(a, b, c));
        System.out.println(countDifferenceBetweenMinAndAverage(a, b, c));

        System.out.println("*".repeat(30));

    }
}
