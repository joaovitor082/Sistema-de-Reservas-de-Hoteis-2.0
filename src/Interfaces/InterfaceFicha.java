package Interfaces;

import Entidades.Ficha;
public interface InterfaceFicha {
    public void adicionarFicha(Ficha ficha);
    public void removerFicha(Ficha ficha);
    public void ListarFichas();
    public void alterarFicha(String cpf, Ficha ficha);
    public Ficha buscarFichaPorCpf(String cpf);
    public Ficha buscarFichaPorID(int id);
}
