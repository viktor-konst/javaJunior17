package lesson3;

public class Task21 {
    public static void main(String[] args) {
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] qwer = {'q', 'w', 'e', 'r'};
        String sentence = "Are you ready to start studying of programming?";
        char[] charsFromSentence = sentence.toCharArray();
        for (int i = 0; i < charsFromSentence.length; i++) {
            char currentCharFrom = charsFromSentence[i];
            for (int j = 0; j < abcd.length; j++) {
                char currentCharFromABCD = abcd[j];
                if (currentCharFrom == currentCharFromABCD) {
                    charsFromSentence[i] = qwer[j];
                }
            }
        }
        String sentenceWhithReplaceChars = String.copyValueOf(charsFromSentence);
        System.out.println(sentenceWhithReplaceChars);
    }
}
