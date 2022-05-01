package homework10;

public class HW10 {

    public static String capitalizeWords(String sentence){

        sentence = sentence.trim();
        
        if(sentence != null && sentence.length() != 0 ){
            //System.out.println(sentence);
            sentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1);

            for(int i = 1; i < sentence.length(); i++){
                if(sentence.charAt(i) == ' '){
                    sentence = sentence.substring(0, i + 1)
                            + sentence.substring(i + 1, i + 2).toUpperCase()
                            + sentence.substring(i + 2);
                }

            }
            return sentence;
        }

        return "";
    }

    public static void main (String[] args){

        System.out.println(capitalizeWords("happy    birthday"));
    }
}
