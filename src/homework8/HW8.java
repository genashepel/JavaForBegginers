package homework8;

import java.util.Arrays;

import static utils.Utils.*;

public class HW8 {

    public static boolean equileValue(Integer hw8, Integer hw8_1) {

        return hw8.equals(hw8_1);
    }

    public static boolean equileValue(Double hw8, Double hw8_1) {

        return hw8.equals(hw8_1);
    }

    public static boolean equileValue(String hw8, String hw8_1) {

        return hw8.equals(hw8_1);
    }


    public static int[] returnIntArrayFromNumbers(int i1, int i2, int i3, int i4, int i5) {
        int[] arr = {i1, i2, i3, i4, i5};
        return arr;
    }

    public static double[] returnDoubleArrayFromNumbers(double i1, double i2, double i3, double i4, double i5) {
        double[] arr1 = {i1, i2, i3, i4, i5};
        return arr1;
    }

    public static String[] returnStringArrayFromNumbers(String str1, String str2, String str3,
                                                        String str4, String str5) {
        String[] arr1 = {str1, str2, str3, str4, str5};
        return arr1;
    }

    public static double[] multArraysOfNumberOnTwoAndFive(double resultArray[]) {

        if (resultArray != null && resultArray.length > 0) {
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] *= 2.5;
            }
            return resultArray;
        } else {
            return resultArray = new double[]{0};
        }
    }

    public static int returnChotNumber(int[] arr) {
        int result = 0;
        if (arr != null && arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    result++;
                }
            }
        } else {
            return result;
        }
        return result;
    }

    public static int returnNechotNumber(int[] arr) {
        int result = 0;
        if (arr != null && arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    result++;
                }
            }
        } else {
            return result;
        }
        return result;
    }

    public static boolean[] returnBoolArrays(int[] arr) {
        boolean[] result = new boolean[arr.length];

        if (arr != null && arr.length != 0) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 10) {
                    result[i] = true;
                } else {
                    result[i] = false;
                }
            }
        } else {
            return null;
        }

        return result;
    }

//    Написать метод, который принимает на вход длину массива l и количество знаков d
//            (однозначные, двузначные, трехзначные и тд числа),
//    и генерирует массив случайных целых положительных чисел длины l,
//    в котором все числа имеют количество знаков d


    public static int[] getArraysOfNumberTask18(int length) {
        int[] arrResult = new int[length];

        for (int i = 0; i < arrResult.length; i++) {
            arrResult[i] = (int) (Math.random() * (99 - 1) + 1);
        }

        return arrResult;
    }

    public static int[] getArraysOfNumberTask19(int length, int d) {
        int[] arrResult = new int[length];
        int startNumber = ((int) (Math.pow(10, d))) / 10;
        int lastNumber = (((int) (Math.pow(10, d + 1))) - 1) / 10;

        for (int i = 0; i < arrResult.length; i++) {
            arrResult[i] = (int) (Math.random() * (lastNumber - startNumber) + startNumber);
        }

        return arrResult;
    }

    public static int[] getArraysOfNumbersTask17(int[] arr) {

        int[] resultChet = new int[arr.length];
        int[] resultNeChet = new int[arr.length];
        int countChet = 0;
        int countNeChet = 0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != 0){
                if (arr[i] % 2 == 0) {
                    resultChet[countChet] = arr[i];
                    countChet++;
                } else {
                   resultNeChet[countNeChet] = arr[i];
                   countNeChet++;
                }
            }
        }

        if(countChet > countNeChet){
            int[] resultArray = new int[countChet];
            for(int i = 0; i < resultArray.length; i++){
                resultArray[i] = resultChet[i];
            }
                return resultArray;
        } else{
            int[] resultArray = new int[countNeChet];
            for(int i = 0; i < resultArray.length; i++){
                resultArray[i] = resultNeChet[i];
            }

            return resultArray;
        }

    }

    public static int[] returnArraysTask20(int[] arr){
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = Math.abs((arr[i] / 10) - (arr[i] % 10));
        }
        return result;
    }


    public static void main(String[] args) {
        Integer intHW8 = new Integer(5);
        Double doubleHW8 = new Double(45.895);
        String strHW8 = new String("Gena");
        numberOfTask = 5;

        //Task_6
        taskLine();

        HW8_1 hw8_1 = new HW8_1();
        String line = "________________________________________________________";

        System.out.println(line);
        System.out.println("HW8\t\t\t\t\t| HW8_1\t\t\t\t\t| areEquals?\t");
        System.out.println(line);
        System.out.println("Integer i = " + intHW8 + "\t\t"
                + "| Integer i_1 = " + hw8_1.intHW8_1 + "\t\t"
                + "| " + equileValue(intHW8, hw8_1.intHW8_1));
        System.out.println("Double i = " + doubleHW8 + "\t"
                + "| Double i_1 = " + hw8_1.doubleHW8_1 + "\t"
                + "| " + equileValue(doubleHW8, hw8_1.doubleHW8_1));
        System.out.println("String i = " + strHW8 + "\t\t"
                + "| String i_1 = " + hw8_1.strHW8_1 + "\t\t"
                + "| " + equileValue(strHW8, hw8_1.strHW8_1));
        System.out.println(line);


        //Task_7
        taskLine();

        System.out.println(Arrays.toString(returnIntArrayFromNumbers(2, 5, 6, 8, 9)));

        //Task_8
        taskLine();
        System.out.println(Arrays.toString(returnDoubleArrayFromNumbers(2.56, 5.4567, 64.36, 8.567, 9.01201)));

        //Task_9
        taskLine();
        System.out.println(Arrays.toString(returnStringArrayFromNumbers("Hi", " my", " name", " is", "Gennadiy")));

        //Task_10
        taskLine();
        System.out.println(Arrays.toString(multArraysOfNumberOnTwoAndFive(new double[]{3, 56, 0, 34, 45.345})));

        //Task_11
        taskLine();
        int[] arr2 = {1, 5, 3, 2, 8};
        System.out.println(returnChotNumber(arr2));
        System.out.println(returnChotNumber(new int[0]));

        //Task_12
        taskLine();
        int[] arr3 = {1, 5, 3, 2, 6, 8};
        System.out.println(returnNechotNumber(arr2));
        System.out.println(returnNechotNumber(new int[0]));

        //Task_13
        taskLine();
        int[] arr13 = new int[]{1, 4, 12, 23, 45, 8, 0};


        System.out.println(Arrays.toString(arr13));
        System.out.println(Arrays.toString(returnBoolArrays(arr13)));

        //Task_14
        taskLine();
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random() * (9 - 1) + 2));
        }


        //Task_15
        taskLine();

        //Task_16
        taskLine();

        //Task_17
        taskLine();
        System.out.println(Arrays.toString(getArraysOfNumbersTask17(getArraysOfNumberTask18(25))));

        //Task_18
        taskLine();
        System.out.println(Arrays.toString(getArraysOfNumberTask18(25)));

        //Task_19
        taskLine();
        System.out.println(Arrays.toString(getArraysOfNumberTask19(25, 3)));

        //Task_20
        taskLine();

        int[] arrayTask20 = getArraysOfNumberTask18(23);
        System.out.println(Arrays.toString(arrayTask20));
        System.out.println(Arrays.toString(returnArraysTask20(arrayTask20)));

        //Task_21
        taskLine();

        //Task_22
        taskLine();

        //Task_23
        taskLine();

        //Task_24
        taskLine();

        //Task_25
        taskLine();

        //Task_26
        taskLine();
    }
}
