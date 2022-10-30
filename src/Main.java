public class Main {
    public static void main(String[] args) {

        Rationnel r1 = new Rationnel(1, 2);
        Rationnel r2 = new Rationnel(3, 4);
        r1.plus(r2);
        System.out.println(r1);

        Rationnel r3 = new Rationnel(-5, 8);
        Rationnel r4 = new Rationnel(6, 5);
        Rationnel r5 = new Rationnel(9, 10);
        r3.fois(r4);
        r3.division(r5);
        System.out.println(r3);

        Rationnel r6 = new Rationnel(9, 8);
        Rationnel r7 = new Rationnel(7, 6);
        Rationnel r8 = new Rationnel(5, 4);
        r6.division(r7);
        r6.soustraction(r8);
        System.out.println(r6);
    }
}