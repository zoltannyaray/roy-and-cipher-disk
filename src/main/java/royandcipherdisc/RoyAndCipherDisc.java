package royandcipherdisc;

public class RoyAndCipherDisc {

    public String encryptMessage(String input) {
        String encryptedMessage = "";
        if (input.length() > 0) {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int previousCharIndex = 0;
            for (int i = 0; i < input.length(); i++) {
                int currentCharIndex = alphabet.indexOf(input.charAt(i));
                int charDiff = currentCharIndex - previousCharIndex;
                if (charDiff > 13) {
                    charDiff -= alphabet.length();
                } else if (charDiff < -12) {
                    charDiff += alphabet.length();
                }
                encryptedMessage = encryptedMessage + charDiff + " ";
                previousCharIndex = currentCharIndex;
            }
        }
        return encryptedMessage.trim();
    }

}
