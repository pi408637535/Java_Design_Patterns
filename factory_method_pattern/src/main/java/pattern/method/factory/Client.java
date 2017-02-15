package pattern.method.factory;

import pattern.method.factory.dao.UserDao;
import pattern.method.factory.factory.Factory;
import pattern.method.factory.factory.MysqlFactory;
import pattern.method.factory.model.User;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class Client {
    public static void main(String args[]) {
        Factory factory = new MysqlFactory();
        UserDao userDao = factory.createUserDao();
        User user = new User();
        userDao.addUser(user);
    }
}
