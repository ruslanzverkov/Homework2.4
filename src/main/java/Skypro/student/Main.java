package Skypro.student;

import Skypro.student.exeption.WrongLoginException;
import Skypro.student.exeption.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "java_skypro.gojava_skypro.gojava_skypro.go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_";
        System.out.println(acceptLoginPassword(login, password, confirmPassword));
    }

    public static boolean acceptLoginPassword(String login, String password, String confirmPassword) {

        boolean containsSymbolsLogin;
        boolean conSymbolsPassword;
        boolean checkLoginLengthLogin;
        boolean checkLoginLengthPassword;
        boolean equalsPasswordConfirmPassword;
        try {
            containsSymbolsLogin = containsSymbols(login);
            conSymbolsPassword = containsSymbols(password);
            checkLoginLengthLogin = checkLoginLength(login);
            checkLoginLengthPassword = checkPasswordLength(password);
            equalsPasswordConfirmPassword = equalsPasswordConfirmPassword(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e)
        //Видно что есть 2 ошибки, 2я не выводиться непойму
        //что надо сделать??
        {
            System.out.println(e.getMessage());
            return false;
        }
        return containsSymbolsLogin
                & conSymbolsPassword
                & checkLoginLengthLogin
                & checkLoginLengthPassword
                & equalsPasswordConfirmPassword;
    }

    public static boolean containsSymbols(String symbols) {
        if (symbols.matches("\\w+")) {
            return true;
        }
        System.out.printf("Содержит недопустимые символы-%s\n", symbols);
        return false;
    }

    public static boolean checkLoginLength(String login) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Логин слишком длинный-%s");
        }
        return true;
    }

    public static boolean checkPasswordLength(String password) {
        if (password.length() < 20) {
            return true;
        }
        System.out.printf("Пароль слишком длинный-%s", password);
        return false;
    }

    public static boolean equalsPasswordConfirmPassword(String password, String confirmPassword)
            throws WrongPasswordException {
        if (password.equals(confirmPassword)) return true;
        throw new WrongPasswordException("Пароль не совпадает");

    }
}