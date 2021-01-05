package lesson6;

public class StringUtils {
    public static String revers(String text) {
        String reversText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversText += text.charAt(i);
        }
        return reversText;
    }

    public static int countSoglasnie(String text) {
        String lowCaseText = text.toLowerCase();
        int soglasnieCount = 0;
        for (int i = 0; i < lowCaseText.length(); i++) {
            switch (lowCaseText.charAt(i)) {
                case 'б':
                case 'в':
                case 'г':
                case 'д':
                case 'ж':
                case 'з':
                case 'к':
                case 'л':
                case 'м':
                case 'н':
                case 'т':
                case 'с':
                case 'п':
                case 'р':
                case 'ц':
                case 'ч':
                case 'ф':
                case 'й':
                case 'ш':
                case 'щ':
                case 'х':
                    soglasnieCount++;
                default:
            }
        }
        return soglasnieCount;
    }
}
