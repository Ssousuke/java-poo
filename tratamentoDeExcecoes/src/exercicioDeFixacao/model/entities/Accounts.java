package exercicioDeFixacao.model.entities;

import exercicioDeFixacao.model.exceptions.DomainException;

public class Accounts {
    private int number;
    private String holder;
    private double balance;
    private double withdraw;

    public Accounts(int number, String holder, double balance, double withdraw) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdraw = withdraw;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new DomainException("Erro ao depositar: O valor tem que ser maior que zero (0)");
        } else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > this.balance | this.withdraw < amount) {
            throw new DomainException("Erro ao efetuar o saque: O valor solicitado é superior ao valor permitido.");
        } else if (amount <= 0) {
            throw new DomainException("Erro ao efetuar o saque: O valor solicitado deve ser maior que zero (0).");
        } else {
            this.balance -= amount;
        }
    }
}
