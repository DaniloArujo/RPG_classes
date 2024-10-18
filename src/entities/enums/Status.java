package entities.enums;

public class Status {
    Double forca;
    Double inteligencia;
    Double agilidade;
    Double resistencia;
    Double vidaMaxima;
    Double manaMaxima;

    public void aplicarModificador(ModificadorStatus modificador){
        this.forca += modificador.getModificadorForca();
        this.agilidade += modificador.getModificadorAgilidade();
        this.resistencia += modificador.getModificadorResistencia();
        this.inteligencia += modificador.getModificadorInteligencia();
    }
}
