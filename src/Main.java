/**
 * @Authot: Albert Akimov
 * @Date: 04.05.2021
 * @Description:
 */

public class Main {

    public static void main(String[] args) {

        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        Tv tv = new Tv();

        Switcher switcher = new Switcher();

        switcher.setConsumers(lamp);
        switcher.setConsumers(radio);
        switcher.setConsumers(tv);
        switcher.setConsumers(()-> System.out.println("coffee machine on"));

        switcher.electricityOn();
    }
}
