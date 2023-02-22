public class Main {
    public static void main(String[] args) {
        ourTriangle();
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
}