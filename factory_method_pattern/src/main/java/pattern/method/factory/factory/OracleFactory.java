package pattern.method.factory.factory;

import pattern.method.factory.dao.OracleUserDao;
import pattern.method.factory.dao.UserDao;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class OracleFactory implements Factory{
    public UserDao createUserDao() {
        return new OracleUserDao();
    }
}
