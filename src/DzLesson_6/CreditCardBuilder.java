package DzLesson_6;

public class CreditCardBuilder {
    private int cardNumber;
    private double cardAmount;

    public CreditCardBuilder setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public CreditCardBuilder setCardAmount(double cardAmount) {
        this.cardAmount = cardAmount;
        return this;
    }

    public CreditCard createCreditCard() {
        return new CreditCard(cardNumber, cardAmount);
    }
}