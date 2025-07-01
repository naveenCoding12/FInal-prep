package Arrays;

public class ArraySorted {

    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 4, 5};

        boolean isAsec = true;
        boolean isdsec = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isAsec = false;
            }
            if (arr[i] > arr[i - 1]) {
                isdsec = false;
            }
        }
        System.out.println(isAsec || isdsec);
    }
}
