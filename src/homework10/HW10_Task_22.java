package homework10;

public class HW10_Task_22 {

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
                    j++;//
                }

            }

            return result;
        }

        return "String is Empty or Null";
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubstring("Smaze", "amazing", "amazon"));
        System.out.println(longestCommonSubstring("Smmazze", "mmazing", "ghMmammazon"));
        System.out.println(longestCommonSubstring("Smmaaaazze", "mmaaaazing", "ghMmammazaaaaon"));
    }
}
