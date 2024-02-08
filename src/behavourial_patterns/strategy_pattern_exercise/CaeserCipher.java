package behavourial_patterns.strategy_pattern_exercise;

public class CaeserCipher implements CipherStrategy {
    private int shift;

    public CaeserCipher(int shift)
    {
        this.shift = shift;
    }

    @Override
    public String encode(String input) {
        /*
        implement a caesar cipher here - where letters are shifted along x number of values in alphabet
        x can be whatever you like
        If you go beyond the end of the alphabet, you should wrap back around to the front
        e.g. 'z' on a cipher with a shift of 2 should become 'b'
         */
        input = input.toUpperCase();
        String returnString = "";

        for(char current_char : input.toCharArray()) {
            if(!Character.isAlphabetic(current_char))
            {
                returnString += current_char;
                continue;
            }

            int char_index_original = current_char - 'A';
            int char_index_shifted = (((char_index_original + this.shift) % 26) + 26) % 26; // Proper modulus i.e. no negatives
            returnString += (char)(char_index_shifted + 'A');
            returnString += " ";
        }

        return returnString;

    }
}
