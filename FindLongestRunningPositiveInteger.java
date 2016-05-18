public class FindLongestRunningPositiveInteger {
    public static void main(String[] args) {
        int[] array = {2, -3, 2, 3, 4, -6, 1, 2, 3, 4, 5, -8, 5, 6};

        int length = array.length;

        int startingIndex = 0;

        int counter1 = 0;

        int counter2 = 0;

        for (int i = 0; i <=(length-1); i++) {

            if (array[i] > 0) {
                counter1++;
            }
                else if (array[i] < 0)
            {
                System.out.println("Found a negative number and comparing the lengths");
                if (counter1 > counter2) {
                    startingIndex = i - counter1;
                    counter2 = counter1;
                }
                counter1 = 0;
            }
        }

        System.out.println("the longest running postive integer starting at index " + startingIndex);
        System.out.println("The longest running postive integer sequence");

        for (int i = startingIndex; i <= (startingIndex + counter2-1); i++) {
            System.out.println(array[i]);
        }
    }

}
