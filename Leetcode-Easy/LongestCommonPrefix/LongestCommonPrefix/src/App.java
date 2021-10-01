public class App {
    public static void main(String[] args) throws Exception{
        String[] strs1 = {"flower","flow","flight"};//"fl"
        String[] strs2 = {"dog","racecar","car"}; //""
        App lcp = new App();
        System.out.println(lcp.longestCommonPrefix(strs1));
        System.out.println(lcp.longestCommonPrefix(strs2));
    }

    public String longestCommonPrefix(String[] strs) {
        char[] commonPrefix = new char[strs.length];
        String prefixString = strs[0];
        int arrayIndex = 0;

        do{
            int tempLength = strs[arrayIndex].length();

            //make comparisons
            for(int i = 0; i<tempLength; i++){
                String tempString = strs[i];
            }
            //count up the array index
            arrayIndex++;
        }
        while(arrayIndex < strs.length);

        //turn prefix char array into string
        for(int i = 0; i < commonPrefix.length; i++){
            prefixString = prefixString + commonPrefix[i];
        }
        return prefixString;
    }
}
