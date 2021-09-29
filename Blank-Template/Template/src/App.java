package Template.src;

public class App {
    public static void main(String[] args) throws Exception {
        //!Variables being tested
        char[] startArray = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        
        //Starting printing
        double start = System.currentTimeMillis();
        System.out.println("*************************Starting***************************");

        //!Print intial variables for comparison (pick array type and change name)
        loopPrintArrayChar(startArray);
        
        //Result printing
        System.out.println("\n**************************Completed****************************");

        //!Print completed test
        System.out.println(bubbleSortArray(startArray));

        //Prints runtime
        double end = System.currentTimeMillis();
        System.out.println("Runtime: " + (end-start)/1000 + " seconds");
    }

    //!Paste question's method here
    public static char[] bubbleSortArray(char[] arr){
        char[] arr2 = arr;
        //The alogrithm
        return arr2;
    }

    //!Prints array (may need to change array type)
    public static void loopPrintArrayChar(char[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void loopPrintArrayString(String[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void loopPrintArrayInt(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void loopPrintArrayDouble(double[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
