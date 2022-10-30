public class Main {
    public static void main(String[] args) {

        Rationnel r1 = new Rationnel(1, 5);
        Rationnel r2 = new Rationnel(2, 5);
        r2.plus(r1);
        System.out.println(r2);
    }
}