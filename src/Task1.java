public class Task1 {

    public static void main(String[] args) {
        int[] array = new int[] {0, 8, 3, 6, -3, 1, 5, 0, 2};

        for (int i = 1; i < array.length; i++)
            if (array[i] < array[0]){
                int min = array[i];
                array[i] = array[0];
                array[0] = min;
            }

        for (int j = array.length - 2; j > -1 ; j--)
            if (array[j] > array[array.length - 1]){
                int max = array[j];
                array[j] = array[array.length - 1];
                array[array.length - 1] = max;
            }

        System.out.println("Task 1: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    
}
