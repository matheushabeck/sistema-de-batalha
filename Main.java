import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Guerreiro guerreiro = new Guerreiro("Guerreiro");
        Mago mago = new Mago("Mago");
        Arqueiro arqueiro = new Arqueiro("Arqueiro");

        // escolher os personagens que vao batalhar
        Arena arena = new Arena(guerreiro, mago);

        arena.iniciarBatalha();
    }
}