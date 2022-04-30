package homework4;

public class HW4_Part1 {

    public static int numberOfTask = 0;

    public static void taskLine() {
        String taskLeftLine = "\n***************  Task - ";
        String taskRightLine = " ******************\n";
        String line = "+_______________________________+";

        System.out.println(taskLeftLine + (++numberOfTask) + taskRightLine);
    }

    public static void main(String[] args) {

        //Task 1
        taskLine();
        //Task 2
        taskLine();

        //Task 3
        taskLine();
        System.out.println("(2 = 2) && (7 = 7) ---> " + ((2 == 2) && (7 == 7)));
        System.out.println("No (15 < 3) ---> " + (!(15 < 3)));
        System.out.println("(\"Сосна\" = \"Дуб\") ИЛИ (\"Вишня\" = \"Клён\") ---> " + (("Pine" == "Oak")
                || ("Cherry" == "Maple")));
        System.out.println("No(\"Сосна\" = \"Дуб\") ---> " + !("Pine" == "Oak"));
        System.out.println("(No(15 < 3) && (10 > 20) ---> " + (!(15 < 3) && (10 > 20)));

        Boolean checkEys = true;
        Boolean checkLevel = (3 > 2);
        System.out.println("(\"Глаза даны, чтобы видеть\") И (\"Под третьим этажом находится второй этаж\") ---> "
                + (checkEys && checkLevel));

        System.out.println((6 / 2 == 3) || (7 * 5 == 20));


        //Task 4
        taskLine();
        int secunds = 60;
        Boolean minut = (70 != secunds);
        Boolean workClok = true;
        System.out.println("\"В минуте 70 секунд\" ИЛИ \"Работающие часы показывают время\" ---> "
                + "\u001B[32m" + (minut || workClok));

        System.out.println("\u001B[0m");

        System.out.println(" !(28 > 7) И !(300/5) = 60) ---> " + "\u001B[31m" + (!(28 > 7) && !(300 / 5 == 60)));
        System.out.println("\u001B[0m");

        Boolean checkTV = true;
        Boolean checkGlass = false;
        System.out.println("(\"Телевизор - электрический прибор\") И (\"Стекло - дерево\") ---> "
                + "\u001B[31m" + (checkTV && checkGlass));

        System.out.println("\u001B[0m");

        if (!(300 < 100)) {
            System.out.println("\u001B[32m" +"Жажду можно утолить водой\n");
        }

        if (75 < 81)  {
            System.out.println("88 = 88");
        }

        System.out.println("\u001B[0m");

        //Task 5
        taskLine();
        System.out.println("\u001B[0m");

        int andrey = 35;
        int sveta = 30;
        int natasha = 32;
        if ((andrey > sveta) && (natasha > sveta)) {

            System.out.println("Андрей старше Светы. Наташа старше Светы");
        }


        Boolean shelf = true;
        Boolean table = true;
        if (shelf || table) {
            System.out.println("На полке стоят учебники, а на столе лежат справочники.");
        }


        int childrenAll = 100;
        int childrenGirls = 60;
        if (childrenAll / 2 < childrenGirls) {
            System.out.println("Бoльшe детей — девочки. Остальные - мальчики ---> true");
            int allBoys = childrenAll - childrenGirls;
            System.out.println( allBoys);
        }



        //Task 6
        taskLine();

        int age6 = 15;
        if (age6 > 0 && age6 < 16 && age6 < 150) {
            System.out.println("\nYou are " + age6 + " years old.\n"
                    + "Водительские права можно получить, только когда исполнится 16 лет");
        }

        //Task 7
        taskLine();

        //  (Петя не едет в автобусе) && (читает книгу || не смотрит в окно)

        //Task 8
        taskLine();

        Boolean youAndFriend = true;

        if (youAndFriend) {
            System.out.println("Если с другом ты,  это хорошо");
        } else {
            System.out.println("а когда наоборот - плохо");
        }

        //Task 9
        taskLine();

        int age = 89;

        if (age > 0 && age > 18 && age < 150){
            System.out.println("ты взрослый");
            }else {
            System.out.println("Иначе, ты - ребенок.");

              }

//         if (земля сухая){
//            нет дождя.
//          }else {
//              if (земля мокрая){
//                  то идет дождь.
        //        }
 //           }

//        if (земля сухая){
//          нет дождя
//          } else {
//                 if (земля мокрая){
//                      то идет дождь.
//                  } else {
////                       идет снег.
//                       }
//             }


//                if (на небе тучи){
//                      идет дождь
//                 } else {
//                    идет “слепой” дождь.
        //           }

//                if (сегодня суббота) {
//                  завтра воскресенье.
//                  }else {
//                      if(сегодня пятница){
//                          вчера был четверг.
//                       }
//                    }
//               вчера был не четверг, а завтра - не воскресенье

//        if (на горе свистнул рак){
//            значит, прошла вечность
//         }
//         ждите дальше.

//        if ((тебе 18) || (ты закончил школу)) {
//              то ты можешь не жить с родителями
//         }
//         иначе живи с родителями.



    }
}
