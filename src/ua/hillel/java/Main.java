package ua.hillel.java;

public class Main {

    public static void main(String[] args) {
        CreditCard firstCard = new CreditCard();
        firstCard.cardNumber = "1111";
        firstCard.owner = "FirstName1 LastName1";
        firstCard.type = "VISA";

        CreditCard secondCard = new CreditCard();
        secondCard.cardNumber = "2222";
        secondCard.owner = "FirstName2 LastName2";
        secondCard.type = "MASTERCARD";

        CreditCard thirdCard = new CreditCard();
        thirdCard.cardNumber = "3333";
        thirdCard.owner = "FirstName3 LastName3";
        thirdCard.type = "MIR";

        CreditCard forthCard = new CreditCard();
        forthCard.cardNumber = "4444";
        forthCard.owner = "FirstName4 LastName4";
        forthCard.type = "JCB";

        firstCard.cardCheck();
        secondCard.cardCheck();
        thirdCard.cardCheck();
        forthCard.cardCheck();
    }
}
