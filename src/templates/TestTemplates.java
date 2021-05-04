package templates;

/**
 * @Authot: Albert Akimov
 * @Date: 04.05.2021
 * @Description:
 */

public class TestTemplates<E> {

    public E x;

    public TestTemplates(E x) {
        this.x = x;
    }

    public void execute() {

        System.out.println(x);
    }
}
