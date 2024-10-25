package entities.enums;

import entities.Habilidade;
import entities.ModificadorStatus;


public enum Classe {
    GUERREIRO(
            "Guerreiro",
            new ModificadorStatus(1.5, 1.0, 1.2, 1.4),
            new Habilidade[] {
                    new Habilidade("Golpe de Espada", TipoHabilidade.ATAQUE, 25.00, 0.00),
                    new Habilidade("Investida", TipoHabilidade.ATAQUE, 30.00, 0.00),
                    new Habilidade("Defesa de Ferro", TipoHabilidade.DEFESA, 0.00, 0.00)
            }
    ),
    MAGO(
            "Mago",
            new ModificadorStatus(0.8, 1.8, 1.0, 1.0),
            new Habilidade[] {
                    new Habilidade("Bola de Fogo", TipoHabilidade.ATAQUE, 35.00, 20.00),
                    new Habilidade("Raio", TipoHabilidade.ATAQUE, 40.00, 30.00),
                    new Habilidade("Escudo Mágico", TipoHabilidade.DEFESA, 0.00, 15.00)
            }
    ),
    ARQUEIRO(
            "Arqueiro",
            new ModificadorStatus(1.0, 1.2, 1.7, 1.1),
            new Habilidade[] {
                    new Habilidade("Tiro Preciso", TipoHabilidade.ATAQUE, 28.00, 0.00),
                    new Habilidade("Chuva de Flechas", TipoHabilidade.ATAQUE, 32.00, 10.00),
                    new Habilidade("Esquiva Rápida", TipoHabilidade.DEFESA, 0.00, 0.00)
            }
    );


    private final String nome;
    private final ModificadorStatus modificadorStatus;
    private final Habilidade[] habilidades;


    Classe(String nome, ModificadorStatus modificadorStatus, Habilidade[] habilidades) {
        this.nome = nome;
        this.modificadorStatus = modificadorStatus;
        this.habilidades = habilidades;
    }


    public String getNome() {
        return nome;
    }

    public ModificadorStatus getModificadorStatus() {
        return modificadorStatus;
    }

    public Habilidade[] getHabilidades() {
        return habilidades;
    }
}