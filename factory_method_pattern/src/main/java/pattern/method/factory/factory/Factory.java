package pattern.method.factory.factory;

import pattern.method.factory.dao.UserDao;

/**
 * Created by piguanghua on 2017/2/15.
 */
public interface Factory {
    UserDao createUserDao();
}
