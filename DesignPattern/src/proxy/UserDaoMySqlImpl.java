package proxy;

public class UserDaoMySqlImpl implements IUserDao {

    public void addUser() {
        System.out.println("UserDaoImpl--Mysql-addUser()");
    }

    public void delUser() {
        System.out.println("UserDaoImpl--Mysql-delUser()");
    }
}
