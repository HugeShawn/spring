import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @program: spring
 * @ClassName test01
 * @description:
 * @author: gaoxiang
 * @create: 2021-08-23 14:32
 * @Version 1.0
 **/
public class test01 {
    @Test
    public void testSpringJdbcTemplate(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        jdbcTemplate.update("insert into mybatis.account values(?,?) ","jack",5000);
    }
}
