public class Rationnel {

    // attributs
    private int numerateur;
    private int denominateur;

    public Rationnel(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    // methodes
    public void normalise(){
        int pgcd = pgcd(numerateur, denominateur);
        this.numerateur /= pgcd;
        this.denominateur /= pgcd;
    }
    private int pgcd(int a, int b){
        // calculer le PGCD de a et b
        int r = a % b;
        while (r != 0){
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
}
