class Arena {

    private Personagem personagem1;
    private Personagem personagem2;

    public Arena(Personagem personagem1, Personagem personagem2) {
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
    }

    public void iniciarBatalha() {
        System.out.println("a batalha começou.");

        int turno = 1;

        while (personagem1.estaVivo() && personagem2.estaVivo()) {
            System.out.println("turno " + turno);

            personagem1.atacar(personagem2);

            if (!personagem2.estaVivo()) {
                break;
            }

            personagem2.atacar(personagem1);
            turno++;
        }

        apresentarVencedor();
    }

    public void apresentarVencedor() {
        if (personagem1.estaVivo()) {
            System.out.println("vencedor: " + personagem1.getNome());
        } else {
            System.out.println("vencedor: " + personagem2.getNome());
        }
    }
}