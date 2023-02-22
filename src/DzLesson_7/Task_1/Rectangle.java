package DzLesson_7.Task_1;

public class Rectangle extends Figures{
        public final double width;
        public final double length;
        public Rectangle (double width, double length) {
            this.width = width;
            this.length = length;
        }
        public double area() {
            return width * length;
        }
        public double perimeter () {
            return 2 * (width * length);
        }

}
