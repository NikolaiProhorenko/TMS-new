package Dz_9;
    //Создать класс, в котором будет статический метод.
    //Этот метод принимает на вход три параметра:
    //Login,
    //Password,
    //confirmPassword.
    //Все поля имеют тип данных String.
    //Длина login должна быть меньше 20 символов и не должен содержать
    //пробелы.
    //Если login не соответствует этим требованиям, необходимо выбросить
    //WrongLoginException.
    //Длина password должна быть меньше 20 символов, не должен содержать
    //пробелы и должен содержать хотя бы одну цифру.
    //Также password и confirmPassword должны быть равны.
    //Если password не соответствует этим требованиям, необходимо
    //выбросить WrongPasswordException.
    //Метод возвращает true, если значения верны или false в другом случае.
public class Authorization {

    public static boolean authorization(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() > 19 || login.contains(" ") || login.length() < 0 ) {
            throw new WrongLoginException("Your login is -> WrongLoginException ");}

        if (password.length() >19 || password.contains(" ") ||!password.matches(".*\\d.*") ||
                 password.length() < 0 ) {
            throw new WrongPasswordException("Your password is -> WrongPasswordException"); }
        {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Your confirm password is -> WrongPasswordException"); }}
        return true;
    }

    public static void main(String[] args) {
        try {
            authorization(   "sdfgfs5584dgsg",
                          "rgjaeogjoi55",
                    "rgjaeogjoi55");
            System.out.println("Your login and password is success");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Authorization failed try again: " + e.getMessage()); }
    }
}