package Repositorios;

import Interfaces.InterfaceFicha;
import Entidades.Ficha;
import java.util.ArrayList;
public class RepositorioFicha implements InterfaceFicha {
    private ArrayList<Ficha> fichas;

    public RepositorioFicha() {
        this.fichas = new ArrayList<Ficha>();
    }

    public void adicionarFicha(Ficha ficha) {
        this.fichas.add(ficha);
    }

    public void removerFicha(Ficha ficha) {
        this.fichas.remove(ficha);
    }

    public void ListarFichas() {
        for (Ficha ficha : this.fichas) {
            System.out.println("Nome: " + ficha.getNome() + " CPF: " + ficha.getCpf() + " Telefone: " + ficha.getTelefone() + " id:" + ficha.getId());
        }
    }

    public void alterarFicha(String cpf, Ficha ficha){
        for (int i = 0; i < this.fichas.size(); i++) {
            if (this.fichas.get(i).getCpf().equals(cpf)) {
                this.fichas.set(i, ficha);
            }
        }
    }

    public Ficha buscarFichaPorCpf(String cpf) {
        for (Ficha ficha : this.fichas) {
            if (ficha.getCpf().equals(cpf)) {
                return ficha;
            }
        }
        return null;
    }

    public Ficha buscarFichaPorID(int id) {
        for (Ficha ficha : this.fichas) {
            if (ficha.getId() == id) {
                return ficha;
            }
        }
        return null;
    }
}
