import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //numbers();
        //deliteNumber();
        getRandomerNumer();
        // minMaxArray();
    }

    static void numbers() {

        //Создайте массив целых чисел. Напишете программу, которая выводит
        //сообщение о том, входит ли заданное число в массив или нет. Пусть
        //число для поиска задается с консоли (класс Scanner)
        Scanner MyNumber = new Scanner(System.in);

        System.out.print("Enter number: ");
        int[] number = new int[] {1,3,5,7,9};
        int Number = MyNumber.nextInt();
        int ArrayElement;
        int place=0;

        for (int index = 0; index < number.length; index++) {
            ArrayElement = number[index];
            if (ArrayElement == Number)
                place++;}
        if (place>0){
            System.out.println("Число входит в массив");}
        else {
            System.out.println("Число не входит в массив");
            //      MyNumber.close();
        }

    }

    static void deliteNumber() {
        //Создайте массив целых чисел. Удалите все вхождения
        // заданного числа из массива.
        //Пусть число задается с консоли (класс Scanner). Если такого числа нет
        //- выведите сообщения об этом.
        //В результате должен быть новый массив без указанного числа.

        Scanner numbers = new Scanner(System.in);
        System.out.print("Введите размер массива :");
        int base = numbers.nextInt();
        int[] array = new int[base];

        System.out.println("Введите элементы массива :");
        for (int a = 0; a < base; a++)
        {
            array[a] = numbers.nextInt();
        }
        System.out.print("Введите элемент который хотите удалить :");
        int deliteNumber = numbers.nextInt();
        int newBase = 0;
        for (int a = 0; a < base; a++)
        {
            if (array[a] != deliteNumber)
            {
                array[newBase++] = array[a];
            }
        }
        if (newBase == 0)
        {
            System.out.println("Массив пустой");
        } else
        {
            System.out.print("Массив без числа равен :");
            for (int a = 0; a < newBase; a++)
            {
                System.out.print(array[a] + " ");
            }
            //  numbers.close();

        }

    }

    static void getRandomerNumer() {
        //Cоздайте и заполните массив случайным числами и выведете
        //максимальное, минимальное и среднее значение.
        //Для генерации случайного числа используйте метод Math.random().
        //Пусть будет возможность создавать массив произвольного
        //размера. Пусть размер массива вводится с консоли.

        Scanner numbe = new Scanner (System.in);
        System.out.println();
        System.out.println("Print numbers array :");

        int base = numbe.nextInt();
        Random newNumbers = new Random();
        {
            int[] ar = new int[base];
            for (int a = 0; a < base; a++)
            {
                ar [a] = newNumbers.nextInt(10);
                System.out.println();
                System.out.println("Our number "+ ar[a]);

                {
                    int min = ar[a];
                    {
                        min = Math.min(min, ar[a]);
                        System.out.println("Min array number is: " + min);}

                    int max = ar[a];
                    {
                        max = Math.max(max, ar[a]);
                        System.out.println("Max array number is: " + max);}

                    int average = 0;
                    {
                        average += ar[a];
                        double Average = (double) average / base;
                        System.out.println("Average numbers is: " + Average);}
                    System.out.println();
                    numbe.close();
                }
            }
        }

    }
    static void minMaxArray(){
        //Создайте 2 массива из 5 чисел.
        //Выведите массивы на консоль в двух отдельных строках.
        //Посчитайте среднее арифметическое элементов каждого массива и
        //сообщите, для какого из массивов это значение оказалось больше (либо
        //сообщите, что их средние арифметические равны).

        System.out.println();
        System.out.print("Enter our array :");

        int[] line1 = {5,12,14,8,};
        int[] line2 = {22,5,4,9,17};
        System.out.println();
        System.out.println("We take array №1 " + Arrays.toString(line1));
        System.out.println("We take array №2 "+ Arrays.toString(line2));
        int arrays1 = 0 ;
        int arrays2 = 0 ;
        for (int a = 0; a < line1.length; a++)
        {
            arrays1 = line1[a];
            arrays2 = line2[a];
        }
        arrays1 /= line1.length;
        arrays2 /= line2.length;
        if (arrays1 == arrays2)
        {
            System.out.println("Array №1 = Array №2");}
        else if
        (arrays1 > arrays2)
        { System.out.println("Array №1 > Array №2");}
        else if
        (arrays1 < arrays2)
        {System.out.println("Array №1 < Array №2");}

    }

}