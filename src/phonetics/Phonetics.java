package phonetics;

import java.util.Random;

public class Phonetics {
    char generateRandomChar() {
        final char[] chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Random random = new Random();
        return chars[random.nextInt(chars.length)];
    }
}
