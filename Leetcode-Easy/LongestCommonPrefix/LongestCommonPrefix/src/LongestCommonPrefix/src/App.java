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
        int stringsToCompare = strs.length;
        
        //build first prefix
        String prefixString = strs[0];
        String newPrefixString = "";
        
        //loop through all elements
        for(int i = 0; i < (stringsToCompare-1); i++){
                String initialPrefix = strs[i];
                
                //compare prefix to other elements
                for(int j = 0; j<prefixString.length()-2;j++){
                    if(strs[i].charAt(j) != prefixString.charAt(j))
                        System.out.println(strs[i].charAt(j));
                        //newPrefixString.substring(i, i)
                    }
                newPrefixString=prefixString;
         }
        return prefixString;
    }
}
