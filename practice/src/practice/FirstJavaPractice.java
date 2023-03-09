/**
 * Name: Alessandro Allegranzi
 * BU Email: aallegra@bu.edu
 */
package practice;

import java.util.*;

/**
 * ---------------------------------------------------------
 *                          INSTRUCTIONS
 * ---------------------------------------------------------
 * Complete the twoSum method and add at least 1 new test case.
 * Make sure your full name and BU email are filled in at the top of the file
 * When run, all test cases should print true.
 * You only need to write code in the 2 YOUR CODE HERE areas
 *
 * Some basic syntax info:
 * This is a block comment, used for commenting classes and methods
 * // is a single line comment
 */
public class FirstJavaPractice {
    /**
     * 2Sum Problem Statement
     * Given an array of integers nums and an integer target, find the two integers that add up to a target.
     * The answer should be returned as an array of the two indices into the array
     * EXAMPLE: Nums = [3,4,5,10] Target = 13
     * 3 (index 0) + 10 (index 3) = 13
     * Return [0, 3] or [3, 0]
     * Assume that there is at most 1 solution
     * Return the answer in any order as an array of 2 values.
     * Return null if there is no solution
     * @param nums array of integers
     * @param target integer target value
     */
    public static int[] twoSum(int[] nums, int target) {
        // YOUR CODE HERE
        // HINT: One possible solution is to try looking at every pair of numbers using a double for loop
        int[] solution = new int[0];

        for (int i = 0; i < nums.length; i++ ) {
            for (int j = 0; j < nums.length; j++) {
                if (i ==j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    solution = new int[] {i, j};
                }
            }
        }

        if (solution.length == 0) {
            return null;
        }
        return solution;
    }

    // The main method in Java is run when the file is run, so it is a great place to put testing code
    public static void main(String[] args) {
        // In Java, we have to declare variables
        int[] nums;     // this is an integer array declaration
        int[] result;
        int[] answer;

        // Test 1
        nums = new int[] {1, 3, 7};     // this instantiates a new integer array [1, 3, 7]
        result = twoSum(nums, 8);
        answer = new int[] {0, 2};
        // %s lets us insert a variable into a formatted string and %n is a new line char
        System.out.printf("Passed test 1: %s%n", checkAnswer(result, answer));

        // Test 2
        nums = new int[] {1, 4, 6};
        result = twoSum(nums, 8);
        answer = null;
        System.out.printf("Passed test 2: %s%n", checkAnswer(result, answer));

        // Test 3
        nums = new int[] {1, 4, 4, 8};
        result = twoSum(nums, 8);
        answer = new int[] {1, 2};
        System.out.printf("Passed test 3: %s%n", checkAnswer(result, answer));

        // YOUR CODE HERE
        // Test 4
        nums = new int[] {1, -2, 3, 4};
        result = twoSum(nums, 2);
        answer = new int[] {1, 3};
        System.out.printf("Passed test 4: %s%n", checkAnswer(result, answer));

        // Test 5
        nums = new int[] {1, 2, 3, 4};
        result = twoSum(nums, 56);
        answer = null;
        System.out.printf("Passed test 5: %s%n", checkAnswer(result, answer));

        // Test 6
        nums = new int[] {0};
        result = twoSum(nums, 7);
        answer = null;
        System.out.printf("Passed test 6: %s%n", checkAnswer(result, answer));
    }

    /**
     * This is a helper method for testing that checks answers.
     * This is what I used to write the tests provided
     * @param result: Provided answer from twoSum
     * @param answer: Hard-coded correct answer
     * @return true if result has the same values as answer, else false
     */
    public static boolean checkAnswer(int[] result, int[] answer) {
        // If there is no answer, check that the result is null
        if (answer == null) {
            return result == null;
        }
        // Answer can be in either order
        int[] answerAlternate = new int[] {answer[1], answer[0]};
        // Check if result is either the answer or the answer reversed
        // || is or in java
        return Arrays.equals(result, answer) || Arrays.equals(result, answerAlternate);

    }
}
