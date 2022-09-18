package Skypro.student;

public class Main {
    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        System.out.println(acceptLoginPassword(login, password, confirmPassword));
    }

    public static boolean acceptLoginPassword(String login, String password, String confirmPassword) {
       return containsSymbols(login) && containsSymbols(password);

    }

    public static boolean containsSymbols(String symbols) {
        return symbols.matches("\\w+");

    }

    public static boolean checkLoginLength(String login) {


        return false;
    }

    public static boolean checkPasswordLength(String password) {
        return false;
    }

    public static boolean equalsPasswordConfirmPassword(String password, String confirmPassword) {
        return false;
    }
}