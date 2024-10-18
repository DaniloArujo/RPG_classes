package entities.enums;

public class ModificadorStatus {
    private Double modificadorForca;
    private Double modificadorInteligencia;
    private Double modificadorAgilidade;
    private Double modificadorResistencia;

    public ModificadorStatus(Double modificadorForca,Double modificadorInteligencia, Double modificadorAgilidade,   Double modificadorResistencia) {
        this.modificadorAgilidade = modificadorAgilidade;
        this.modificadorForca = modificadorForca;
        this.modificadorInteligencia = modificadorInteligencia;
        this.modificadorResistencia = modificadorResistencia;
    }

    public Double getModificadorForca() {
        return modificadorForca;
    }

    public Double getModificadorInteligencia() {
        return modificadorInteligencia;
    }

    public Double getModificadorAgilidade() {
        return modificadorAgilidade;
    }

    public Double getModificadorResistencia() {
        return modificadorResistencia;
    }
}
