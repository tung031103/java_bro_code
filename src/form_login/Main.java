package form_login;

public class Main {
    public static void main(String[] args) {
        // login system
        ID_Password id_Password = new ID_Password();

        loginPage LoginPage = new loginPage(id_Password.getLoginInfo());
    }
}
