class Mago extends Personagem {

    private int mana = 50;

    public Mago(String nome) {
        super(nome, 100, 12, 4);
    }

    @Override
    public void atacar(Personagem alvo) {
        if (mana >= 10) {
            int dano = getForca() + 10;

            System.out.println(getNome() + " lançou uma magia.");
            mana = mana - 10;
            alvo.receberDano(dano);
            System.out.println("mana restante: " + mana);
        } else {
            System.out.println(getNome() + " atacou sem mana.");
            alvo.receberDano(getForca());
        }
    }
}