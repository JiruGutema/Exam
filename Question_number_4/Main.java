package Question_Number_4;

public class Main {
    public static void main(String[] args) {
        bubleSort bubblesort = new bubleSort();
        char[] alphabets = {'d', 'b', 'a', 'c', 'e','a'};
        bubblesort.bubbleSort(alphabets);

        System.out.print("Ordered: ");
        for (char ch : alphabets) {
            System.out.print(ch + " ");
        }
    }
}
