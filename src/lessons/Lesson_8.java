package lessons;

public class Lesson_8 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};
        int[] arr1 = new int[3];
        int[] arr2 = {1, 2, 3};


        Integer intReg = 4;
        Integer intReg1 = 4;
        Double doubReg = 5.5;

        Integer intObject = new Integer(4);
        Double doubObject = new Double(5.5);

        String str1 = "Hello";
        String str2 = "Hello";

        String strObject = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == strObject);


        System.out.println("_______________________________");

        System.out.println(str1 == str2);
        System.out.println(intReg == intReg1);
        System.out.println(intReg == intObject);

    }
}
