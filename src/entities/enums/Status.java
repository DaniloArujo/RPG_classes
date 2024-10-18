package entities.enums;

public class Status {
    Double forca;
    Double inteligencia;
    Double agilidade;
    Double resistencia;
    Double vidaMaxima;
    Double manaMaxima;

    public Status(Double forca, Double inteligencia, Double agilidade, Double resistencia, Double vidaMaxima, Double manaMaxima) {
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.resistencia = resistencia;
        this.vidaMaxima = vidaMaxima;
        this.manaMaxima = manaMaxima;
    }

    public void aplicarModificador(ModificadorStatus modificador){
        this.forca += modificador.getModificadorForca();
        this.agilidade += modificador.getModificadorAgilidade();
        this.resistencia += modificador.getModificadorResistencia();
        this.inteligencia += modificador.getModificadorInteligencia();
    }

    public Double getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(Double agilidade) {
        this.agilidade = agilidade;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Double getManaMaxima() {
        return manaMaxima;
    }

    public void setManaMaxima(Double manaMaxima) {
        this.manaMaxima = manaMaxima;
    }

    public Double getResistencia() {
        return resistencia;
    }

    public void setResistencia(Double resistencia) {
        this.resistencia = resistencia;
    }

    public Double getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(Double vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }
}
