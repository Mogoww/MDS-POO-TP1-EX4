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

    public void plus(Rationnel r){
        this.numerateur = this.numerateur * r.denominateur + this.denominateur * r.numerateur;
        this.denominateur = this.denominateur * r.denominateur;
        this.normalise();
    }

    public void fois(Rationnel r){
        this.numerateur = this.numerateur * r.numerateur;
        this.denominateur = this.denominateur * r.denominateur;
        this.normalise();
    }

    public void oppose(){
        this.numerateur = -this.numerateur;
    }

    public void inverse(){
        int temp = this.numerateur;
        this.numerateur = this.denominateur;
        this.denominateur = temp;
    }

    public void soustraction(Rationnel r){
        this.numerateur = this.numerateur * r.denominateur - this.denominateur * r.numerateur;
        this.denominateur = this.denominateur * r.denominateur;
        this.normalise();
    }

    public void division(Rationnel r){
        this.numerateur = this.numerateur * r.denominateur;
        this.denominateur = this.denominateur * r.numerateur;
        this.normalise();
    }

    // toString
    public String toString(){
        return this.numerateur + "/" + this.denominateur;
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
