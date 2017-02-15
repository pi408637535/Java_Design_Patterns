package pattern.method.factory.dao;

import pattern.method.factory.model.User;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class MysqlUserDao implements  UserDao {
    public void addUser(User user) {
        System.out.println("MysqlUserDao");
    }
}
