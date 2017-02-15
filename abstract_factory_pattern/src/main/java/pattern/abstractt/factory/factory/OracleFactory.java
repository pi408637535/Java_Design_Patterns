package pattern.abstractt.factory.factory;


import pattern.abstractt.factory.dao.OracleUserDao;
import pattern.abstractt.factory.dao.UserDao;
import pattern.abstractt.factory.role.OracleRoleDao;
import pattern.abstractt.factory.role.RoleDao;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class OracleFactory implements Factory{
    public UserDao createUserDao() {
        return new OracleUserDao();
    }

    @Override
    public RoleDao createRoleDao() {
        return new OracleRoleDao();
    }
}
