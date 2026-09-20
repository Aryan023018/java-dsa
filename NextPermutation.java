import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] A) {

        int n = A.length;

        // Step 1: Find the pivot
        int pivot = -1;

        for (int i = n - 2; i >= 0; i--) {

            if (A[i] < A[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If no pivot, array is in descending order
        // So reverse the complete array
        if (pivot == -1) {
            reverse(A, 0, n - 1);
            return;
        }

        // Step 2: Find the next larger element
        // and swap it with pivot
        for (int i = n - 1; i > pivot; i--) {

            if (A[i] > A[pivot]) {

                int temp = A[i];
                A[i] = A[pivot];
                A[pivot] = temp;

                break;
            }
        }

        // Step 3: Reverse the elements
        // after the pivot
        reverse(A, pivot + 1, n - 1);
    }

    private void reverse(int[] A, int i, int j) {

        while (i < j) {

            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        NextPermutation obj = new NextPermutation();

        int[] A = {1, 2, 3};

        obj.nextPermutation(A);

        System.out.println("Next Permutation: "
                + Arrays.toString(A));
    }
}
