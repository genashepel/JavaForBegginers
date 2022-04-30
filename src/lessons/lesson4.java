package lessons;

public class lesson4 {

    public static void main(String[] args){

        //Task 100
        int n = 3;
        int expectedResult = 1;

        if (n % 2 != 0){
            if ( n % 3 == 0){
                n = n / 3;
            } else {
                n = n * 3;
            }
        } else {
            n = n * (n / 2);
        }

        System.out.println(n);

        //Test
        if (expectedResult == n){
            System.out.println("\u001B[32m" + "Pass");
        } else {
            System.out.println("\u001B[31m" + "False");
        }
    }
}
