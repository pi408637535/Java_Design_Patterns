package pattern.abstractt.factory.dao;


import pattern.abstractt.factory.model.User;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class MysqlUserDao implements  UserDao {
    public void addUser(User user) {
        System.out.println("MysqlUserDao");
    }
}
