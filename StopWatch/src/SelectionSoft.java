public class SelectionSoft {
    public static int [] selectionSoft(int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
