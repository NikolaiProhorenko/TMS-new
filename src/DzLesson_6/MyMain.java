import DzLesson_6.CreditCard;
import DzLesson_6.CreditCardBuilder;

public class MyMain {
    public static void main(String[] args) {
        //  1. get credit card info
        DzLesson_6.CreditCard card1 = new CreditCard(1551551,22);
        DzLesson_6.CreditCard card2 = new CreditCard(8554555,125);;
        DzLesson_6.CreditCard card3 = new CreditCard(155659,2255);

        card1.cachIn(0);
        card2.cachIn(0);
        card3.cashOut(0);


        card1.acauntInfo();
        card2.acauntInfo();
        card3.acauntInfo();

        }



}