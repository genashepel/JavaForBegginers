package homework10;

public class HW10_Task_22 {

    public static String longestCommonSubstring(String one, String second, String third ){
        if((one == null && second == null && third == null)
                || (one.length() <= 0 || second.length() <= 0 || third.length() <= 0)) {
            return "String is Empty or Null";
        }

            one = one.toLowerCase();
            second = second.toLowerCase();
            third = third.toLowerCase();

            String smallestString = one;
            String result = "";
            String tempResult = "";

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
                //if(second.indexOf(subString) != - 1 && third.indexOf(subString) != -1){
                if(one.contains(subString) && second.contains(subString) && third.contains(subString)){
                    result =  subString;
                } else {
                    j = i; //j++ was my misteyk
                    if(tempResult.length() < result.length()){//Dobavil etu proverku tak kak bez nee ne rabotaet
                        tempResult = result;                   //v sluche "corapotr", "corbpotr", "corcpotr"
                    }
                }
            }

            if(tempResult.length() > result.length()){
                return tempResult;
            } else {
                return result;
            }
    }

    public static void main(String[] args) {
//        System.out.println(longestCommonSubstring("Smaze", "amazing", "amazon"));
//        System.out.println(longestCommonSubstring("Smmazze", "mmazing", "ghMmammazon"));
//        System.out.println(longestCommonSubstring("Smmaaaazze", "mmaaaazing", "ghMmammazaaaaon"));
//        System.out.println(longestCommonSubstring("aaaa", "aab", "ab"));
//        System.out.println(longestCommonSubstring("abaaa", "ab", "aba"));
//        System.out.println(longestCommonSubstring("coracorp", "corbcorp", "corccorp"));
        System.out.println(longestCommonSubstring("corapotr", "corbpotr", "corcpotr"));
//        System.out.println(longestCommonSubstring("corporapotr", "corporbpotr", "corporcpotr"));

    }
}
