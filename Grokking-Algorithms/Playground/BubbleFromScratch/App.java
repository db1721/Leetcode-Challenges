public class App {
    public static void main(String[] args) throws Exception {
        char[] startArray = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};

        System.out.println("*************************Starting Array***************************");
        loopPrint(startArray);
        // System.out.println("\n****************************************************************");
        System.out.println("\n**************************Sorted Array****************************");
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
                    arr2[i] = b;
                    arr2[i + 1] = d;

                    swapCount++;
                }
            }
            loopCounter++;
            // System.out.print(String.valueOf(swapCount) + " swaps in loop " + loopCounter + "\n");
            // loopPrint(arr2);
        } while (swapCount > 0);
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
