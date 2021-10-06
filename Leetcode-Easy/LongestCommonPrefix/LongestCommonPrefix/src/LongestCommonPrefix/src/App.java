package LongestCommonPrefix.src;

public class App {
    public static void main(String[] args) throws Exception{
        String[] strs1 = {"flower","flow","flight", "flop"};//"fl"
        String[] strs2 = {"dog","racecar","car"}; //""
        String[] strs3 = {"grand","grapple","grades", "gradiant", "gradual"};//"grad"
        App lcp = new App();
        System.out.println(lcp.longestCommonPrefix(strs1));
        System.out.println(lcp.longestCommonPrefix(strs2));
        System.out.println(lcp.longestCommonPrefix(strs3));
    }

    public String longestCommonPrefix(String[] strs) {
        //int stringsToCompare = strs.length;
        String initialPrefix = strs[0];
        String prefixString = "";
        
        for(int i = 0; i <initialPrefix.length(); i++){
            if(initialPrefix.charAt(i) == strs[i].charAt(i)){
                prefixString = prefixString + initialPrefix.charAt(i);
            }
            
         }
        return prefixString;
    }
}
