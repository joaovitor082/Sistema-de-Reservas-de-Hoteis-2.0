package Servicos;

import Repositorios.RepositorioS_GuiaTuristico;
import Entidades.Ficha;
import Entidades.TipoDeTurismo;

public class S_GuiaTuristico{
    private RepositorioS_GuiaTuristico repositorioS_GuiaTuristico;

    public S_GuiaTuristico() {
        this.repositorioS_GuiaTuristico = new RepositorioS_GuiaTuristico();
    }

    public void definirLugar(TipoDeTurismo tipoDeTurismo, Ficha ficha) {
        repositorioS_GuiaTuristico.definirLugar(tipoDeTurismo);
        ficha.setTotalPagar(tipoDeTurismo.getPreco());
    }


}
