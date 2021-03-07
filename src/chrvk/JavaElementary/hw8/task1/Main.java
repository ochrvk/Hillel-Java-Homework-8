/*
Число Фибоначи
написать метод который возвращает N-ное число фибоначи,
по правилу:
F(0) = 0, F(1) = 1
F(N) = F(N - 1) + F(N - 2)
*/
package chrvk.JavaElementary.hw8.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Какое число вы хотите получить?: ");
        int n = in.nextInt();
        System.out.println(returnNum(n));
    }

    public static int returnNum(int n) {
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                array[i] = i;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array[n - 1];
    }
}
