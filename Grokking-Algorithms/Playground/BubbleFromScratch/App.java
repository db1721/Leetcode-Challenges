public class App {
    public static void main(String[] args) throws Exception {
        char[] startArray = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};

        System.out.println("*************************Starting Array***************************");
        loopPrint(startArray);
        // System.out.println("\n****************************************************************");
        System.out.println("\n**************************Sorted Array****************************");

        //System.out.println(noPrintbubbleSortArray(startArray));
        System.out.println(bubbleSortArray(startArray));
        // loopPrint(bubbleSortArray(startArray));
    }

    public static char[] bubbleSortArray(char[] arr){
        char[] arr2 = arr;
        int swapCount = 0;
        int loopCounter = 0;
        loopPrint(arr2);

        do {
            char[] arr1 = arr2;
            swapCount = 0;

            // Rest of the sets sorting
            for (int i = 0; i < arr1.length - 1; i++) {
                char a = arr2[i];
                char b = arr1[i + 1];
                char c = arr2[i + 1];
                char d = arr1[i];

                if (arr1[i] > arr1[i + 1]) {
                    // int high = arr1[i + 1];
                    // int low = arr1[i + 2];
                    // arr1[i + 1] = arr2[i + 2];
                    // arr1[i + 2] = arr2[i + 1];
                    arr2[i] = b;
                    arr2[i + 1] = d;

                    swapCount++;
                }
            }
            loopCounter++;
            System.out.print(String.valueOf(swapCount) + " swaps in loop " + loopCounter + "\n");
            loopPrint(arr2);
        } while (swapCount > 0);
        return arr2;
    }

    public static char[] noPrintbubbleSortArray(char[] arr){
        char[] arr1 = arr;
        char[] arr2 = arr;
        int swapCount = 0;

        //First set sorting
        if(arr1[0] > arr1[1] && swapCount < 1){
            // char high = arr1[0];
            // char low = arr1[1];
            // arr1[0] = arr2[1];
            // arr1[1] = arr2[0];
            arr2[0] = arr1[1];
            arr2[1] = arr1[0];
            swapCount++;
        }
        // System.out.print("0");

        //Rest of the sets sorting
        for(int i = 2; i < arr.length-2; i+=2){
            // System.out.print(i);
            if(arr1[i] > arr1[i + 1]){
                // int high = arr1[i + 1];
                // int low = arr1[i + 2];
                // arr1[i + 1] = arr2[i + 2];
                // arr1[i + 2] = arr2[i + 1];
                arr2[i] = arr1[i + 1];
                arr2[i + 1] = arr1[i];
                char a = arr2[i];
                char b = arr1[i + 1];
                char c = arr2[i + 1];
                char d = arr1[i];
                
                // System.out.print("\nSince the left is bigger than the right: arr2 @ " + i + " " + a + " becomes " 
                    // + b + " and arr2 @ " + (i+1)  + " " + c +" becomes " + d + "\n");
                
                swapCount++;
            }
        }
        // System.out.print("\n");
        // System.out.print(String.valueOf(swapCount) + " swaps\n");
        return arr2;
    }

    public static void loopPrint(char[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.print("\n");
    }

    public static String[] sortQ(String[] arr1){
        return arr1;
    }
}
