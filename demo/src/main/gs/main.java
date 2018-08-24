package gs;

import gs.service.PencliStore;
import org.litespring.context.ApplicationContext;
import org.litespring.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by zhengtengfei on 2018/8/23.
 */
public class main {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("source-test.xml");
        PencliStore pencliStore = (PencliStore) context.getBean("pencliStore");
        System.out.println(pencliStore.get());
    }
}
