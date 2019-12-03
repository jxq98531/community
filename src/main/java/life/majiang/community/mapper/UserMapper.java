package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: community
 * @description
 * @author: 金晓强
 * @create: 2019-12-03 17:22
 **/
@Mapper
public interface UserMapper {

	@Insert("insert into user(name,account_id,token,gmt_create,gmt_modified) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
	void insert(User user);



}
