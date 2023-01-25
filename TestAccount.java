public class TestAccount {
  public static void main(String[] args) {
    Account Acc1 = new Account("a1", "Acc1", 5000);
    Account Acc2 = new Account("a2", "Acc2", 4000);
    Acc1.getBalance();
    Acc2.getBalance();
    Acc1.transferTo(Acc2, 1000);
    Acc1.getBalance();
    Acc2.getBalance();

  }
}
