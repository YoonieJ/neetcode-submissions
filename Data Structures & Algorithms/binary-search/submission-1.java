class Solution {
    public int search(int[] nums, int target) {
       int index = Arrays.binarySearch(nums, target);
       if (index < 0){
        return -1;
       }
       return index;
    }

    // public static int binarySearch(int[] arr, int target) {
    //     int low = 0;
    //     int high = arr.length - 1;

    //     while (low <= high) {
    //         // Safe calculation to prevent integer overflow
    //         int mid = low + (high - low) / 2; 

    //         if (arr[mid] == target) {
    //             return mid; // Target found
    //         } else if (arr[mid] < target) {
    //             low = mid + 1; // Discard the left half
    //         } else {
    //             high = mid - 1; // Discard the right half
    //         }
    //     }
    //     return -1; // Target does not exist
    // }
}
