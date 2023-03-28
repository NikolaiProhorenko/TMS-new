import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String document = "1111-abc-2222-bCb-1b2b";
        System.out.println("\n"+ "Original document: " + document);
        paragraphSewen(document);
    }

    public static void paragraphSewen (String document) {
        boolean end = document.endsWith("1a2b");
        System.out.println(end? "Document end from '1a2b'" : "Document don't end from '1a2b'");
    }

    @FunctionalInterface
      public static interface Interface <T, R>{
          R apply (T t);
      }

    public static class MyDate {
        private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        private LocalDate date;

        public void getDayOfWeek(String value) {
            date = LocalDate.parse(value, formatter);
            System.out.println("Day of the week is "
                    + date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru")));
        }

        public void getNextTuesday(String value) {
            date = LocalDate.parse(value, formatter);
            while (true) {
                if ((date = date.plusDays(1)).getDayOfWeek() == DayOfWeek.MONDAY){
                    System.out.println("Date of the next Tuesday is: " + date.plusDays(1).format(formatter));
                    return;
                }
            }
        }
    }
}