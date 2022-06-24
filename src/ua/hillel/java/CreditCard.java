package ua.hillel.java;

public class CreditCard {
    String cardNumber;
    String owner;
    String type;

    public void cardCheck(){
        switch (type) {
            case "MASTERCARD":
            case "VISA":
                System.out.println("Dear, " + owner + "! Congratulations, you possess a normal card!");
                break;
            case "MIR":
                System.out.println(owner + ", go f*ck yourself together with your russian warship!");
                break;
            default:
                System.out.println("Unknown card type: " + type);
                break;
        }
    }
}
