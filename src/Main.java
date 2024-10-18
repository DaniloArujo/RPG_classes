import entities.Arma;
import entities.Armadura;
import entities.Habilidade;
import entities.Personagem;
import entities.enums.*;


public class Main {
    public static void main(String[] args) {

        // Criando algumas armas
        Arma espada = new Arma("Espada Longa", 15, TipoArma.ESPADA);
        Arma arco = new Arma("Arco Longo", 12, TipoArma.ARCO);
        Arma cajado = new Arma("Cajado Mágico", 18, TipoArma.CAJADO);



        // Criando algumas armaduras
        Armadura armaduraLeve = new Armadura("Armadura de Couro", 10, TipoArmadura.LEVE);
        Armadura armaduraPesada = new Armadura("Armadura de Placas", 25, TipoArmadura.PESADA);
        Armadura mantoMago = new Armadura("Manto de Mago", 5, TipoArmadura.LEVE);


        // Criando modificadores de status para as classes
        ModificadorStatus modificadorGuerreiro = new ModificadorStatus(1.5, 1.0, 1.2, 1.4);
        ModificadorStatus modificadorMago = new ModificadorStatus(0.8, 1.8, 1.0, 1.0);
        ModificadorStatus modificadorArqueiro = new ModificadorStatus(1.0, 1.2, 1.7, 1.1);



        // Criando classes (exemplo de uso com enum e modificadores)
        Classe guerreiro = Classe.GUERREIRO;
        Classe mago = Classe.MAGO;
        Classe arqueiro = Classe.ARQUEIRO;


        // Criando status base
        Status statusBaseGuerreiro = new Status(20.00, 10.00, 15.00, 18.00, 100.00, 50.00);
        Status statusBaseMago = new Status(10.00, 25.00, 12.00, 10.00, 80.00, 120.00);
        Status statusBaseArqueiro = new Status(15.00, 12.00, 20.00, 14.00, 90.00, 60.00);

        // Aplicando modificadores de classe aos status
        statusBaseGuerreiro.aplicarModificador(modificadorGuerreiro);
        statusBaseMago.aplicarModificador(modificadorMago);
        statusBaseArqueiro.aplicarModificador(modificadorArqueiro);



        // Criando personagens
        Personagem personagem1 = new Personagem("Arthas", guerreiro, statusBaseGuerreiro);
        Personagem personagem2 = new Personagem("Jaina", mago, statusBaseMago);
        Personagem personagem3 = new Personagem("Legolas", arqueiro, statusBaseArqueiro);

        // Equipando armas e armaduras
        personagem1.equiparArma(espada);
        personagem1.equiparArmadura(armaduraPesada);

        personagem2.equiparArma(cajado);
        personagem2.equiparArmadura(mantoMago);

        personagem3.equiparArma(arco);
        personagem3.equiparArmadura(armaduraLeve);

        // Exemplo de interações
        System.out.println("\n-- Início da Batalha --");
        personagem1.atacar();
        personagem2.usarHabilidade(new Habilidade("Bola de Fogo", TipoHabilidade.ATAQUE, 30.00, 20.00), personagem1);
        personagem3.atacar();

        personagem1.subirNivel();
        personagem1.atacar();

        System.out.println("-- Fim da Batalha --");
    }
}
