public class Main {
    public static void main(String[] args) {
        numbers();
        ourTriangle();
        getNumbers();
        sumPositiveNumber();
        sumPositiveAndNegativeNumber();
        maxNumbers();
        programmer();
    }

    static void numbers() {

        // задача №1 В переменную записываем число. Надо вывести на экран сколько в этом числе цифр
        // и положительное оно или отрицательное. Например, "это однозначное положительное число".
        // Достаточно будет определить, является ли число однозначным, "двухзначным или трехзначным и более.
        int number = 415;

        if (number == 0)
            System.out.println("Our number: 0 " + number);

        else if  (number<=-9 && number<0)
            System.out.println("Number negative, unambiguous our number:: " + number);

        else if (number<=-99 && number<=-10)
            System.out.println("Number negative, two-digit our number:: " + number);

        else if (number<=-999 && number<=-100)
            System.out.println("Number negative, three-digit our number:: " + number);

        else if (number>=0 && number<=9)
            System.out.println("Number unambiguous our number:: " + number);

        else if (number>=10 && number<=100)
            System.out.println("Number two-digit our number: " + number);

        else if (number>=100 && number<=999)
            System.out.println("Number three-digit our number: " + number);
        System.out.println();
    }

    static void ourTriangle()
    {
        //Треугольник существует только тогда, когда сумма любых двух его сторон
        //больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
        //стороны предполагаемого треугольника. Требуется сравнить длину каждого
        //отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
        //окажется больше суммы двух других, то треугольника с такими сторонами не
        //существует.

        int a=5;
        int b=6;
        int c=11;

        if ((a+b>=c) && (a+c>=b) && (b+c>=a))
            System.out.printf("Our triangle a=%d, b=%d, c=%d may live\n",a,b,c);
        else
            System.out.printf("Our triangle a=%d, b=%d, c=%d can't live\n",a,b,c);
        System.out.println();
    }

    static void getNumbers()
    {
        //Дано целое число. Если оно является положительным, то прибавить к нему 1.
        //Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10. Вывести полученное число.

        int number = 5;
        if (number > 0) {
            number++;
            System.out.println("Get number: " + number);
        } else if (number < 0) {
            number -= 2;
            System.out.println("Get number: " + number);
        } else {
            number = 10;
            System.out.println("Get number: " + number);
        }
        System.out.println();


    }
    static void sumPositiveNumber()
    //Даны 3 целые числа. Найти количество положительных чисел в исходном наборе.
    {
        int number1 = 5;
        int number2 = -6;
        int number3 = 1;
        int sum =0;

        if (number1 >0) {
            sum ++;
        }
        if (number2 >0) {
            sum ++;
        };
        if (number3>0) {
            sum++;
        };
        System.out.println("Summa our numbers: " + sum);
        System.out.println();



    }

    static void sumPositiveAndNegativeNumber()
    //Даны 3 целых числа. Найти количество положительных и отрицательных
    //чисел в исходном наборе.
    {

        int number1 = 5;
        int number2 = -6;
        int number3 = 1;
        int sumPositive = 0;
        int sumNegative = 0;

        if (number1 >0) {
            sumPositive++;
        } else {
            sumNegative++;
        }
        if (number2 >0) {
            sumPositive++;
        } else {
            sumNegative++;
        }
        if (number3>0) {
            sumPositive++;
        } else {
            sumNegative++;
        }

        System.out.println("Sum our positive numbers: " + sumPositive);
        System.out.println("Sum our negative numbers: " + sumNegative);
        System.out.println();
    }
    static void maxNumbers()
    {
        //Даны 2 числа. Вывести большее из них.
        int number1 = 555;
        int number2 = 85;

        System.out.println("Biggest number is: " +((number1 > number2) ? number1: number2));
        System.out.println();
    }
    static void programmer()
    // (Дополнительно) В переменную записываете количество программистов. В
    //зависимости от количества программистов необходимо вывести правильно
    //окончание. Например:
    //• 2 программиста
    //• 1 программиста
    //• 10 программистов
    //• и т.д
    {
        int programmer = 11;
        if (programmer==1)
        {System.out.println("У нас один программист");}
        else if (programmer > 1 && programmer <= 5)
        {System.out.printf("У нас %d программиста", programmer);}
        else if (programmer >5 && programmer <=20 )
        {System.out.printf("У нас %d программистов", programmer);}
        else if (programmer == 21 )
        {System.out.printf("У нас %d программист", programmer);}
        else if (programmer >21 && programmer <=30 )
        {System.out.printf("У нас %d программиста", programmer);}
        else if (programmer >31 )
        {System.out.print("Столько программистов вместе не собираються =) ");}
    }
}