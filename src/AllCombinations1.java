public class AllCombinations1 {
    static void fn(int n, int k) {

        int[] data = new int[k];
        for (int i = 0; i < k; i++) {
            data[i] = i + 1;
        }
        for (int i = k - 1; i>0; i--) {
            printData(data);
            while (data[i]<n) {
                data[i]++;
                printData(data);
            }
            data[i]=data[i-1]+2;
        }


    }

    static void printData ( int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main (String[]args){
        fn(5, 3);
    }
}

