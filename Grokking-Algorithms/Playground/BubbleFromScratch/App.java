public class App {
    public static void main(String[] args) throws Exception {
        //!Variables being tested
        char[] startArray = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        
        //Starting printing
        double start = System.currentTimeMillis();
        System.out.println("*************************Starting***************************");

        //!Print intial variables for comparison
        loopPrintArray(startArray);
        
        //Result printing
        System.out.println("\n**************************Completed****************************");

        //!Print completed test
        System.out.println(bubbleSortArray(startArray));
        double end = System.currentTimeMillis();
        System.out.println("Runtime: " + (end-start)/1000 + " seconds");
        // loopPrint(bubbleSortArray(startArray));
    }

    //!Paste question's method here
    public static char[] bubbleSortArray(char[] arr){
        char[] arr2 = arr;
        int swapCount = 0;
        int loopCounter = 0;

        do {
            char[] arr1 = arr2;
            swapCount = 0;

            // Rest of the sets sorting
            for (int i = 0; i < arr1.length - 1; i++) {
                char b = arr1[i + 1];
                char d = arr1[i];

                if (arr1[i] > arr1[i + 1]) {
                    arr2[i] = b;
                    arr2[i + 1] = d;

                    swapCount++;
                }
            }
            loopCounter++;
            // System.out.print(String.valueOf(swapCount) + " swaps in loop " + loopCounter + "\n");
            // loopPrint(arr2);
        } while (swapCount > 0);
        System.out.println(loopCounter + " swaps");
        return arr2;
    }

    //!Prints array (may need to change array type)
    public static void loopPrintArray(char[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
