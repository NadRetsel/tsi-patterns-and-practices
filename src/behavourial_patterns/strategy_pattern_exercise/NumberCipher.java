package behavourial_patterns.strategy_pattern_exercise;

public class NumberCipher implements CipherStrategy {
    private int shift;

    public NumberCipher(int shift)
    {
        this.shift = shift;
    }

    @Override
    public String encode(String input) {
        input = input.toLowerCase();
        String returnString = "";

        for(int i = 0; i < input.length(); i++) {
            returnString += (input.charAt(i)-this.shift);
            returnString += " ";
        }

        return returnString;
    }
}
