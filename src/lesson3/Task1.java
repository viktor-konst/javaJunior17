package lesson3;

public class Task1 {
    public static void main(String[] args) {
        String sentence = "У, меня, все хорошо, замечательно, у меня все- получается!";
        StringBuilder newSentence = new StringBuilder();
        char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '-' || chars[i] == ',' || chars[i] == '!') {
                chars[i] = ' ';
            }
            newSentence.append(chars[i]);
        }

        String completedSentence = newSentence.toString();
        System.out.println(completedSentence);
    }
}
