/**
 * @Authot: Albert Akimov
 * @Date: 04.05.2021
 * @Description:
 */

public class Radio implements ElectricityConsumer {

    @Override
    public void execute() {
        System.out.println("Radio is playing music..");
    }
}
