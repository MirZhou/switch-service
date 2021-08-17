package cn.eros.data.api.mysql.dao;

import cn.eros.data.domain.DocumentFlow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>create time：2021-08-11 16:55
 *
 * @author Eros
 */
@Mapper
public interface UserDao {
    @Select("SELECT COUNT(*) FROM gw_document_flow")
    int count();

    List<DocumentFlow> findAll();
}
