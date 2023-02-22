package DzLesson_7.Task_1;

public class MyMain1 {
    public static void main(String[] args) {
        Figures [] figures = {
                                new Triagle(12,9,7),
                                new Circle(22),
                                new Circle(17),
                                new Triagle(5,1,4),
                                new Rectangle(6,7)};

        double totalPerimeter = 0;
        double totalSquare = 0;
        for (Figures figure : figures) {
            totalPerimeter += figure.perimeter();
            totalSquare += figure.area();
        }
        System.out.println();
        System.out.println("We take total perimeter figures is: " + totalPerimeter);
        System.out.println("We take total square figures is: " + totalSquare);
    }
}