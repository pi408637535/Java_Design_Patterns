package pattern.abstractt.factory;


import pattern.abstractt.factory.dao.UserDao;
import pattern.abstractt.factory.factory.Factory;
import pattern.abstractt.factory.factory.MysqlFactory;
import pattern.abstractt.factory.model.Role;
import pattern.abstractt.factory.model.User;
import pattern.abstractt.factory.role.RoleDao;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class Client {
    public static void main(String args[]) {
        Factory factory = new MysqlFactory();
        UserDao userDao = factory.createUserDao();
        User user = new User();
        userDao.addUser(user);
        RoleDao roleDao = factory.createRoleDao();
        Role role = new Role();
        roleDao.addRole(role);
    }
}
