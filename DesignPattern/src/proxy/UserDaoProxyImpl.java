package proxy;

public class UserDaoProxyImpl implements IUserDao {

    public IUserDao userDao;
    
    public UserDaoProxyImpl(IUserDao dao){
        this.userDao = dao;
    }
    
    @Override
    public void addUser() {
        userDao.addUser();
    }

    @Override
    public void delUser() {
        userDao.delUser();
    }
}
