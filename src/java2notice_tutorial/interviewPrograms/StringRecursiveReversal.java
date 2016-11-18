package java2notice_tutorial.interviewPrograms;


public class StringRecursiveReversal {
    String reverse = "";

    public String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            reverse += str.charAt(str.length() - 1)
                    + reverseString(str.substring(0, str.length() - 1));
            return reverse;
        }
    }


    public static void main(String[] args) {
        StringRecursiveReversal srr = new StringRecursiveReversal();
        System.out.print("Result is: " + srr.reverseString("Java2Notice"));
    }
}