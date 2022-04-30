package homework4;

public class HW4_Part2 {

    public static int numberOfTask = 9;

    public static void taskLine() {
        String taskLeftLine = "\n***************  Task - ";
        String taskRightLine = " ******************\n";
        String line = "+_______________________________+";

        System.out.println(taskLeftLine + (++numberOfTask) + taskRightLine);
    }
    public static void divisionPart2(int k, int l, int m){
        System.out.println("Результат деления k / l = " + k / l + ", а остаток от деления  = " + k % l);
        System.out.println("Результат деления k / m = " + k / m + ", а остаток от деления  = " + k % m);
        System.out.println("Результат деления k / k = " + k / k + ", а остаток от деления  = " + k % k);
        System.out.println("Результат деления l / m = " + l / m + ", а остаток от деления  = " + l % m);
        System.out.println("Результат деления l / k = " + l / k + ", а остаток от деления  = " + l % k);
        System.out.println("Результат деления l / l = " + l / l + ", а остаток от деления  = " + l % l);
        System.out.println("Результат деления m / k = " + m / k + ", а остаток от деления  = " + m % k);
        System.out.println("Результат деления m / l = " + m / l + ", а остаток от деления  = " + m % l);
        System.out.println("Результат деления m / m = " + m / m + ", а остаток от деления  = " + m % m);

    }

    public static void appledivision(int apple, int student){
        if(apple >= student) {
            System.out.println("If " + apple + " apples div on " + student + " students, every student will give "
                    + (apple / student) + " apples, and " + apple % student + " apples  will leave for teacher");
       } else {
           System.out.println("I am sorry. You need " + (student - apple) + " apples more!");
        }
    }

    public static void main(String[] args) {

        //Task 10
        taskLine();

         int numberOfTask10 = 67;

         if (numberOfTask10 % 2 == 0){
             numberOfTask10 = numberOfTask10 * 2;
         } else {
             numberOfTask10 = numberOfTask10 * numberOfTask10;
         }
        System.out.println(numberOfTask10);

        //Task 11
        taskLine();
        int ageTask11 = 16;

        if(ageTask11 >= 18) {
            System.out.println("Голосовать можно");
        } else if (ageTask11 >= 16 ){
                    System.out.println("Машину можно водить, a Голосовать nelzya" );
                } else if (ageTask11 >= 5 && ageTask11 < 21){
                        System.out.println("В школу можно, иди");
                        }else {
                                System.out.println("Stay at Home");
                        }

      //Task 12
        taskLine();
        int classNow = 3;
        int gradeOfStudent = 3;
        if (gradeOfStudent == 5){
            System.out.println("5 is Exelent  - выдать похвальную грамоту и перевести в следующий класс");
            classNow++;
        }else if (gradeOfStudent == 4){
            System.out.println("4 is Good  - перевести в следующий класс");
            classNow++;
        } else if(gradeOfStudent == 3){
            System.out.println("3 is No Good - дать задание на лето и перевести в следующий класс");
            classNow++;
        } else if(gradeOfStudent == 2){
            System.out.println("2 is Very Bad - вызвать родителей и оставить в текущем классе на второй год");
            classNow = classNow;
        }

        classNow = 1;
        if(gradeOfStudent > 2 && gradeOfStudent < 5){

            switch (gradeOfStudent){
                case 5 : System.out.println("5 is Exelent  - выдать похвальную грамоту и перевести в следующий класс");
                    classNow++;
                    break;
                case 4 :  System.out.println("4 is Good  - перевести в следующий класс");
                    classNow++;
                    break;
                case 3 :  System.out.println("3 is No Good - дать задание на лето и перевести в следующий класс");
                    classNow++;
                    break;
                case 2 :  System.out.println("2 is Very Bad - вызвать родителей и оставить в текущем классе на второй год");
                    classNow = classNow;
                    break;
            }
        }


        //Task 13
        taskLine();

        int aTask13 = 30;
        int bTask13 = -30;
        double sumTask13 = 0.0;
        double subTask13 = 0.0;
        double multTask13 = 0.0;


        if((aTask13 % 3 == 0) && (bTask13 % 3 == 0)){
            sumTask13 = aTask13 + bTask13;
            System.out.println("Summa " + aTask13 + " and " + bTask13 + " = " + sumTask13);
        }
        if ((aTask13 % 5 == 0) && (bTask13 % 5 == 0)){
            subTask13 = aTask13 - bTask13;
            System.out.println("Subtraction " + aTask13 + " and " + bTask13 + " = " + subTask13);
        }

        if((aTask13 % 2 == 0) && (bTask13 % 2 == 0)) {
            multTask13 = aTask13 * bTask13;

            System.out.println("Multiplication  " + aTask13 + " and " + bTask13 + " = " + multTask13);
            if(aTask13 < 0 || bTask13 < 0 ){
                subTask13 = subTask13 * -1;
                sumTask13 = subTask13 * -1;
            }
        } else System.out.println("невозможно произвести действия");

        //Task 14
        taskLine();
        divisionPart2(3,56,34);

        //Task 15
        taskLine();
        appledivision(10, 40);
        appledivision(60, 40);
        appledivision(100, 21);



    }
}
