package proxy;

import java.lang.reflect.Proxy;

public class Client {
	
	public static void main(String [] args){
		//static proxy
        IUserDao dao1 = new UserDaoMySqlImpl();
        IUserDao dao2 = new UserDaoProxyImpl(dao1);
        dao2.addUser();
        dao2.delUser();
    }
}
