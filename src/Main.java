package src;

public class Main {
    public static void main(String[] args) {
        int amount = 13676; // стоимость билета
        int rublesPerMile = 20; // рублей за одну милю
        int miles = amount / rublesPerMile;

        System.out.println("Начисленные мили: " + miles);
    }
}