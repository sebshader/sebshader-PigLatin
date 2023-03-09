import java.util.*;

public class PigLatin {
    static Set<Character> vowels;
    public PigLatin() {
        Character[] vArray = {'a', 'e', 'i', 'o', 'u'};
        vowels = new HashSet<Character>(Arrays.asList(vArray));
    }
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        char first = in.charAt(0);
        char second;
        if(in.length() == 1 || vowels.contains(first))
            return in + "way";
        second = in.charAt(1);
        if(vowels.contains(second))
            return in.substring(1) + first + "ay";
        return in.substring(2) + first + second + "ay";
    }
}
