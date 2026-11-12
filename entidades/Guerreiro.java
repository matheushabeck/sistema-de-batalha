class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 100, 15, 8);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = getForca() + 5;

        System.out.println(getNome() + " atacou com a espada.");
        alvo.receberDano(dano);
    }
}