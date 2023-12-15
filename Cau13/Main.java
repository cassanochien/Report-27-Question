package Cau13;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void reseverQueue(int number) {
        Queue<Integer> myQueue = new PriorityQueue<Integer>();
        System.out.print(number + " So dao nguoc: ");
        while (number > 0) {
            myQueue.add(number % 10);
            number = number / 10;
            System.out.print(myQueue.peek());
        }
        System.out.println();
    }

    private static void reverseQueue1(int number) {
        Queue<Integer> myQueue = new LinkedList<>();
        while (number > 0) {
            myQueue.add(number % 10);
            number = number / 10;
        }
        System.out.println("myQueue : " + myQueue);
        int numberResever = 0;
        System.out.print("In ra myQueue: ");
        for (Integer i : myQueue) {
            numberResever = numberResever * 10 + i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("So dao nguoc: " + numberResever);
    }

    public static void main(String[] args) {
        System.out.println("Cach 1: ");
        reseverQueue(1234567);
        System.out.println("Cach 2:");
        reverseQueue1(1234567);
    }
}