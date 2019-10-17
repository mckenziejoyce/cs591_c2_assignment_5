public class problem4 {

  //Team Member: Sean Chun
  //Code Citation: https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/

 // Problem 4 (First missing positive integer):
  //  Given an unsorted integer array, find the smallest missing positive
 //   integer. You must use TDD to develop your solution.


  //Code Citation: https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/

  /* Utility function that puts all non-positive
  (0 and negative) numbers on left side of
  arr[] and return count of such numbers */

  public static int segregate(int arr[], int size) {
      int j = 0, i = 0;
        while(i< size) {
          if (arr[i] <= 0) {
              int temp;
              temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              j++;
          }
          i++;
      }
      return j;
  }


  /* Find the smallest positive missing
  number in an array that contains
  all positive integers */
  //code citation: https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/
  public static int findMissingPositive(int arr[], int size) {
   // Mark arr[i] as visited by making
   // arr[arr[i] - 1] negative. Note that
   // 1 is subtracted because index start
   // from 0 and positive numbers start from 1
   for (int i = 0; i < size; i++) {
       int x = Math.abs(arr[i]);
       if (x - 1 < size && arr[x - 1] > 0)
           arr[x - 1] = -arr[x - 1];
   }
   // Return the first index value at which
   // is positive
   for (int i = 0; i < size; i++)
       if (arr[i] > 0)
           return i + 1; // 1 is added becuase indexes
   // start from 0
   return size + 1;
}

  /* Find the smallest positive missing
  number in an array that contains
  both positive and negative integers */
  //code citation: https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/
  public static int findMissing(int arr[], int size) {
   // First separate positive and
   // negative numbers
   int shift = segregate(arr, size);
   int arr2[] = new int[size - shift];
   int j = 0;
   for (int i = shift; i < size; i++) {
       arr2[j] = arr[i];
       j++;
   }
   // Shift the array and call
   // findMissingPositive for
   // positive part
   return findMissingPositive(arr2, j);
}

  public static void main(String[] args)
  {
    //Inital test check: make sure individual functions work
    //Test segregate function
    int array[] = {-1, -4, -3, -5, -6, -7};
    int count = segregate(array, array.length);
    System.out.println("Count is " + count); //answer should be 6

    //Test findMissingPositives: returns the missing positive number
    int arr[] = {3, 4, 1, 2, 5, 7};
    int number = findMissingPositive(arr, arr.length);
    System.out.println("index is  " + number); //answer should be 6


  //Final Test Check: combines segregate and findMissingPositiveNumbers
  //test case 1: check an array with all negative integers
    int negatives[] = {-1, -4, -3, -5, -6, -7};
    int negs_size = negatives.length;
    int outs = findMissing(negatives, negs_size);
    System.out.println("The smallest positive missing number is " + outs); //answer should be 1

  //test case 1: check an array with all positive integers
    int positives[] = {5, 3, 2, 1,};
    int pos_size = positives.length;
    int y = findMissing(positives, pos_size);
    System.out.println("The smallest positive missing number is " + y); //answer should be 4

  //test case 3: check an array with positive and negative integers
    int both[] = { 0,1, 10, 2, -10, -20 };
    int both_size = both.length;
    int b = findMissing(both, both_size);
    System.out.println("The smallest positive missing number is " + b); //answer should be 3

  }

}
