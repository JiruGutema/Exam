package Question_Number_4;

public class bubleSort {
        public void bubbleSort(char[] arr) {
            int n = arr.length;
            boolean swapped;

            for (int i = 0; i < n - 1; i++) {
                swapped = false;


                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {

                        char temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                if (!swapped) {
                    break;
                }
            }
        }



}
