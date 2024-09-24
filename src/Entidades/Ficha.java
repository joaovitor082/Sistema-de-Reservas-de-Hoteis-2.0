package Entidades;

import java.util.Random;
public class Ficha {
    private Pessoa pessoa;
    private int id;
    private double TotalPagar;

    private Quarto quarto;
    public Ficha() {
    }

    public Ficha(Pessoa pessoa, Quarto quarto) {
        this.pessoa = pessoa;
        this.id = new Random().nextInt(1000);
        this.TotalPagar = 0;
        this.quarto = quarto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.pessoa.getNome();
    }

    public String getCpf() {
        return this.pessoa.getCpf();
    }

    public String getTelefone() {
        return this.pessoa.getTelefone();
    }

    public double getTotalPagar(){
        return this.TotalPagar;
    }

    public void setTotalPagar(double valor){
        this.TotalPagar += valor;
    }
}
