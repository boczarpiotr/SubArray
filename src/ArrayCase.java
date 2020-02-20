import java.util.ArrayList;
import java.util.List;

public class ArrayCase {


    public static int indexOfSubArray(int[] array, int[] subArray) {

        List<Integer> list = new ArrayList<>();
        List<Integer> listOfAlreadyAdded = new ArrayList<>();

        for (int i = 0; i < subArray.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (subArray[i] == array[j] && list.size() <= subArray.length && !(listOfAlreadyAdded.contains(i))) {
                    list.add(j);
                    listOfAlreadyAdded.add(i);
                    }
                }
            }

        boolean isInOrder = true;

        for (int i = 1; i < list.size(); i++) {
            if (!(list.get(i) - list.get(i - 1) == 1)) {
                isInOrder = false;
            }
        }

        if (list.size() == subArray.length && isInOrder) {
            return list.get(0);
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array = {1, 3, 0, 9, 90, 3, 89, 90, 3, 1222, 90};
        int[] subArray = {3,9};

        int index = indexOfSubArray(array, subArray);

        System.out.println(index);
    }
}







