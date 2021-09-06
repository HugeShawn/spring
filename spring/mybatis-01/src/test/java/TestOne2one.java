import com.lagou.dao.OrderDao;
import com.lagou.domain.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: spring
 * @ClassName TestOne2one
 * @description:
 * @author: gaoxiang
 * @create: 2021-09-04 00:46
 * @Version 1.0
 **/
public class TestOne2one {

    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
        List<Order> orders = orderDao.findAll();
        for (Order order : orders) {
            System.out.println(order);
        }
        sqlSession.close();
    }
}
