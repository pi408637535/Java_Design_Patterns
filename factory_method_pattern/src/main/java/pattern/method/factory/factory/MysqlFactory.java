package pattern.method.factory.factory;

import pattern.method.factory.dao.MysqlUserDao;
import pattern.method.factory.dao.UserDao;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class MysqlFactory implements Factory {
    public UserDao createUserDao() {
        return new MysqlUserDao();
    }
}
