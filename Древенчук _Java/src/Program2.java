public class Program2 {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //String intMyListString = Arrays.toString(intArray);
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] % 2 == 0) {
                System.out.println(myList[i] + " ");
            }
        }
    }
}
