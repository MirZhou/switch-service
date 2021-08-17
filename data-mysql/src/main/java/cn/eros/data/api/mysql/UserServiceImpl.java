package cn.eros.data.api.mysql;

import cn.eros.data.api.UserService;
import cn.eros.data.api.mysql.dao.UserDao;
import cn.eros.data.domain.DocumentFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>create time：2021-08-11 16:26
 *
 * @author Eros
 */
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String getById(String userId) {
        return "database: mysql count:" + this.userDao.count();
    }

    @Override
    public List<DocumentFlow> findAll() {
        return this.userDao.findAll();
    }
}
