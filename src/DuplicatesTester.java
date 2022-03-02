public class DuplicatesTester {
    public static void main(String[] args) {
        int count = 1;

        Duplicates x = new Duplicates();

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Test " + count);
        System.out.println("Expected Answer: false");
        System.out.println("Actual Answer: " + x.hasDuplicate(arr) + "\n");
        count++;

        int[][] arr2 = {{1, 2, 3}, {4, 3, 6}, {7, 2, 9}};
        System.out.println("Test " + count);
        System.out.println("Expected Answer: true");
        System.out.println("Actual Answer: " + x.hasDuplicate(arr2) + "\n");
        count++;

        int[][] arr3 = {{1, 2, 3}, {1, 4, 6}};
        System.out.println("Test " + count);
        System.out.println("Expected Answer: true");
        System.out.println("Actual Answer: " + x.hasDuplicate(arr3) + "\n");
        count++;

        int[][] arr4 = {{1, 2, 3, 3}, {4, 3, 6, 9}, {7, 0, 9, 1}};
        System.out.println("Test " + count);
        System.out.println("Expected Answer: false");
        System.out.println("Actual Answer: " + x.hasDuplicate(arr4) + "\n");
        count++;

        int[][] arr5 = {{1, 2, 4}, {4, 3, 6}, {7, 0, 3}};
        System.out.println("Test " + count);
        System.out.println("Expected Answer: false");
        System.out.println("Actual Answer: " + x.hasDuplicate(arr5) + "\n");
        count++;

        int[][] arr6 = {{7, 4}, {8, 5}, {7, 0}};
        System.out.println("Test " + count);
        System.out.println("Expected Answer: true");
        System.out.println("Actual Answer: " + x.hasDuplicate(arr6) + "\n");
        count++;

        int[][] arr7 = {{1, 5, 10}, {2, 6, 11}, {0 ,0 ,0}, {9, 5, 1}};
        System.out.println("Test " + count);
        System.out.println("Expected Answer: true");
        System.out.println("Actual Answer: " + x.hasDuplicate(arr7) + "\n");
    }
}
