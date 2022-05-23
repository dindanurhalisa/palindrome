package Stack;

import java.util.Stack;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputKata = "";
        Stack<Character> stack = new Stack<Character>();
        do {
            System.out.print("Kata : ");
            inputKata = in.nextLine();
            for (int i = 0; i < inputKata.length(); i++) {
                stack.push(inputKata.charAt(i));
            }
            StringBuilder reverseString = new StringBuilder();
            while (!stack.isEmpty()) {
                reverseString.append(stack.pop());
            }
            if (inputKata.equals(reverseString.toString()))
                System.out.println("Kata yang diinputkan adalah palindrome");
            else
                System.out.println("Kata yang diinputkan adalah bukan palindrome");
        } while (!inputKata.equals(""));
    }
}
