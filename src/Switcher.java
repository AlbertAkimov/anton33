import java.util.ArrayList;
import java.util.List;

/**
 * @Authot: Albert Akimov
 * @Date: 04.05.2021
 * @Description:
 */

public class Switcher {

    public List<ElectricityConsumer> consumers = new ArrayList<>();

    public void electricityOn() {
        System.out.println("Electricity on...");

/*        consumers.forEach(x -> {
            if(x != null)
                x.execute();
        });*/

        for (ElectricityConsumer consumer : consumers) {
            if (consumer != null)
                consumer.execute();
        }
    }

    public void setConsumers(ElectricityConsumer consumer) {
        consumers.add(consumer);
    }
}
