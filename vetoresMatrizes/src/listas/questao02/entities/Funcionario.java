package listas.questao02.entities;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentoSalario(double percentual) {
        this.salario += this.salario * percentual / 100;
        return this.salario;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + ", id: " + id + ", salário: " + salario;
    }
}
