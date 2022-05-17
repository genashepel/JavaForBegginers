package homework10;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

import static utils.Utils.*;
public class HW10 {

    public static String capitalizeWords(String sentence) {

        sentence = sentence.trim();

        if (sentence != null && sentence.length() != 0) {
            //System.out.println(sentence);
            sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);

            for (int i = 1; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    sentence = sentence.substring(0, i + 1)
                            + sentence.substring(i + 1, i + 2).toUpperCase()
                            + sentence.substring(i + 2);
                }

            }
            return sentence;
        }

        return "";
    }

    //Task 9
    public static String returnSubstring(String str, int par){
        return str.substring(str.indexOf(par), str.lastIndexOf(par) + 1);

    }

    public static String removeSpace(String str) {
        String result = "";
        if (str.isEmpty()) {
            return "String was empty";
        }

        result = str.trim();

        if (!str.equals(result)) {
            return "All Spaces was deleted";
        }
        return "There were not spaces";
    }

    public static String removeAlla(String str){
        if(str.length() == 0){
            return "Invalid";
        }
        return str.replaceAll("a", "").trim();
    }

    //Task3
    public static String removeAllZeros(String str){

        if(str.length() != 0  && str != null){
            return str
                    .replace(" ", "")
                    .replace("0", "")
                    .trim();
        }
        return"";
    }
    //Task4
    public static String removeAllSpaces(String str){
        if(str != null && str.length() > 0){
            str = str.trim();
            return str.replace(" ", "");
        }
        return"";
    }
    //Task5
    public static int counAOra (String str){
        int count = 0;
        str = str.trim();
        char[] arr = str.toCharArray();
        if(str != null && str.length() > 0){
            str = str.toLowerCase();
            for(int i = 0; i < str.length(); i++){
                if(arr[i] == 'a' || arr[i] == 'A'){
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
    //Task5_1
    public static int counAOra1(String str){
        return str.length()
                - str.toLowerCase()
                .replace("a", "")
                .length();
    }

    //Task 6
    public static boolean serchWordJava(String str){
        if(str != null && str.length() > 0){
            if(str.indexOf("Java") != -1){
                return true;
            }
        }
        return false;
    }

    //Task 7
    public static String addSimvols (String str){
        if(str != null && str.length() > 0){
            str  = str.trim();
//            str = str.concat("\".");
//            return "\"" + str;
             return "\"" + str + ".\"";
        }
        return "";
    }
    //Task 8
    public static String capitalizeFirstLatter(String str){
        if(str != null){
            str = str.trim();
            if(str.length() != 0) {
                return str.substring(0, 1)
                        .toUpperCase()
                        .concat(str.substring(1)
                                .toLowerCase());
            }
            return "";
        }
        return "";
    }
    //Task 9
    public static String returnSubstring(String str, String par){
        return str.substring(str.indexOf(par), str.lastIndexOf(par) + 1);

    }

    //Task 10
    public static boolean equalStartEndLatters(String str){
        if(str != null && str.length() > 0){
            str = str.trim().toLowerCase();
            return str.substring(0, 1).equals(str.substring((str.length() - 1)));
        }
        return false;
    }
    //Task 11
    public static String[] changeStringToArrayString(String str){
        if(str != null && str.length() > 0){
            return str.split(" ");
        }
        return new String[]{};
    }

    //Task20
    public static String removeDuplicates(String str){
        if(str == null || str.length() <= 0){
            return "Stroka Null or Empty";
        }
        str = str.toLowerCase();
        String result = "";
        for(int i = 0; i < str.length(); i++) {

            if(!(result.contains(str.substring(i, i + 1)))){ //esli v stroke result net tekushey bukvi
                                                                // --> zapisat v result etu bukvu
                result = result + str.substring(i, i + 1);
            }
        }
        return result;
    }

    //Task 21
    public static String stringIntersection(String str1, String str2){
        if(str1 == null || str2 == null || str1.length() <= 0 || str2.length() <= 0){
            return "Stroka is Empty or Null";
        }

        String result = "";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        String smallestString = str1;
        if(str1.length() > str2.length()){
            smallestString = str2;
        }
        int j = 0;
        String subString = "";
        for (int i =0; i < smallestString.length(); i++){
            subString = smallestString.substring(j, i + 1);
            if(str2.contains(subString)){
                result = subString;
            }else {
                j++;
            }
        }
        return result;
    }

    //Task 22
    public static String longestCommonSubstring(String one, String second, String third ){
       if((one != null && second != null && third != null)
               || (one.length() > 0 && second.length() > 0 && third.length() > 0)){

           one = one.toLowerCase();
           second = second.toLowerCase();
           third = third.toLowerCase();

           String smallestString = one;
           String result = "";

           if(smallestString.length() > second.length()){
               smallestString = second;
           }
           if (smallestString.length() > third.length()){
               smallestString = third;
           }
           String subString = "";
           int j = 0;
           for(int i = 0; i < smallestString.length(); i++){
              subString = smallestString.substring(j, i + 1);
              if(second.indexOf(subString) != - 1 && third.indexOf(subString) != -1){
                  result =  subString;
              } else {
                  j++; //Uvelichm j esli sledushaya bookva ne ravna, substring udalit first latter (1 to 2(3,4,5)
              }
                // inache j ostanetsya temje and  substring uje budet is 2 bookv ( j = 0 to 2(3,4,5))
           }

           return result;
       }

        return "String is Empty or Null";
    }


    public static void main(String[] args) {

      taskLine();

       // System.out.println(capitalizeWords("happy    birthday"));

//        “    QA4Everyone   “ → “Лишние пробелы удалены”
//“QA4Everyone“ → “Пробелов не было”
//“” → “Строка пустая”
        String strTest = "    QA4Everyone   ";
        String strTestNoSpace = "QA4Everyone";
        String strTestIsEmpty = "";


        System.out.println(removeSpace(strTest));
        System.out.println(removeSpace(strTestNoSpace));
        System.out.println(removeSpace(strTestIsEmpty));

        taskLine();

        System.out.println(removeAlla("   QA4Everyone   "));
        System.out.println(removeAlla("panda   "));

        //Task 3
        taskLine();
        System.out.println(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(removeAllZeros(" 0000000111"));

        //Task4
        taskLine();
        System.out.println(removeAllSpaces("    QA   4  Everyone   "));
        System.out.println(removeAllSpaces("p a     n d a   "));


        //Task 5
        taskLine();
        System.out.println(counAOra1("AbracAAdabra"));
        System.out.println(counAOra1("Homenum Revelio"));
        System.out.println(counAOra1(""));

        //Task 6
        taskLine();

        System.out.println(serchWordJava("As of March 2022, Java 18 is the latest version, while Java 17, " +
                "11 and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost " +
                "public update for the legacy version Java 8 LTS in January 2019 for commercial use, although it " +
                "will otherwise still support Java 8 with public updates for personal use indefinitely. Other " +
                "vendors have begun " +
                "to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades."));

        System.out.println(serchWordJava(""));
        System.out.println(serchWordJava("As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me"));

        //Task 7
        taskLine();
        System.out.println(addSimvols("One"));
        System.out.println(addSimvols("TWO"));

        //Task 8
        taskLine();
        System.out.println(capitalizeFirstLatter("ташкент"));
        System.out.println(capitalizeFirstLatter("ЧикаГО"));

        //Task 9
        taskLine();
        System.out.println(returnSubstring("Abracadabra", "b"));
        System.out.println(returnSubstring("Whippersnapper", "p"));

        //Task10
        taskLine();
        System.out.println(equalStartEndLatters("Abracadabra"));
        System.out.println(equalStartEndLatters("Whippersnapper"));

        //Task 11
        taskLine();

        System.out.println(Arrays.toString(changeStringToArrayString("QA for Everyone")));
        System.out.println(Arrays.toString(changeStringToArrayString("Александр Сергеевич Пушкин")));

        taskLine();
        taskLine();
        taskLine();
        taskLine();
        taskLine();
        taskLine();
        taskLine();
        taskLine();


        //Task20
        taskLine();

        System.out.println(removeDuplicates("AABBCCaabbcc"));
        System.out.println(removeDuplicates("AAhBBtCCa abbtchc n"));
        System.out.println(removeDuplicates(""));

        //Task 21
        taskLine();

        System.out.println(stringIntersection("Carrot", "carwash"));
        System.out.println(stringIntersection("Noob", "Schmooze"));
        System.out.println(stringIntersection("a", null));
        System.out.println(stringIntersection("a", ""));

        //Task 22
        taskLine();

        //System.out.println(longestCommonSubstring("Smaze", "amazing", "amazon"));
        System.out.println(longestCommonSubstring("Smmazze", "mmazing", "ghMmammazon"));

    }
}
