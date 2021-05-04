import com.sun.org.apache.xpath.internal.operations.String;
import templates.TestTemplates;

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

        //Integer integer = 1;

/*        TestTemplates<Integer> testTemplates = new TestTemplates<>(integer);
        TestTemplates<String> testTemplates1 = new TestTemplates<>(new String());
        testTemplates.execute();
        testTemplates1.execute();*/

    }
}
