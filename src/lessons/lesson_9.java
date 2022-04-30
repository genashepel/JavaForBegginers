package lessons;

public class lesson_9 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";

        System.out.println(str1 + space + str2 + space + str3);

        String str4 = str1 + space + str2 + space + str3;
        System.out.println(str4);

        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(4));

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == 'a') {
                System.out.println(i + " ---> " + str4.charAt(i));
                System.out.println(str4.indexOf('a', i));

            } else {
                System.out.println(i + " ---> " + "Letter is not a");
            }
        }
        System.out.println((char) ('i' - 1));
        System.out.println(" ");
        System.out.println("Hi Gena");
    }
}
