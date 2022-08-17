public class AllCombinations {
    static void fn(int n, int k) {
        int[] input = new int[k + 2];

        for (int i = 0; i < k; i++) {
            input[i] = i + 1;
        }
        input[k] = n+1;
        input[k + 1] = 1;
        int i;
        while (true) {
            printData(input);
            for (i = 0; i < k + 2; i++) {
                if (input[i] + 1 == input[i + 1]) {
                    if (input[i] != i + 1) {
                        input[i] = i + 1;
                    }
                } else
                    break;
            }
            if (i < k) {
                input[i]++;
            } else break;
        }
    }


    static void printData(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        fn(7, 3);
    }
}
