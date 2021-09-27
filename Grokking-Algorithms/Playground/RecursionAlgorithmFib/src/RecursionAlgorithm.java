public class RecursionAlgorithm {
    public static void main(String[] args) {

        // create some dummy data for our method
        int size = 26;

        // invoke methods here
        RecursionAlgorithm ra = new RecursionAlgorithm();

        ra.fibonacci(size);

    }

    // create methods here
    public int[] fibonacci(int size) {
        int[] fib = new int[size];
        for(int i = 0; i < size; i++){
            if(i == 0){
                fib[i] = 0;
            }
            else if(i == 1){
                fib[i] = 1;
            }
            else{
                fib[i] = fib[(i-1)] + fib[(i-2)];
            }
            
        }
        loopPrint(fib);
        return fib;
    }

    public static void loopPrint(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "-");
        }
        System.out.print("\n");
    }
}
