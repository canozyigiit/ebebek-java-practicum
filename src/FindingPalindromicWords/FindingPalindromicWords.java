package FindingPalindromicWords;

public class FindingPalindromicWords {
    public static boolean IsPalindrome(final String str){
        int i = 0;
        int j = str.length() -1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return false;
    }

    public static boolean IsPanlindrome2(final String str){
        String reverse = "";

        for (int i = str.length() -1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(IsPalindrome("can"));
        System.out.println(IsPanlindrome2("hannah"));
    }
}
