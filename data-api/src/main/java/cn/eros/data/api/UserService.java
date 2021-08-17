package cn.eros.data.api;

import cn.eros.data.domain.DocumentFlow;

import java.util.List;

/**
 * 数据层接口：用户
 * <p>create time：2021-08-11 16:26
 *
 * @author Eros
 */
public interface UserService {
    String getById(String userId);

    List<DocumentFlow> findAll();
}
