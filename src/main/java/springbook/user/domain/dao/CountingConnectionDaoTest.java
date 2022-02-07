package springbook.user.domain.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class CountingConnectionDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
        UserDaoJdbc dao = context.getBean("userDao", UserDaoJdbc.class);

        //
        // DAO 사용 코드
        //
        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        System.out.println("Connection Counter : " + ccm.getCounter());
    }
}
