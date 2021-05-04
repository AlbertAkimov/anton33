/**
 * @Authot: Albert Akimov
 * @Date: 04.05.2021
 * @Description:
 */

public class Lamp implements ElectricityConsumer{
    @Override
    public void execute() {
        System.out.println("Lamp is lighting");
    }
}
