package com.nokia;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @program: spring
 * @ClassName testDataSource
 * @description:
 * @author: gaoxiang
 * @create: 2021-08-20 11:32
 * @Version 1.0
 **/
public class testDataSource {
    @Test
    public void test() throws SQLException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
