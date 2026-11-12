abstract class Personagem {

    private String nome;
    private int vida;
    private int forca;
    private int defesa;

    public Personagem(String nome, int vida, int forca, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
    }

    public abstract void atacar(Personagem alvo);

    public void receberDano(int dano) {
        int danoFinal = dano - defesa;

        if (danoFinal < 0) {
            danoFinal = 0;
        }

        vida = vida - danoFinal;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nome + " recebeu " + danoFinal + " de dano.");
        System.out.println("vida de " + nome + ": " + vida);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNome() {
        return nome;
    }

    public int getForca() {
        return forca;
    }
}