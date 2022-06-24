package ua.hillel.java;

public class TaskTwo {

    public static void main(String[] args) {
        int myValue = 1;
        for (int i = 1; i <= 100; i++) {
            myValue *= i;
            if (myValue > 1000) {
                System.out.println(myValue);
                break;
            }
        }
    }
}
