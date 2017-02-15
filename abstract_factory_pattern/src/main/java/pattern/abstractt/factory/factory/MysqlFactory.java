package pattern.abstractt.factory.factory;


import pattern.abstractt.factory.dao.MysqlUserDao;
import pattern.abstractt.factory.dao.UserDao;
import pattern.abstractt.factory.role.MysqlRoleDao;
import pattern.abstractt.factory.role.RoleDao;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class MysqlFactory implements Factory {
    public UserDao createUserDao() {
        return new MysqlUserDao();
    }

    @Override
    public RoleDao createRoleDao() {
        return new MysqlRoleDao();
    }
}
