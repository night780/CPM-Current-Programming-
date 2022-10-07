package SharedAccounts;

import java.util.concurrent.locks.*;

/**
 * A bank account has  balance that can be changed by
 * deposits and withdrawals.
 */
public class BankAccount {
    private double balance;
    private Lock balanceChgLock;
    private Condition enoughMoney;

    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount() {
        balance = 0;
        balanceChgLock = new ReentrantLock();
        enoughMoney = balanceChgLock.newCondition();
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balanceChgLock.lock();
        try {
            System.out.print("Depositing " + amount);
            double newBalance = balance + amount;
            System.out.println(", new balance is " + newBalance);
            balance = newBalance;
            //very important (can get into deadlock) so withdraw threads will check if balance is high enough
            enoughMoney.signalAll();
        } finally {
            balanceChgLock.unlock();
        }

    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balanceChgLock.lock();
        try {
            while (balance < amount) {
                //have the thread wait for a proper balance
                enoughMoney.await();
            }
            System.out.print("Withdrawing " + amount);
            double newBalance = balance - amount;
            System.out.println(", new balance is " + newBalance);
            balance = newBalance;

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            balanceChgLock.unlock();
        }
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }
}

