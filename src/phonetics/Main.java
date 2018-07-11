package phonetics;

public class Main {
    public static void main(String[] args) {
        Phonetics p = new Phonetics();
        TelephonyCodeStore store = new TelephonyCodeStore();
        final char s = p.generateRandomChar();
        System.out.println(s);
        System.out.println(store.isMatch(s, "Alfa"));
    }
}
