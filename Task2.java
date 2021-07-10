import java.util.*;
import java.util.stream.Collectors;
/*

Завдання №2
Створити одновимірний масив та заповнити його випадковими числами.
Реалізувати алгоритм сортування масиву. Перевірити правильність роботи алгоритму, використовуючи існуючі Java інструменти.

 */
public class Task2 {

    private static void bubbleSorter(List<Integer> bubbleSortedArray) {
        for (int i = 0; i < bubbleSortedArray.size(); i++) {
            for (int j = 1 + i; j < bubbleSortedArray.size(); j++) {
                int temp = bubbleSortedArray.get(i);
                if (temp > bubbleSortedArray.get(j)) {
                    int x = bubbleSortedArray.get(j);
                    bubbleSortedArray.set(i, x);
                    bubbleSortedArray.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arraySize = 1000;
        Random random = new Random();
        List<Integer> unsortedArray = new ArrayList<>(arraySize);
        List<Integer> bubbleSortedArray = new ArrayList<>(arraySize);
        List<Integer> collectionsMethodSortedArray = new ArrayList<>(arraySize);
        for (int i = 0; i < arraySize; i++) {
            unsortedArray.add(random.nextInt(arraySize));
        }
        System.out.println("Unsorted array: " + unsortedArray.toString());

        bubbleSortedArray.addAll(unsortedArray);
        bubbleSorter(bubbleSortedArray);
        System.out.println("Bubble sorted array: " + bubbleSortedArray.toString());

        collectionsMethodSortedArray.addAll(unsortedArray);
        //Collections.sort(collectionsMethodSortedArray);
        //System.out.println("Collections method sorted array: " + collectionsMethodSortedArray.toString());
        collectionsMethodSortedArray = collectionsMethodSortedArray.stream().sorted().collect(Collectors.toList());
        System.out.println("Stream API method sorted array: " + collectionsMethodSortedArray.toString());

    }
}
