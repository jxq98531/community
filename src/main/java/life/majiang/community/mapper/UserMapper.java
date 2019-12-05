package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @program: community
 * @description
 * @author: 金晓强
 * @create: 2019-12-03 17:22
 **/
@Mapper
public interface UserMapper {

	@Insert("insert into user(name,account_id,token,gmt_create,gmt_modified,avatar_url) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
	void insert(User user);


	@Select("select * from user where token = #{token}")
	User findByToken(@Param("token") String token);

	@Select("select * from user where id = #{id}")
	User findById(@Param("id")Integer id);
}
