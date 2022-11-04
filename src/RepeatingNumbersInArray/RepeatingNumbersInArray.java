package RepeatingNumbersInArray;

public class RepeatingNumbersInArray {

    public static boolean isFind(final int[] arr, final int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {33,4,4,5,6,2,7,2};
        int[] duplicate = new int[list.length];
        int startindex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if(!isFind(duplicate,list[i])){
                        duplicate[startindex++] = list[i];
                        break;
                    }
                }
            }
        }

        for (int value: duplicate) {
            if ((value!= 0) && (value % 2 != 1)) {
                System.out.println(value);
            }
        }

    }
}
