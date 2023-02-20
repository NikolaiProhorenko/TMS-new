package DzLesson_6;

import java.util.Scanner;

public class CreditCard {
    int numberAcaunt;
    double acauntSum;

    public CreditCard (int cardNumber, double cardAmount)
    {
        numberAcaunt = cardNumber;
        acauntSum = cardAmount;
    }
    public void cachIn (int i) {
        System.out.print ("Please, enter how mach you want cash in card with number "+numberAcaunt+": ");
        Scanner Cash = new Scanner (System.in);
        double Cash2 = Cash.nextDouble();
        acauntSum =acauntSum + Cash2;
        }



    public void cashOut (int i) {
        System.out.print ("Please, enter how mach you want cash out card with number "+numberAcaunt+": ");
        Scanner Cash = new Scanner (System.in);
        double Cash2 = Cash.nextDouble();
        acauntSum = acauntSum - Cash2;
        System.out.println();
        Cash.close();}


    public void acauntInfo() {
        System.out.println ("The card account number is: "+ numberAcaunt);
        System.out.println ("Card balance is "+acauntSum);
        System.out.println();}

    }



