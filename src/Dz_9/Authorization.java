package Dz_9;
public class Authorization {

    public static boolean authorization(String login, String password, String repeatedPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() > 19 || login.contains(" ") || login.length() < 0 ) {
            throw new WrongLoginException("Your login is -> WrongLoginException ");}

        if (password.length() >19 || password.contains(" ") ||!password.matches(".*\\d.*") ||
                 password.length() < 0 ) {
            throw new WrongPasswordException("Your password is -> WrongPasswordException"); }
        {
        if (!password.equals(repeatedPassword)) {
            throw new WrongPasswordException("Your repeated password is -> WrongPasswordException"); }}
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