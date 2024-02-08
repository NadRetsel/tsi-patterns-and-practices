package behavourial_patterns.strategy_pattern_exercise;

import javax.crypto.Cipher;

public class Encoder {
    public static String encodeMessage(CipherStrategy strat, String inputString) {
        return strat.encode(inputString);
    }

    public static void main(String[] args)
    {
        for(int shift = -100; shift < 100; ++shift)
        {
            // CipherStrategy strategy = new CaeserCipher(shift);
            CipherStrategy strategy = new NumberCipher(shift);

            String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890-=!@£$%^&*()_+";
            String input_encoded = encodeMessage(strategy, input);
            System.out.println("Shift " + shift + ": " + input_encoded);
        }

    }
}
