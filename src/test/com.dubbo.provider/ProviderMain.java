import com.dubbo.service.impl.CallbackServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 01368080 on 2017/4/27.
 */
public class ProviderMain {
    public static void main(String[] args) {
        //这里注意spring配置文件的名字和路径
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-provider.xml"});
        while (true) ;
    }
}
