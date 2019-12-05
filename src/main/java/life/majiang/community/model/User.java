package life.majiang.community.model;

import lombok.Data;

/**
 * @program: community
 * @description
 * @author: 金晓强
 * @create: 2019-12-03 17:24
 **/
@Data
public class User {

	private Integer id;
	private String name;
	private String accountId;
	private String token;
	private Long gmtCreate;
	private Long gmtModified;
	private String avatarUrl;

}
