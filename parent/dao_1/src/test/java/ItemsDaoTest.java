import cn.itcast.dao.ItemsDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.itcast.domain.Items;
public class ItemsDaoTest {
@Test
public void testFindItemsById() {
//获取 spring 容器
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
//获取 Mapper
    ItemsDao itemsDao =
applicationContext.getBean(ItemsDao.class);
//调用 Mapper 方法
    Items items = itemsDao.findById(1);
    System.out.println(items);
}
}