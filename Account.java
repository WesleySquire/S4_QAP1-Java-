/*
Name: Wesley Squire
Date: Sept 20, 2022
QAP1 Problem 1
*/

public class Account {
  // I tried to make an accounts array to store the accounts info for q.) c but I
  // have no
  // idea what I'm doing LOL. I watched jamie go over it using hash map but if I
  // copied I'd have to re-write my whole code and I don't have the time to do it.
  // I will take the time once I have do have the time to learn hashmaps more in
  // depth. :D
  Object[] Accounts = new Object[10];
  private String id;
  private String name;
  private int balance = 0;

  // Make an account w/ no balance
  Account(String id, String n) {
    this.id = id;
    this.name = n;
  }

  // Creates account
  Account(String id, String n, int b) {
    this.id = id;
    this.name = n;
    this.balance = b;

  }

  // Gets id from given acc.
  public void getID() {
    System.out.println(this.id);
  }

  // Gets name from given acc.
  public void getName() {
    System.out.println(this.name);
  }

  // Gets balance from given acc.
  public void getBalance() {
    System.out.println(this.name + "'s balance: " + this.balance);
  }

  // Adds given amount to acc's balance
  public void credit(int amt) {
    this.balance += amt;
  }

  // Takes away given amount to acc's balance
  public int debit(int amt) {
    if (amt <= this.balance) {
      balance -= amt;

    } else {
      System.out.println("Amount exceeded balance");
    }
    return (this.balance);
  }

  // Stuck on this for long time ):
  public int transferTo(Account another, int amount) {
    if (this.balance >= amount) {
      this.balance -= amount;
      another.balance += amount;
    } else {
      System.out.println("Amount exceeded balance!");
    }

    return this.balance;
  }

  public String toString() {
    // Returns acc to required format
    return "Account[id=" + this.id + ",name=" + this.name + ",balance=" + this.balance;
  }

};