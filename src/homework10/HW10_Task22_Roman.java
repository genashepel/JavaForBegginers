package homework10;

public class HW10_Task22_Roman {
    public static String stringIntersection(String firstStr, String secondStr, String thirdStr) {

            firstStr = firstStr.trim().toLowerCase();
            secondStr = secondStr.trim().toLowerCase();
            thirdStr = thirdStr.trim().toLowerCase();

            int start = 0;
            int max = 0;

            for (int i = 0; i < firstStr.length(); i++) {
                for (int j = 0; j < secondStr.length(); j++) {
                    for(int k = 0; k < thirdStr.length(); k++){
                        int x = 0;
                        while((firstStr.charAt(i + x) == secondStr.charAt(j + x))
                            && ((secondStr.charAt(j + x) == thirdStr.charAt(k + x)))){
                            x++;
                            if(((i + x) >= firstStr.length()) || ((j + x) >= secondStr.length())
                                || ((k + x) >= thirdStr.length()))
                                break;
                        }
                        if (x > max){
                            max = x;
                            start = i;
                        }
                    }
                }
            }

            return firstStr.substring(start, (start + max));
    }


    public static void main(String[] args) {
//        System.out.println(stringIntersection("Smaze", "amazing", "amazon"));
//        System.out.println(stringIntersection("Smmazze", "mmazing", "ghMmammazon"));
             System.out.println(stringIntersection("Smmaaaazze", "mmaaaazing", "ghMmammazaaaaon"));
//        System.out.println(stringIntersection("aaaa", "aab", "ab"));
//        System.out.println(stringIntersection("abaaa", "ab", "aba"));
       // System.out.println(stringIntersection("coracorp", "corbcorp", "corccorp"));
//        System.out.println(stringIntersection("corapotr", "corbpotr", "corcpotr"));
//        System.out.println(stringIntersection("corporapotr", "corporbpotr", "corporcpotr"));
//        System.out.println(stringIntersection("corpoapotrc", "corporbpotrc", "corporcpotrc"));
//        System.out.println(stringIntersection("11222333334444", "11a222b3333c4444", "11d222e3333f4444"));
//        System.out.println(stringIntersection("Nosoob", "Schmooze", "Schmooze"));
    }
}
