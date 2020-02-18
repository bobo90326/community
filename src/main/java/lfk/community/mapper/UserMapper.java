package lfk.community.mapper;

import lfk.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    @Insert("insert into user(name,account_id,token,gmt_create,gmt_modifed) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModifed})")
    void insert(User user);
}
