package entities;

import entities.enums.TipoArmadura;

public class Armadura {

    String nome;
    Integer defesa;
    TipoArmadura tipo;

    public Armadura(String nome, Integer defesa, TipoArmadura tipo) {
        this.defesa = defesa;
        this.nome = nome;
        this.tipo = tipo;
    }


    public int calcularDefesa(){
        return this.defesa;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoArmadura getTipo() {
        return tipo;
    }

    public void setTipo(TipoArmadura tipo) {
        this.tipo = tipo;
    }
}
