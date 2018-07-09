package phonetics;

import java.util.Random;

public class Phonetics {
    String generateRandomChar() {
        final char[] chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        char c = chars[random.nextInt(chars.length)];
        sb.append(c);
        String randomChar = sb.toString();
        System.out.println(randomChar);
        return randomChar;
    }
}
