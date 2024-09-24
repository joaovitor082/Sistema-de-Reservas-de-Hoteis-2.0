package Repositorios;

import Entidades.TipoDeTurismo;
import java.util.ArrayList;


public class RepositorioS_GuiaTuristico{
    private ArrayList<TipoDeTurismo> listaDeTurismo = new ArrayList<>();

    public RepositorioS_GuiaTuristico() {
    }

    public ArrayList<TipoDeTurismo> getListaDeTurismo() {
        return listaDeTurismo;
    }

    public void setListaDeTurismo(ArrayList<TipoDeTurismo> listaDeTurismo) {
        this.listaDeTurismo = listaDeTurismo;
    }

    public void adicionarTurismo(TipoDeTurismo turismo){
        listaDeTurismo.add(turismo);
    }

    public void removerTurismo(TipoDeTurismo turismo){
        listaDeTurismo.remove(turismo);
    }

    public void listarTurismo(){
        for (TipoDeTurismo turismo : listaDeTurismo){
            System.out.println("Lugar: " + turismo.getLugar() + " Preço: " + turismo.getPreco());
        }
    }

    public void definirLugar(TipoDeTurismo tipoDeTurismo){
        tipoDeTurismo.definirLugar(tipoDeTurismo.getLugar());
    }
}
