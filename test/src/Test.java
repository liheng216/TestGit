public class Test {
//    public static void main(String[] args) {
//        String s = "hello";
//        String str = reverse(s);
//        System.out.print(str);
//    }
//
//
//    public static String reverse(String originStr) {
//        if(originStr == null || originStr.length() <= 1)
//            return originStr;
//        return reverse(originStr.substring(1)) + originStr.charAt(0);
//    }
//反转字符串
public static String reverseString(String s){
    if(s.isEmpty()) return s;
    return reverseString(s.substring(1))+s.charAt(0);
}

    public static void main(String[] args) {
        System.out.println(reverseString("123456789"));
    }
}
