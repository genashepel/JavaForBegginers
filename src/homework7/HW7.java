package homework7;

import java.util.Arrays;

public class HW7 {
    public static int numberOfTask = 0;
    public static String lineOfStars = "\n************************************\n";


    public static void taskLine() {
        String taskLeftLine = "\n***************  Task - ";
        String taskRightLine = " ******************\n";
        String line = "+_______________________________+";
        System.out.println(taskLeftLine + (++numberOfTask) + taskRightLine);
    }


    public static void catsOddNames(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public  static  int [] minFromArray(int [] arr){
        int min = arr[0];
        int max = arr[0];
        int middle = 0;
        int [] arrays = {min, middle, max};

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            middle += arr[i];
        }
        middle = middle / arr.length;

        arrays[0] = min;
        arrays[1] = middle;
        arrays[2] = max;

        return arrays;
    }

    public static void main(String[] args) {


        //Task 1
        taskLine();

        String[] catsNames = {"Barsik", "Murka", "Rijik", "Pupsik", "Murka", "Tik tok", "Gav-gav", "Masya"};

        //Task 2
        taskLine();

        catsNames[4] = "Rijik";
        catsNames[1] = "Chernish";

        //Task 3
        taskLine();

        String[] catsColor = {"Red", "Blue", "Green", "Yellow", "White", "Gray", "Purpul", "Rigiy"};

        //Task 4
        taskLine();

        int[] catsAge = {12, 34, 3, 1, 32, 45, 1, 56};

        //Task 5
        taskLine();

        boolean[] isCatRed = {false, false, false, true, true, false, false, false};

        //Task 6
        taskLine();

        System.out.println(catsNames[6]);

        System.out.println(lineOfStars);

        for (int i = 0; i < catsNames.length; i = i + 2) {
            System.out.println("Box number " + i + " -----> " + catsNames[i]);
        }

        System.out.println(lineOfStars);

        for (int i = 0; i < catsNames.length; i++) {
            if (i != 0 && i % 4 == 0) {
                System.out.println("Box number " + i + " -----> " + catsNames[i]);
            }
        }

        System.out.println(lineOfStars);

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 != 0) {
                System.out.println("Box number " + i + " -----> " + catsColor[i]);
            }
        }

        System.out.println(lineOfStars);

        for (int i = 0; i < catsNames.length; i++) {
            if (i != 0 && i % 3 == 0) {
                System.out.println("Box number " + i + " -----> " + catsColor[i]);
            }
        }
        System.out.println(lineOfStars);


        System.out.println(lineOfStars);

        //Task 7
        taskLine();

        for (int i = 0; i < catsColor.length; i++) {
            if (catsColor[i].equals("Gray")) {
                System.out.println("Box number " + i + " -----> " + catsColor[i]);
                System.out.println("Feed a cat " + catsNames[i]);
            }
        }
        //Task 8
        taskLine();
        for (int i = 0; i < catsAge.length; i++) {
            if (catsAge[i] < 2) {
                System.out.println("Отнеси кота " + catsNames[i] + " на прививку!");
            }
        }


        //Task 9
        taskLine();

        System.out.println(catsNames[catsNames.length - 1] + " " + catsAge[catsAge.length - 1] + " "
                + catsColor[catsColor.length - 1]);

        //Task 10
        taskLine();


        for (int i = 0; i < catsAge.length; i++) {
            if (catsAge[i] > 2) {
                System.out.println(catsNames[i] + " is " + catsAge[i] + " years old");
            }
        }

        //Task 11
        taskLine();
        System.out.println(Arrays.toString(catsNames));
        System.out.println(Arrays.toString(isCatRed));
        for (int i = 0; i < catsNames.length; i++) {
            if (catsNames[i].equals("Rijik") && isCatRed[i]) {
                System.out.println("Накорми кота! " + catsNames[i]);
            }
        }

        //Task 12
        taskLine();

        System.out.println(Arrays.toString(catsAge));
        int middleAge = 0;
        for (int i = 0; i < catsAge.length; i++){
            middleAge += catsAge[i];
        }
        middleAge = middleAge / catsAge.length;

        System.out.println(middleAge);

        //Task 13
        taskLine();

        int smallestAge = catsAge[0];
        for (int i = 1; i < catsAge.length; i++){
            if(smallestAge > catsAge[i]){
                smallestAge = catsAge[i];
            }
        }
        System.out.println("Smallest Age is " + smallestAge);

        //Task 14
        taskLine();

        int biggestAge = Integer.MAX_VALUE;
        for (int i = 0; i < catsAge.length; i++){
            if( biggestAge < catsAge[i]){
                biggestAge = catsAge[i];
            }
        }

        System.out.println(Arrays.toString(catsAge));
        System.out.println("Biggest Age is " +  biggestAge);

        //Task 15
        taskLine();

        int countGray = 0;
        for (int i = 0; i < catsColor.length; i++){
            if(catsColor[i].equals("Gray")){
                ++countGray;
            }
        }

        System.out.println(Arrays.toString(catsColor));
        System.out.println(" Kоличество серых котов  is " +  countGray);

        //Task 16



        //Task 17
        taskLine();

        taskLine();
        int count = 0;
        for(int i = 0; i < 11; i++){
            if(i != 0 && i % 2 == 0){
                ++count;
            }
        }
        int [] arr = new int[count];

        while (count != 0){
            int  a = 0;
            for(int i = 0; i < 11; i++){
                if(i != 0 && i % 2 == 0) {
                    arr[a] = i;
                    ++a;
                }
            }
            --count;
        }
        System.out.println(Arrays.toString(arr));

        //Task 18
        taskLine();

        //Task 19
        taskLine();

        //Task 20
        taskLine();

        int [] randomNumber = new int[10];
        for (int i = 0; i < randomNumber.length; i++){
            randomNumber [i] =  (int) (Math.random() * (10 - 1) + 1);

        }
        System.out.println(Arrays.toString(randomNumber));

        //Task 21
        taskLine();

        System.out.println(Arrays.toString(randomNumber));

        System.out.println(Arrays.toString(minFromArray(randomNumber)));

        //Task 22
        taskLine();




    }
}
