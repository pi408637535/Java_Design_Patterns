package pattern.abstractt.factory.role;

import pattern.abstractt.factory.model.Role;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class OracleRoleDao implements RoleDao {
    @Override
    public void addRole(Role role) {
        System.out.println("OracleRoleDao");
    }
}
