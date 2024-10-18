package entities;

import entities.enums.Status;
import entities.enums.TipoHabilidade;

public class Habilidade {

    private String nome;
    private TipoHabilidade tipo;
    private Double danoBase;
    private Double custoMana;

    public Habilidade(String nome,TipoHabilidade tipo,Double danoBase,  Double custoMana) {
        this.custoMana = custoMana;
        this.danoBase = danoBase;
        this.nome = nome;
        this.tipo = tipo;
    }

    public void usarHAbilidade(Status status){
        if(status.getManaMaxima() >= custoMana){
            Double dano = danoBase + status.getInteligencia();
            status.setManaMaxima(status.getManaMaxima() - this.custoMana);
        }else{
            System.out.println("Mana insuficiente para usar a habilidade.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoHabilidade getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabilidade tipo) {
        this.tipo = tipo;
    }

    public Double getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(Double danoBase) {
        this.danoBase = danoBase;
    }

    public Double getCustoMana() {
        return custoMana;
    }

    public void setCustoMana(Double custoMana) {
        this.custoMana = custoMana;
    }
}
