package entities;

import entities.enums.TipoArma;

public class Arma {

    private String nome;
    private Integer dano;
    private TipoArma tipo;

    public int calcularDano(){
        return this.dano;
    }

}
