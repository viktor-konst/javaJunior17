package lesson3;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String sentence = "Are you ready to start studying of programming?";
        sentence = sentence.toLowerCase();

        char[] chars = {'a', 'b', 'c', 'd'};
        char[] newchars = {'q', 'w', 'e', 'r'};

        char[] charSentence = sentence.toCharArray();
        for (int i = 0; i < charSentence.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (charSentence[i] == chars[j]) {
                    charSentence[i] = newchars[j];
                }
            }
            builder.append(charSentence[i]);
        }
        String newSentence = builder.toString();
        System.out.println(newSentence);
    }
}
