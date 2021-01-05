package lesson6;

public class TextUtils {
    /* 1) модификатор доступа:
    public - этот метод можно вызвать внутри всего проекта.
    protected - внутри текущего класса плюс наследникам.
    ____(packet)- внутри пакета\ папки.
    private - виден внутри одного класса.
   2)static есть или нет
   статик не указывается, когда обязательно обращение к объекту( и у него хотим узнать ответ)
   статик указывается, когда нет привязки к определленному объекту

   3) слово - возвращаемый тип или void  если его нет
   4) название метода с маленькой буквы
   5) входящие параметры в круглых скобка через запятую с указанием типа и названия переменной.
   6) тело выполнения метода

     */
    public static int countVowel(String text) {
        String s = text.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < s.length(); ++i) {
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                default:
            }
        }
        return vowelCount;
    }

    public static String coding(String text) {
        String alpabet = "abcdefgijklmnopqrstuvwxyza";
        String codingText = "";
        for (int i=0; i< text.length();i++){
            char currentCharFromText=text.charAt(i);
            int indexCharFromAlphabet=alpabet.indexOf(currentCharFromText);
            if ( indexCharFromAlphabet!= -1){
                codingText+=alpabet.charAt(indexCharFromAlphabet+1);
            } else {
                codingText+=currentCharFromText;
            }

        }
        return codingText;

    }
    public static String deCoding(String text) {
        String alpabet = "zabcdefgijklmnopqrstuvwxyza";
        String deCodingText = "";
        for (int i=0; i< text.length();i++){
            char currentCharFromText=text.charAt(i);
            int indexCharFromAlphabet=alpabet.indexOf(currentCharFromText);
            if ( indexCharFromAlphabet!= -1){
                deCodingText+=alpabet.charAt(indexCharFromAlphabet-1);
            } else {
                deCodingText+=currentCharFromText;
            }

        }
        return deCodingText;

    }


}
