import java.util.Locale;

/* Написать программу со следующим функционалом:
       На вход передать строку (будем считать, что это номер документа).
       Номер документа имеет формат хххх-yyy-хххх-yyy-хуху, где x — это число,
       а y — это буква.
       1) Вывести на экран в одну строку два первых блока по 4 цифры.
       2) Вывести на экран номер документа, но блоки из трех букв заменить
       на *** (каждая буква заменятся на *).
       3) Вывести на экран только одни буквы из номера документа в
       формате yyy/yyy/y/y в нижнем регистре.
       4) Вывести на экран буквы из номера документа в формате
       "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
       класса StringBuilder).
       5) Проверить содержит ли номер документа последовательность abc и
       вывети сообщение содержит или нет(причем, abc и ABC считается
       одинаковой последовательностью).
       6) Проверить начинается ли номер документа с последовательности 555.
       7) Проверить заканчивается ли номер документа на
       последовательность 1a2b.
       Все эти методы реализовать в отдельном классе в статических методах,
       которые на вход (входным параметром) будут принимать вводимую на
       вход программы строку. */
public class Main {
    public static void main(String[] args) {
        String document = "1111-abc-2222-bCb-1b2b";
        System.out.println("Oridinal document: " + document);
        paragraphOne(document);
        paragraphTwo(document);
        paragraphThree(document);
        paragraphFour(document);
        paragraphFive(document);
        paragraphSix(document);
        paragraphSewen(document);
    }
    public static void paragraphOne(String document){
        String blocs[] = document.split("-");
        System.out.println("\n"+blocs[0] + "-" + blocs[2]);
    }
    public static void paragraphTwo(String document) {
        String blocs[] = document.split("-");
        System.out.print(blocs[0]+ "-***-");
        System.out.print(blocs[2]+ "-***-");
        System.out.println(blocs[4]);
    }
    public static void paragraphThree(String document){
        String blocs[] = document.split("-");
        String letter = (blocs[1]+ " / " + blocs[3]+ " / " +blocs[4].charAt(1) + " / " + blocs[4].charAt(3));
        System.out.println(letter);
    }
    public static void paragraphFour(String document){
        String blocs[] = document.split("-");
        StringBuilder four= new StringBuilder("Letters: ");
        four.append(blocs[1].toUpperCase()+ " / ");
        four.append(blocs[3].toUpperCase()+ " / ");
        four.append(blocs[4].toUpperCase().charAt(1)+" / ");
        four.append(blocs[4].toUpperCase().charAt(3)+" / ");
        System.out.println(four);
    }
    public static void paragraphFive (String document){
        boolean contains = document.toLowerCase().contains("abc");
        System.out.println(contains? "Document contains 'abc or ABC'" : "Document not contains 'abc or ABC'");
    }
    public static void paragraphSix (String document){
        boolean start = document.startsWith("555");
        System.out.println(start? "Document start from '555'" : "Document don't start from '555'");
    }
    public static void paragraphSewen (String document) {
        boolean end = document.endsWith("1a2b");
        System.out.println(end? "Document end from '1a2b'" : "Document don't end from '1a2b'");
    }
}