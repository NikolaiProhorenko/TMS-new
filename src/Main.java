import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
     //   arrayPlus ();
     //   shessBoard();
     //   arraySum ();
      //  sort ();

    }
    static void arrayPlus () {
        //Создать двухмерный массив из целых чисел.
        //С помощью циклов "пройти" по всему массиву и увеличить каждый
        //элемент на заданное число. Пусть число, на которое будет
        //увеличиваться каждый элемент, задается из консоли.
        int[][] symbol = {
                {5,5,2},
                {11,48,6},
                {16,14,4}};
        Scanner numbers = new Scanner(System.in);
        System.out.print("Enter how mach you want + :");
        int base = numbers.nextInt();
        numbers.close();
        for (int a = 0; a < symbol.length; a++ )
        {  for ( int b =0; b < symbol.length; b++)
        { symbol[a][b] += base;
        }}

        for (int a = 0; a < symbol.length; a++)
        { for (int b =0; b < symbol.length; b++)
            System.out.print(symbol [a][b] + " ");
            System.out.println();
        }
    }
    static void shessBoard() {
        //Шахматная доска
        //Создать программу для раскраски шахматной доски с помощью цикла.
        //Создать двумерный массив String'ов 8х8. С помощью циклов задать
        //элементам циклам значения B(Black) или W(White).

        Scanner number = new Scanner(System.in);
        System.out.println("Выбирете размер доски: ");
        if (number.hasNextInt()) {
            int num1 = number.nextInt();
            int num2 = number.nextInt();

            for (int i = 0; i < num1; i++) {
                for (int j = 0; j < num2; j++)
                    if ((i + j) % 2 == 0)
                        System.out.print(" W ");
                    else
                        System.out.print(" B ");
                System.out.println();
            }
        }
    }



    static void arraySum () {
        //Создайте двумерный массив целых чисел. Выведите на консоль сумму
        //всех элементов массива.
        int[][] myArray = {
                {1, 2, 3,55},
                {7, 8, 9}};
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        scanner.close();

        for (int a = 0; a < myArray.length; a++) {
            for (int b = 0; b < myArray[a].length; b++)
                sum += myArray[a][b];

            System.out.print("We take your arrays : " + sum);
            System.out.println();

        }
    }


    static void sort () {
        // Создайте двумерный массив целых чисел. Отсортируйте элементы в
        // строках двумерного массива по возрастанию

        int [][] mySort = {
                {1,8,9,25,88,54},
                {22,4,89,128,-4,5,-9}};
        System.out.println();
        for (int[] a : mySort ) {
            Arrays.sort(a);
            System.out.println("We take :" + Arrays.toString(a));
        }
    }
}