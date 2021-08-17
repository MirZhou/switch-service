package cn.eros.data.api.highgo;

import cn.eros.data.api.UserService;
import cn.eros.data.domain.DocumentFlow;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * <p>create time：2021-08-11 17:01
 *
 * @author Eros
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getById(String userId) {
        return "database: highgo";
    }

    @Override
    public List<DocumentFlow> findAll() {
        return Collections.emptyList();
    }
}
