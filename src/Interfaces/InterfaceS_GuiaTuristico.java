package Interfaces;

import Entidades.TipoDeTurismo;
public interface InterfaceS_GuiaTuristico {
    void definirLugar(TipoDeTurismo tipoDeTurismo);
    void adicionarTurismo(TipoDeTurismo turismo);
    void removerTurismo(TipoDeTurismo turismo);
    void listarTurismo();

}
