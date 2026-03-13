public class PalindromeChecker4 {
    public static boolean isPalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return isPalindrome(str,start+1,end-1);
    }
    public static void main(String[] args){
        String[] testStrings={"racecar","hello","madam"};
        for (String s:testStrings) {
            boolean result = isPalindrome(s, 0, s.length() - 1);
//            System.out.println(s+"->"+(result ? "Palindrome":"Not a palindrome"));
        }
    }
}
