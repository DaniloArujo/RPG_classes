package entities;

import entities.enums.TipoArmadura;

public class Armadura {

    String nome;
    Integer defesa;
    TipoArmadura tipo;


    public int calcularDefesa(){
        return this.defesa;
    }
}
