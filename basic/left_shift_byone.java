// Input: nums = [1, 2, 3, 4, 5]

// Output: [2, 3, 4, 5, 1]

// Explanation: Initially, nums = [1, 2, 3, 4, 5]

// Rotating once to left -> nums = [2, 3, 4, 5, 1]

class Main{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int temp = arr[0]; // Save first element

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i]; // Shift left
        }

        arr[arr.length - 1] = temp; // Place first element at end

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}