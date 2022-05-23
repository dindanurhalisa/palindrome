package Stack;

import java.util.Stack;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = "";
        Stack<Character> stack = new Stack<Character>();

        do {
            System.out.print("Kata : ");
            inputString = in.nextLine();
            for (int i = 0; i < inputString.length(); i++) {
                stack.push(inputString.charAt(i));
            }

            StringBuilder reverseString = new StringBuilder();

            while (!stack.isEmpty()) {
                reverseString.append(stack.pop());
            }

            if (inputString.equals(reverseString.toString()))
                System.out.println("The input String is a palindrome.");
            else
                System.out.println("The input String is not a palindrome.");
        } while (!inputString.equals(""));
    }
}
