package DzLesson_7.Task_1;

public class Triagle extends Figures {
        public final double a;
        public final double b;
        public final double c;
        public Triagle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double area () {
            double p =(a + b + c ) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        public double perimeter () {
            return  a + b + c;
        }
    }
