
public class BankApp {

    public static void main(String[] args) {
        DatabaseActions databaseActions = new DatabaseActions();
        databaseActions.createTable();
        GirisEkrani girisEkrani = new GirisEkrani();
    }
}