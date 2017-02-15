package pattern.abstractt.factory.factory;


import pattern.abstractt.factory.dao.UserDao;
import pattern.abstractt.factory.role.RoleDao;

/**
 * Created by piguanghua on 2017/2/15.
 */
public interface Factory {
    UserDao createUserDao();
    RoleDao createRoleDao();
}
