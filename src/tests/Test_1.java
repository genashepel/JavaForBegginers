package tests;

public class Test_1 {

    public static int happyNum(int year){
        int year1 = year;
        int happyNum = Integer.MAX_VALUE;
        int sum = 0;

       while(happyNum > 9){
           sum = 0;
           while(year1 > 0){
               sum = sum + year1 % 10;
               year1 = year1 / 10;
           }
           year1 = sum;
           happyNum = sum;
         }
        return happyNum;
       }


    public static void main(String[] args){

        System.out.println(happyNum(Integer.MAX_VALUE));
    }
}
