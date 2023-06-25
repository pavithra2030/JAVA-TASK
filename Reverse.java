public class Reverse {

    public static void main(String[] args) {
        String str1 = "pavithra";
        String str2 = "";

        for (int i = str1.length() - 1; i >= 0; --i) {
            str2 += str1.charAt(i);
        }

        System.out.println(str2);
    }
}