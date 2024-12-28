public class Main {
    public static void main(String[] args) {
        Account account = new Account("Jan Kowalski", 1000, "123456789");

        try {
            // Próba wykonania przelewu na kwotę większą niż dostępne środki
            account.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Błąd: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Nieoczekiwany błąd: " + e.getMessage());
        } finally {
            //  stan konta po tranzakcji
            System.out.println("Aktualny stan konta: " + account.getBalance() + " PLN.");
        }
    }
}