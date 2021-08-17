package cn.eros.switchservice.service;

import cn.eros.data.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务层：用户
 * <p>create time：2021-08-12 16:02
 *
 * @author Eros
 */
@Service
public class UserBiz {
    @Autowired
    private UserService userService;

    public String getById(String userId) {
        return this.userService.getById(userId);
    }
}
