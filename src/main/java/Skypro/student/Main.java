package Skypro.student;

public class Main {
    public static void main(String[] args) {
        String login = "java_skypro.gojava_skypro.gojava_skypro.go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        System.out.println(acceptLoginPassword(login, password, confirmPassword));
    }

    public static boolean acceptLoginPassword(String login, String password, String confirmPassword) {
        return containsSymbols(login)
                & containsSymbols(password)
                & checkLoginLength(login)
                & checkPasswordLength(password)
                & equalsPasswordConfirmPassword(password, confirmPassword);

    }

    public static boolean containsSymbols(String symbols) {
        if (symbols.matches("\\w+")) {
            return true;
        }
        System.out.printf("Содержит недопустимые символы-%s\n", symbols);
        return false;
    }

    public static boolean checkLoginLength(String login) {
        if (login.length() <= 20) {
            return true;
        }
        System.out.printf("Логин слишком длинный-%s", login);
        return false;
    }

    public static boolean checkPasswordLength(String password) {
        if (password.length() < 20) {
            return true;
        }
        System.out.printf("Пароль слишком длинный-%s", password);
        return false;
    }

    public static boolean equalsPasswordConfirmPassword(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }
}