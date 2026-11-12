import java.util.Random;

class Arqueiro extends Personagem {

    private Random aleatorio = new Random();

    public Arqueiro(String nome) {
        super(nome, 100, 14, 5);
    }

    @Override
    public void atacar(Personagem alvo) {
        int chance = aleatorio.nextInt(100);
        int dano = getForca();

        if (chance < 25) {
            dano = dano * 2;
            System.out.println(getNome() + " acertou um ataque crítico.");
        } else {
            System.out.println(getNome() + " disparou uma flecha.");
        }

        alvo.receberDano(dano);
    }
}