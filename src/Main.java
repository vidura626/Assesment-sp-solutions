import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //==================Problem 01===================
        Problem_01 problem1 = new Problem_01();

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("====================Problem 1==========================");
        int sumOfTheNumbersForGivenListUsingForLoop = problem1.sumOfTheNumbersForGivenListUsingForLoop(list);
        System.out.println("Sum of the number using for loop : " + sumOfTheNumbersForGivenListUsingForLoop);

        int sumOfTheNumbersForGivenListUsingWhileLoop = problem1.sumOfTheNumbersForGivenListUsingWhileLoop(list);
        System.out.println("Sum of the numbers using while loop : " + sumOfTheNumbersForGivenListUsingWhileLoop);

        int sumOfTheNumbersUsingRecursion = problem1.sumOfTheNumbersForGivenListUsingRecursion(list, 0);
        System.out.println("Sum of the numbers using recursion : " + sumOfTheNumbersUsingRecursion);


        //==================Problem 02===================
        List<Object> listString = new ArrayList<Object>();
        listString.add("a");
        listString.add("b");
        listString.add("c");
        listString.add("d");
        listString.add("e");

        List<Object> listInteger = new ArrayList<Object>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        System.out.println("====================Problem 2==========================");
        Problem_02 problem2 = new Problem_02();
        List<Object> combinedList = problem2.combineTwoLists(listString, listInteger);
        System.out.println("Combined Two Lists ");
        System.out.println(combinedList);


        //==================Problem 03===================
        System.out.println("====================Problem 3==========================");

        Problem_03 problem3 = new Problem_03();
        List<Integer> integers = problem3.calculateFirst100FibbonacciNumbers();
        System.out.println("First 100 Fibonacci Numbers : " + integers);

        List<Integer> listToFIndFormedLargestNumber = new ArrayList<Integer>();
        listToFIndFormedLargestNumber.add(50);
        listToFIndFormedLargestNumber.add(2);
        listToFIndFormedLargestNumber.add(1);
        listToFIndFormedLargestNumber.add(9);

        //==================Problem 04===================
        System.out.println("====================Problem 4==========================");

        Problem_04 problem4 = new Problem_04();
        Integer formedLargestNumbersOfTheArray = problem4.findFormedLargestNumbersOfTheArray(listToFIndFormedLargestNumber);
        System.out.println("Formed Largest Number for array : " + formedLargestNumbersOfTheArray);

        //==================Problem 05===================
        Problem_05 problem5 = new Problem_05();
        int target = 100 - (1 + 2 + 9); // 88
        int[] nums = {1,2,3, 4, 5, 6, 7, 8, 9};

        List<List<Integer>> results = new ArrayList<>();
        problem5.findCombinations(nums, target, 0, new ArrayList<>(), results);

        for (List<Integer> combination : results) {
            System.out.println("1 + 2 + " + combination + " + 9 = 100");
        }
        System.out.println("Total solutions: " + results.size());
    }
}