package DzLesson_7.Task_1;

public class Circle extends Figures{
        public final double radius;
        public static final double MathPI = 3.14 ;
        public Circle (double radius) {
            this.radius = radius;
        }
        public double area() {
            return MathPI * (radius * radius);
        }
        public double perimeter () {
            return  2 * MathPI * radius;
        }

}
