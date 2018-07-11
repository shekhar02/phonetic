package phonetics;

import java.util.HashMap;
import java.util.Map;

class TelephonyCodeStore {
    private Map<Character, String> telephony = new HashMap<>();

    public void init() {
        telephony.put('A', "Alfa");
        telephony.put('B', "Bravo");
        telephony.put('C', "Charlie");
        telephony.put('D', "Delta");
        telephony.put('E', "Echo");
        telephony.put('F', "Foxtrot");
        telephony.put('G', "Golf");
        // FIX like this. '' is for char. and "" is for string
        telephony.put("H", "Hotel");
        telephony.put("I", "India");
        telephony.put("J", "Juliett");
        telephony.put("K", "Kilo");
        telephony.put("L", "Lima");
        telephony.put("M", "Mike");
        telephony.put("N", "November");
        telephony.put("O", "Oscar");
        telephony.put("P", "Papa");
        telephony.put("Q", "Quebec");
        telephony.put("R", "Romeo");
        telephony.put("S", "Sierra");
        telephony.put("T", "Tango");
        telephony.put("U", "Uniform");
        telephony.put("V", "Victor");
        telephony.put("W", "Whiskey");
        telephony.put("X", "Xray");
        telephony.put("Y", "Yankee");
        telephony.put("Z", "Zulu");
        telephony.put("1", "One");
        telephony.put("2", "Two");
        telephony.put("3", "Three");
        telephony.put("4", "Four");
        telephony.put("5", "Five");
        telephony.put("6", "Six");
        telephony.put("7", "Seven");
        telephony.put("8", "Eight");
        telephony.put("9", "Nine");
        telephony.put("0", "Zero");
    }

    TelephonyCodeStore() {
        this.init();
    }

    public Map<Character, String> getTelephony() {
        return telephony;
    }

    public boolean isMatch(char code, String tel) {
        return telephony.get(code).equals(tel);
    }
}
