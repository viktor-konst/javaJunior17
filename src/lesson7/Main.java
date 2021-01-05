package lesson7;

public class Main {
    /*
    строение класса:
      пременные(поля класса или характеристики)
       конструкторы
        методы

    ПРАВИЛА ИНКАПСУЛЯЦИИ
     модификатор доступа(паблик либо прайвет либо протектед либо__)
     обязательно должен быть указан в четырех местах кода:
     перед классом, перед переменной конструктором и методом.
     Перед переменной внутри класса должны быть прайвет
     */
    public static void main(String[] args) {
        Bludo vinigred = new Bludo();
        Bludo icecream = new Bludo();
        vinigred.setName(" Зимний сад ");
        icecream.setName(" Мороженное со сливками ");
        System.out.println(icecream.getName());
        System.out.println(vinigred.getName());

    }
}
