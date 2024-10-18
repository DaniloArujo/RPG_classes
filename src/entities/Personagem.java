package entities;

import entities.enums.Classe;
import entities.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

    String nome;
    Integer nivel = 0;
    Classe classe;
    Status status;
    List<Arma> armas = new ArrayList<>();
    List<Armadura> armaduras = new ArrayList<>();

    public Personagem(String nome, Classe classe, Status status) {
        this.nome = nome;
        this.classe = classe;
        this.status = status;
    }

    public void subirNivel(){
        this.nivel ++;
        status.setForca(status.getForca()+ 5);
        status.setVidaMaxima(status.getVidaMaxima()+20);
        System.out.println(nome + " subiu para o nível " + nivel);
    }

    public void equiparArma(Arma arma){
        if(armas.size() < 2){
            armas.add(arma);
            System.out.println(nome + " equipou a arma " + arma.getNome());
        }
    }

    public void equiparArmadura(Armadura armadura) {
        if (armaduras.size() < 2) {
            armaduras.add(armadura);
            System.out.println(nome + " equipou a armadura " + armadura.getNome());
        } else {
            System.out.println("Não há espaço para mais armaduras.");
        }
    }

    public Double atacar() {
        Double danoBase = status.getForca();
        for (Arma arma : armas) {
            danoBase += arma.calcularDano();
        }
        System.out.println(nome + " atacou causando " + danoBase + " de dano.");
        return danoBase;
    }

    public Double defender() {
        Double defesaBase = status.getResistencia();
        for (Armadura armadura : armaduras) {
            defesaBase += armadura.calcularDefesa();
        }
        System.out.println(nome + " defendeu com " + defesaBase + " de defesa.");
        return defesaBase;
    }

    public void usarHabilidade(Habilidade habilidade, Personagem alvo) {

        if (this.status.getManaMaxima() >= habilidade.getCustoMana()) {
            // Subtrai o custo de mana
            this.status.setManaMaxima(this.status.getManaMaxima() - habilidade.getCustoMana());


            Double danoBase = habilidade.getDanoBase();
            Double danoFinal = calcularDano(danoBase);

            // Aplica o dano ao alvo
            alvo.receberDano(danoFinal);

            // Exibe mensagem de ataque
            System.out.println(this.nome + " usou " + habilidade.getNome() + " causando " + danoFinal + " de dano!");

        } else {
            // Caso não tenha mana suficiente
            System.out.println(this.nome + " não tem mana suficiente para usar " + habilidade.getNome() + "!");
        }
    }

    private Double calcularDano(Double danoBase) {

        if (this.classe == Classe.MAGO) {

            return (Double) (danoBase * (1 + this.status.getInteligencia() / 100.0));
        }

        return danoBase;
    }

    public void receberDano(Double dano) {
        this.status.setVidaMaxima(this.status.getVidaMaxima() - dano);
        if (this.status.getVidaMaxima() <= 0) {
            System.out.println(this.nome + " foi derrotado!");
        } else {
            System.out.println(this.nome + " tem agora " + this.status.getVidaMaxima() + " de vida.");
        }
    }


}
