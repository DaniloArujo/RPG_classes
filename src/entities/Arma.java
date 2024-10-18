package entities;

import entities.enums.TipoArma;

public class Arma {

    private String nome;
    private Integer dano;
    private TipoArma tipo;

    public Arma(String nome,Integer dano, TipoArma tipo) {
        this.dano = dano;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int calcularDano(){
        return this.dano;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoArma getTipo() {
        return tipo;
    }

    public void setTipo(TipoArma tipo) {
        this.tipo = tipo;
    }
}
